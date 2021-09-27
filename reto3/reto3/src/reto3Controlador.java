import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class reto3Controlador {

    String lista = "";
    String [] valor;
    int cantidad = 0;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnIngresar;

    @FXML
    private Button btnProcesar;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtMunicipio;

    @FXML
    private TextField txtCuerpo_Agua;

    @FXML
    private TextField txtTipo_Agua;

    @FXML
    private TextField txtIRCA;

    @FXML
    private TextArea txtAreaEntrada;

    @FXML
    private TextArea txtAreaSalida;

    @FXML
    private TextArea txtAreaEntrada11;

    @FXML
    private TextArea txtAreaSalida11;

    @FXML
    void ingresar(ActionEvent event) {

        //Captura datos
        String nombre = txtNombre.getText(); 
        int id = Integer.parseInt(txtId.getText());
        String municipio = txtMunicipio.getText(); 
        String tipo_agua = txtTipo_Agua.getText();
        String tipo_cuerpos = txtCuerpo_Agua.getText();
        Double IRCA = Double.parseDouble(txtIRCA.getText());

        //Contador para agregar cada ingreso
        lista += nombre + " " + id + " " + municipio + " " + tipo_agua + " " + tipo_cuerpos + " " + IRCA + "\n";
        
        //Limpiar Campos
        txtNombre.setText("");
        txtId.setText("");
        txtMunicipio.setText("");
        txtTipo_Agua.setText("");
        txtCuerpo_Agua.setText("");
        txtIRCA.setText("");
       
        valor = lista.split("\n");
        cantidad = valor.length;

        txtAreaEntrada.setText(lista);
    }

    @FXML
    void procesar(ActionEvent event) {

        Double menor;
        int menores = 0;
        String total = "", cuerpos = "";
        
        String variable[] = txtAreaEntrada.getText().split("\n");

        CuerpoDeAgua longitud[] = new CuerpoDeAgua[variable.length];

        for(int i=0; i<variable.length; i++){ 
            String[] lectura = variable[i].split(" ");

            String nombre = lectura[0];
            int id = Integer.parseInt(lectura[1]);
            String municipio = lectura[2];
            String tipo_agua = lectura[3];
            String tipo_cuerpos = lectura[4];
            Double IRCA = Double.parseDouble(lectura[5]);

            longitud[i] = new CuerpoDeAgua(nombre, id, municipio, tipo_agua, tipo_cuerpos, IRCA);
            String nombres = (longitud[i].getNombre() + " " + String.format("%.2f",longitud[i].getIRCA()) + "\n");
            total += nombres;

            if (longitud[i].getIRCA() <=50){
                menores ++;
            } 
            if (longitud[i].nivel() == "BAJO"){
                cuerpos += (longitud[i].getNombre() + " ");
            }
        }

        if (cuerpos == ""){
            cuerpos = "NA";
        }

        CuerpoDeAgua Menor = longitud[0];
        menor = Menor.getIRCA();

        for (int i = 0; i < cantidad; i++){
            if (longitud[i].getIRCA() < menor){
                menor = longitud[i].getIRCA();
            }
        }
        txtAreaEntrada.setText(" ");
        txtAreaSalida.setText(total +  menores + "\n" + cuerpos + "\n" + (String.format("%.2f",menor))); 
        txtAreaEntrada.setText(variable.length + "\n"+ lista);
    }
    
    @FXML
    void initialize() {
        
    }
}
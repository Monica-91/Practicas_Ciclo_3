
import java.util.Scanner;

public class reto3{
    public static void main(String[] args) throws Exception {
        
        Scanner lectura = new Scanner(System.in);

        String cant, nombre, municipio, tipo_agua, tipo_cuerpos, datos, resultado1 = "", cuerpos = "";
        int cantidad, id;
        Double IRCA, menor, menores = 0.00;
        
        System.out.print("");
        cant = lectura.nextLine();
        cantidad = Integer.parseInt(cant);
      
        CuerpoDeAgua longitud[] = new CuerpoDeAgua[cantidad];

        for (int x = 0; x < cantidad; x++){
            System.out.print("");
            datos = lectura.nextLine();
            String lista[] = datos.split(" ");
            nombre = lista[0];
            id = Integer.parseInt(lista[1]);
            municipio = lista[2];
            tipo_agua = lista[3];
            tipo_cuerpos = lista[4];
            IRCA = Double.parseDouble(lista[5]);
            
            longitud[x] = new CuerpoDeAgua(nombre, id, municipio, tipo_agua, tipo_cuerpos, IRCA);
            resultado1 += (longitud[x].getNombre() + " " + String.format("%.2f",longitud[x].getIRCA()) + "\n");
        }

        //Cantidad de Cuerpos de Agua con clasificacion menor a 50
        for (int z = 0; z < cantidad; z++){
            if (longitud[z].getIRCA() <= 50){
                menores ++;
            }
        //Cuerpos de Agua con Nivel de Riesgo Bajo
            if (longitud[z].nivel() == "BAJO"){
                cuerpos += (longitud[z].getNombre() + " ");
            }
        }

        if (cuerpos == ""){
            cuerpos = "NA";
        }
        
        //Clasificación IRCA mas baja
        CuerpoDeAgua Menor = longitud[0];
        menor = Menor.getIRCA();

        for (int i = 0; i < cantidad; i++){
            if (longitud[i].getIRCA() < menor){
                menor = longitud[i].getIRCA();
            }
        }

        //Salida Esperada
        System.out.print(resultado1);
        System.out.println(String.format("%.2f",menores));
        System.out.println(cuerpos);
        System.out.print(String.format("%.2f",menor));
      
        lectura.close();

    }
}
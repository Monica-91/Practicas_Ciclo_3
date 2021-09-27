public class CuerpoDeAgua extends ObjetoGeografico{
    private String Tipo_agua;
    private String Tipo_cuerpo;
    private Double IRCA;
    

    //Metodo Constructor CuerpoDeAgua
    public CuerpoDeAgua (String Nombre, int Id, String Municipio, String Tipo_agua, String Tipo_cuerpo, Double IRCA){
        super(Nombre, Id, Municipio);
        this.Tipo_agua = Tipo_agua;
        this.Tipo_cuerpo = Tipo_cuerpo;
        this.IRCA = IRCA;
    }

    //Set and Get
    public String getTipo_agua() {
        return this.Tipo_agua;
    }
    public void setTipo_agua(String tipo_agua) {
        this.Tipo_agua = tipo_agua;
    }


    public String getTipo_cuerpo() {
        return this.Tipo_cuerpo;
    }
    public void setTipo_cuerpo(String tipo_cuerpo) {
        this.Tipo_cuerpo = tipo_cuerpo;
    }


    public Double getIRCA() {
        return this.IRCA;
    }
    public void setIRCA(Double IRCA) {
       this.IRCA = IRCA;
    }


    //Metodo Nivel
    public String nivel(){
        if (IRCA >= 80.1 && IRCA <= 100){
            return ("INVIABLE SANITARIAMENTE");
        }
        else if (IRCA >= 35.1 && IRCA < 80.1){
            return ("ALTO");
        }
        else if (IRCA >= 14.1 && IRCA < 35.1){
            return ("MEDIO");
        }
        else if (IRCA >= 5.1 && IRCA < 14.1){
           return ("BAJO");
        }
        else if (IRCA >= 0 && IRCA < 5.1){
            return ("SIN RIESGO");
        }
        return nivel();
    }
}
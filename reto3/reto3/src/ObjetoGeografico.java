public class ObjetoGeografico {
    private String Nombre;
    private int Id;
    private String Municipio;

    //Metodo Constructor ObjetoGeografico
    public ObjetoGeografico(String Nombre, int Id, String Municipio){
        this.Nombre = Nombre;
        this.Id = Id;
        this.Municipio = Municipio;
    }

    //Get and Set
    public String getNombre() {
        return this.Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }


    public int getId() {
        return this.Id;
    }
    public void setId(int id) {
        this.Id = id;
    }


    public String getMunicipio() {
        return this.Municipio;
    }
    public void setMunicipio(String municipio) {
        this.Municipio = municipio;
    }
}
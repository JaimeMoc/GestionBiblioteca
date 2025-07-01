package modules;

abstract class Usuario {
    private int id;
    private String correo;
    private String rol;

    // Constructor usuario
    protected Usuario (int id, String correo, String rol){
        this.id = id;
        this.correo = correo;
        this.rol = rol;
    }

    // Métodos setters y getters para id, correo y rol.
    public int getId(){return id;}
    public void setId(int Id) {this.id = id;}

    public String getCorreo() {return correo;}
    public void setCorreo( String correo ) {this.correo = correo;}

    public String getRol(){ return rol;}
    public void setRol(String rol) {this.rol = rol;}
}

package modules;

import java.util.Date;

abstract class MaterialBibliografico {

    private String nombre;
    private int id;
    private int codigo;
    private Date fechaRegistro;

    protected MaterialBibliografico (String nombre, int id, int codigo, Date fechaRegistro){
        this.nombre = nombre;
        this.id = id;
        this.codigo = codigo;
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public int getId(){return id;}
    public void setId(int id){this.id = id;}

    public int getCodigo(){return codigo;}
    public void setCodigo(int codigo){this.codigo = codigo;}

    public Date getFechaRegistro(){return fechaRegistro;}
    public void setFechaRegistro(Date fechaRegistro){this.fechaRegistro = fechaRegistro;}

    public void mostrarMaterial(){
        System.out.println("Es (revista, periodico o libro)");
    }

}

package modules;

import java.util.Date;

public class Revista extends MaterialBibliografico {
    private Date fecha;
    private int numeroEdicion;
    private String seccion;
    private boolean disponible;

    public Revista (String nombre, int id, int codigo, Date fechaRegistro, Date fecha, int numeroEdicion, String seccion, boolean disponible){
        super (nombre, id, codigo, fechaRegistro);
        this.fecha = fecha;
        this.numeroEdicion = numeroEdicion;
        this.seccion = seccion;
        this.disponible = disponible;
    }

    public Date getFecha(){return fecha;}
    public void setFecha(Date fecha){this.fecha = fecha;}

    public int getNumeroEdicion(){return numeroEdicion;}
    public void setNumeroEdicion(int numeroEdicion){this.numeroEdicion = numeroEdicion;}

    public String getSeccion(){return seccion;}
    public void setSeccion(String seccion){this.seccion = seccion;}

    public boolean getDisponible(){return disponible;}
    public void setDisponible(boolean disponible){this.disponible = disponible;}

    public void mostrarTitulo(){
        System.out.println("El titulo de la revista es: " + getNombre());
    }

    public void filtrarArticulo(){
        System.out.println("El articulo que estas leyendo es de la sección: " + this.seccion);
    }
}

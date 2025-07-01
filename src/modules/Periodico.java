package modules;

import java.util.Date;

public class Periodico extends MaterialBibliografico{
    private String isbn;
    private int volumen;
    private int numero;
    private String editorial;
    private String formato;
    private String periodicidad;

    public Periodico (String nombre, int id, int codigo, Date fechaRegistro, String isbn, int volumen, int numero, String editorial, String formato, String periodicidad){
        super (nombre, id, codigo, fechaRegistro);
        this.isbn = isbn;
        this.volumen = volumen;
        this.numero = numero;
        this.editorial = editorial;
        this.formato = formato;
        this.periodicidad = periodicidad;
    }

    public String getIsbn(){return isbn;}
    public void setIsbn(String isbn){this.isbn = isbn;}

    public int getVolumen(){return volumen;}
    public void setVolumen(int volumen){this.volumen = volumen;}

    public int getNumero(){return numero;}
    public void setNumero(int numero){this.numero = numero;}

    public String getEditorial(){return editorial;}
    public void setEditorial(String editorial){this.editorial = editorial;}

    public String getFormato(){return formato;}
    public void setFormato(String formato){this.formato = formato;}

    public String getPeriodicidad(){return periodicidad;}
    public void setPeriodicidad(String periodicidad){this.periodicidad = periodicidad;}

    public void verResumen(){
        System.out.println("Estas viendo el resumen del periodico " + getNombre());
    }

    public void citarArticulo(){
        System.out.println("Estas citando al artículo: " + getNombre());
    }

    public void verEditorial(){
        System.out.println("Estas viendo la editorial: " + this.editorial);
    }

    public void consultarNumero(){
        System.out.println("El numero del periodico es: " + this.numero);
    }
}

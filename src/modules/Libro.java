package modules;

import java.util.Date;

public class Libro extends MaterialBibliografico {
    private String isbn;
    private int numeroPaginas;
    private String autor;
    private String genero;
    private String formato;

    public Libro (String nombre, int id, int codigo, Date fechaRegistro, String isbn, int numeroPaginas, String autor, String genero, String formato){
        super (nombre, id, codigo, fechaRegistro);
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.genero = genero;
        this.formato = formato;
    }

    public String getIsbn(){return isbn;}
    public void setIsbn(String isbn){this.isbn = isbn;}

    public int getNumeroPaginas(){return numeroPaginas;}
    public void setNumeroPaginas(int numeroPaginas){this.numeroPaginas = numeroPaginas;}

    public String getAutor(){return autor;}
    public void setAutor(String autor){this.autor = autor;}

    public String getGenero(){return genero;}
    public void setGenero(String genero){this.genero = genero;}

    public String getFormato(){return formato;}
    public void setFormato(String formato){this.formato = formato;}

    public void obtenerPaginas(int pagina){
        System.out.println("Estas en la página " + pagina + "del libro " + getNombre());
    }

    public void copiarPagina(int pagina) {
        System.out.println("Estas copiando de la página " + pagina + "del libro " + getNombre());
    }
}

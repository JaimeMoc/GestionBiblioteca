package modules;

import java.util.Date;

public class Main {

    public static void main (String [] args){
        Biblioteca biblioteca = new Biblioteca();

        Libro libro = new Libro("Cien Años de Soledad", 1, 1001, new Date(),
                "123456", 300, "Gabriel García Márquez", "Realismo Mágico", "Físico");

        Revista revista = new Revista("National Geographic", 2, 1002, new Date(),
                new Date(), 215, "Ciencia", true);

        Periodico periodico = new Periodico("La Jornada", 3, 1003, new Date(),
                "998877", 2, 45, "La Jornada", "Digital", "Diario");

        biblioteca.agregarMaterial(libro);
        biblioteca.agregarMaterial(revista);
        biblioteca.agregarMaterial(periodico);

        MaterialBibliografico resultado = biblioteca.buscarPorNombre("La jornada");
        if (resultado != null){
            System.out.println("Encontrado: " + resultado.getNombre());
        }
    }
}

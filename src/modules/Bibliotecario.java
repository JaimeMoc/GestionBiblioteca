package modules;

public class Bibliotecario extends Usuario{

    protected Bibliotecario (int id, String correo, String rol){
        super (id, correo, rol);
    }

    public void agregarMaterial(String nombre){
        System.out.println("Se esta agregando el material con nombre: " + nombre);
    }

    public void eliminarMaterial(String nombre){
        System.out.println("Se elimino el material con nombre: " + nombre);
    }

    public void editarMaterial(String nombre){
        System.out.println("Se edito el material con nombre:" + nombre);
    }

    public void añadirReporte(String nombre, int id){
        System.out.println("Se añadio un reporte con el nombre de: " + nombre + " y con un id: " + id );
    }
}

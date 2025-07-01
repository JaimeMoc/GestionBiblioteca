package modules;

import java.time.LocalDateTime;

public class Estudiante extends Usuario {

    public Estudiante (int id, String correo, String rol){
        super (id, correo, rol);
    }

    protected class InformacionBasica {
        private String nombre;
        private String apellidos;
        private String fechaNacimiento;

        public String getNombre(){return nombre;}
        public void setNombre(String nombre){this.nombre = nombre;}

        public String getApellidos(){return apellidos;}
        public void setApellidos(String apellidos){this.apellidos = apellidos;}

        public String getFechaNacimiento(){return fechaNacimiento;}
        public void setFechaNacimiento(String fechaNacimiento){this.fechaNacimiento = fechaNacimiento;}
    }

    protected class InformacionRegistro {
        private LocalDateTime fechaRegistro;
        private String ciclo;
        private boolean estado;

        public LocalDateTime getFechaRegistro(){return fechaRegistro;}
        public void setFechaRegistro(LocalDateTime fechaRegistro) {this.fechaRegistro;}

        public String getCiclo() {return ciclo;}
        public void setCiclo(String ciclo){this.ciclo = ciclo;}

        public boolean getEstado() {return estado;}
        public void setEstado (boolean estado) {this.estado = estado;}
    }

    // métodos propios:

    public static void solicitarPrestamo (int id, String nombre){
        System.out.println( nombre + " quiere realizar un prestamo, bajo el id: " + id);
    }

    public static void renovarPrestamo (String nombre){
        System.out.println("El usuario " + nombre + " esta renovando el prestamo del libro con id: ");
    }

    public static void devolverPrestamo (String nombre){
        System.out.println("El usuario " + nombre + " esta devolviendo el prestamo con el id:");
    }

}

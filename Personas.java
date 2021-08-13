package geters;

public class Personas {

    private String nombre, cedula;
    private int edad;

    public Personas(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String mostarDatos() {

        return "Cedula: " + cedula + "\nNombre: " + nombre + "\nEdad: " + edad;

    }
}

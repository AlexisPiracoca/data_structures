package model;
/**
 *
 * @author Jhon Alexis
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "; Apellido: " + this.apellido + "; Telefono: " + this.telefono;
    }
}

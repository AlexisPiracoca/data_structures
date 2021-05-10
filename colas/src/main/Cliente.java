package main;
/**
 *
 * @author Jhon Alexis
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int numero;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nClientes = " +
                "Nombre: " + nombre + " | " +
                "Apellido: " + apellido + " | " +
                "Numero: " + numero + " || " ;
    }
}

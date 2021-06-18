package model;
import java.util.ArrayList;
/**
 *
 * @author Jhon Alexis Piracoca Arcos
 */
public class Cliente extends Usuario {
    private ArrayList<Tiquete> tiquetes;

    public Cliente(ArrayList<Tiquete> tiquetes) {
        this.tiquetes = tiquetes;
    }

    public ArrayList<Tiquete> getTiquetes() {
        return tiquetes;
    }

    public void setTiquetes(ArrayList<Tiquete> tiquetes) {
        this.tiquetes = tiquetes;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getCorreo() {
        return correo;
    }

    @Override
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String getContraseña() {
        return contraseña;
    }

    @Override
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Lista de Clientes: "
                + "Nombre: "+ super.nombre + " || "
                + "Apellido: "+ super.apellido+" || "
                + "Correo: "+ super.correo+" || "
                + "Telefono: "+super.telefono;


    }
}

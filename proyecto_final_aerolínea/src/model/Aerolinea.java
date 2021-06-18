package model;
import java.util.ArrayList;
/**
 *
 * @author Jhon Alexis Piracoca Arcos
 */
public class Aerolinea extends Usuario {
    private ArrayList<Vuelo> lista_vuelos;
    private ArrayList<Cliente> lista_clientes;

    public Aerolinea(ArrayList<Vuelo> lista_vuelos, ArrayList<Cliente> lista_clientes) {
    }

    public Aerolinea() {
        this.lista_vuelos = lista_vuelos;
        this.lista_clientes = lista_clientes;
    }

    public ArrayList<Vuelo> getListavuelos() {
        return lista_vuelos;
    }

    public void setListavuelos(ArrayList<Vuelo> listavuelos) {
        this.lista_vuelos = listavuelos;
    }

    public ArrayList<Cliente> getListaclientes() {
        return lista_clientes;
    }

    public void setListaclientes(ArrayList<Cliente> listaclientes) {
        this.lista_clientes = listaclientes;
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
}

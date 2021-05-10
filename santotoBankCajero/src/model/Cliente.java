package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Cliente extends Cuenta{
    private int id;
    private String nombre;
    private String apellido;
    private int cedula;
    List<Cuenta>cuentas;

    public Cliente() {
        cuentas = new ArrayList<Cuenta>();
    }

    public Cliente(int id, String nombre, String apellido, int cedula, int numero_cuenta, double saldo, int clave) {
        super(numero_cuenta, saldo, clave);
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Id: " + id + " || " +
               "Nombre: " + nombre + " || " +
               "Apellido: " + apellido + " || " +
               "Cedula: " + cedula + " || " +
               super.toString() + "\n";
    }
}

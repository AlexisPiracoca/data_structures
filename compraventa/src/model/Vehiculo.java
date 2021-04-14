package model;
/**
 *
 * @author Jhon Alexis
 */
public class Vehiculo {
    private int id;
    private double precio;
    private String tipoCombustible;
    private int modelo;
    private String estado;

    public Vehiculo() {}

    public Vehiculo(int id, double precio, String tipoCombustible, int modelo, String estado) {
        this.id = id;
        this.precio = precio;
        this.tipoCombustible = tipoCombustible;
        this.modelo = modelo;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Id: " + id + " || "+
               "Precio: " + precio + " || "+
               "Tipo de Combustible: " + tipoCombustible + " || "+
               "Modelo: " + modelo + " || "+
               "Estado: " + estado;
    }
}

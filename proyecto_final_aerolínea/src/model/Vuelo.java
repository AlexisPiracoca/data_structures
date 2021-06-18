package model;

import java.util.ArrayList;
/**
 *
 * @author Jhon Alexis Piracoca Arcos
 */
public class Vuelo {
    private String horasalida;
    private String horallegada;
    private String origen;
    private String destino;
    private double precio;

    public Vuelo() {
    }

    public Vuelo(String horasalida, String horallegada, String origen, String destino, double precio) {
        this.horasalida = horasalida;
        this.horallegada = horallegada;
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }

    public Vuelo(ArrayList<Vuelo> listavuelos) {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(String horasalida) {
        this.horasalida = horasalida;
    }

    public String getHorallegada() {
        return horallegada;
    }

    public void setHorallegada(String horallegada) {
        this.horallegada = horallegada;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Vuelos: "
                + "Hora Salida: " + horasalida + " || "
                + "Hora de Llegada: " + horallegada + " || "
                + "Origen: " + origen + " || "
                + "Destino: " + destino + " || "
                + "Precio: " + precio;
    }
}

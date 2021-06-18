package model;
import java.util.ArrayList;
/**
 *
 * @author Jhon Alexis Piracoca Arcos
 */
public class Tiquete extends Asiento {
    private double precio;
    private ArrayList<Asiento> asientoscomprados;
    private double pesoequpaje;
    private int cantidadequipaje;
    private Vuelo vuelo;

    public Tiquete(ArrayList<Asiento> tiquete) {
    }

    public Tiquete(ArrayList< Asiento> asientoscomprados, double pesoequpaje, int cantidadequipaje, Vuelo vuelo) {
        this.asientoscomprados = asientoscomprados;
        this.pesoequpaje = pesoequpaje;
        this.cantidadequipaje = cantidadequipaje;
        this.vuelo = vuelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Asiento> getAsientoscomprados() {
        return asientoscomprados;
    }

    public void setAsientoscomprados(ArrayList<Asiento> asientoscomprados) {
        this.asientoscomprados = asientoscomprados;
    }

    public double getPesoequpaje() {
        return pesoequpaje;
    }

    public void setPesoequpaje(double pesoequpaje) {
        this.pesoequpaje = pesoequpaje;
    }

    public int getCantidadequipaje(int n_maletas) {
        return cantidadequipaje;
    }

    public void setCantidadequipaje(int cantidadequipaje) {
        this.cantidadequipaje = cantidadequipaje;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public String toString() {
        return "Tiquete: "
                + "Precio: " + precio + " || "
                + "Cantida de Equipaje: " + cantidadequipaje + " || "
                + "Peso Equpaje: " + pesoequpaje;
    }
}

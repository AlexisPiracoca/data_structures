package model;
/**
 *
 * @author Jhon Alexis
 */
public class Particular extends Vehiculo {
    private int numPuertas;
    private String color;
    private String tipoMotor;

    public Particular() {
        super();
    }

    public Particular(int id, double precio, String tipoCombustible, int modelo, String estado, int numPuertas, String color, String tipoMotor) {
        super(id, precio, tipoCombustible, modelo, estado);
        this.numPuertas = numPuertas;
        this.color = color;
        this.tipoMotor = tipoMotor;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return "Vehiculo Particulares: " +
                super.toString() +
                "Numero de puertas: " + numPuertas + " || "+
               "Color: " + color + " || "+
               "Tipo de motor: " + tipoMotor;
    }
}

package model;
/**
 *
 * @author Jhon Alexis
 */
public class Publico extends Vehiculo {
    private int capacidad;
    private String tipo;
    private boolean cupo;

    public Publico() {
        super();
    }

    public Publico(int id, double precio, String tipoCombustible, int modelo, String estado, int capacidad, String tipo, boolean cupo) {
        super(id, precio, tipoCombustible, modelo, estado);
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.cupo = cupo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isCupo() {
        return cupo;
    }

    public void setCupo(boolean cupo) {
        this.cupo = cupo;
    }

    @Override
    public String toString() {
        return "Vehiculos Publicos: " +
                super.toString() +
               "Capacidad: "+ capacidad + " || "+
               "Tipo: " + tipo + " || "+
               "Cupo: " + cupo;
    }
}

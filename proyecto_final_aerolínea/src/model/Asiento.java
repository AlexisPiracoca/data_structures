package model;
/**
 *
 * @author Jhon Alexis Piracoca Arcos
 */
public class Asiento {
    private String idasiento;
    private boolean ocupado;
    private String nombrepasajero;
    private long idpasajero;

    public Asiento() {
    }

    public Asiento(String idasiento, boolean ocupado, String nombrepasajero, long idpasajero) {
        this.idasiento = idasiento;
        this.ocupado = ocupado;
        this.nombrepasajero = nombrepasajero;
        this.idpasajero = idpasajero;
    }

    public String getIdasiento() {
        return idasiento;
    }

    public void setIdasiento(String idasiento) {
        this.idasiento = idasiento;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getNombrepasajero() {
        return nombrepasajero;
    }

    public void setNombrepasajero(String nombrepasajero) {
        this.nombrepasajero = nombrepasajero;
    }

    public long getIdpasajero() {
        return idpasajero;
    }

    public void setIdpasajero(long idpasajero) {
        this.idpasajero = idpasajero;
    }

    @Override
    public String toString() {
        return "Asiento: "
                + "Id Asiento: " + idasiento + " || "
                + "Ocupado: " + ocupado + " || "
                + "Nombre Pasajero: " + nombrepasajero + " || "
                + "Id Pasajero: " + idpasajero;
    }
}

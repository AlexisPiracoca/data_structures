package main;
/**
 *
 * @author Jhon Alexis
 */
public class Ficha {
    private String color;
    private int numero;

    public Ficha() {
    }

    public Ficha(String color, int numero) {
        this.color = color;
        this.numero = numero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Fichas = " +
               "Color: " + color + " " +
               "Numero: " + numero + " || " ;
    }
}

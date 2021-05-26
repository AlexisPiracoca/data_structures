package model;
/**
 *
 * @author Jhon Alexis
 */
public class Edge {
    private Node mayor;
    private Node menor;
    private int edad;

    public Edge(Node origin, Node destination, int edad) {
        this.mayor = origin;
        this.menor = destination;
        this.edad = edad;
    }

    public Node getMayor() {
        return mayor;
    }

    public void setMayor(Node mayor) {
        this.mayor = mayor;
    }

    public Node getMenor() {
        return menor;
    }

    public void setMenor(Node menor) {
        this.menor = menor;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\n EDGE " +
                "Mayor: " + mayor.getNombre() + " || " +
                "Menor: " + menor.getNombre() + " || " +
                "Edad: " + edad ;
    }
}

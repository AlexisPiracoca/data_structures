package model;
/**
 *
 * @author Jhon Alexis Piracoca Arcos
 */
public class Edge {
    private Node ciudad_1;
    private Node ciudad_2;
    private int distancia;

    public Edge(Node origin, Node destination, int edad) {
        this.ciudad_1 = origin;
        this.ciudad_2 = destination;
        this.distancia = edad;
    }

    public Node getMayor() {
        return ciudad_1;
    }

    public void setMayor(Node mayor) {
        this.ciudad_1 = mayor;
    }

    public Node getCiudad_2() {
        return ciudad_2;
    }

    public void setCiudad_2(Node ciudad_2) {
        this.ciudad_2 = ciudad_2;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "\n RUTA: " +
                "Ciudad de origen: " + ciudad_1.getNombre() + " || " +
                "Ciudad de destino : " + ciudad_2.getNombre() + " || " +
                "Distancia: " + distancia;
    }
}

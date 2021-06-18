package model;
/**
 *
 * @author Jhon Alexis Piracoca Arcos
 */
import java.util.ArrayList;
import java.util.List;

    public class Node {
        private String nombre;
        private List<Edge> edges;

        public Node() {
        }

        public Node(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public List<Edge> getEdges() {
            return edges;
        }

        public void addEdge(Edge edge) {
            if (edges == null) {
                edges = new ArrayList<>();
            }
            edges.add(edge);
        }

        public Edge findEdge() {
            Edge Edge_Mayor = new Edge(null,null,0);
            if(edges != null){
                for(Edge edge:edges){
                    if (Edge_Mayor.getDistancia()<edge.getDistancia()){
                        Edge_Mayor = edge;
                    }
                }
            }
            return Edge_Mayor;
        }

        @Override
        public String toString() {
            return "\nRUTAS " +
                    "Ciudad: " + nombre + " || " +
                    " " + edges ;
        }
    }

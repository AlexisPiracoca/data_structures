package model;
/**
 *
 * @author Jhon Alexis Piracoca Arcos
 */
import java.util.ArrayList;
import java.util.List;

    public class Graph {
        private List<Node> nodes;
        private Node current;

        public void addNode(Node node) {
            if (nodes == null) {
                nodes = new ArrayList<>();
            }
            nodes.add(node);
        }

        public List<Node> getNodes() {
            return nodes;
        }

    public List<Node> Mostrar_nodes(){
        current = nodes.get(1);
        while (current!=null){
            System.out.println(current);
            if (current.getEdges()!=null) {
                current = current.getEdges().get(0).getCiudad_2();
            }else {
                current=null;
                }
            }
        return null;
    }

    public Node Nodo_Mayor(List<Node> nodes){
            Node Nodo_Mayor = new Node(null);
            Nodo_Mayor.addEdge(new Edge(null,null,0));
            for (Node node:nodes){
                if(Nodo_Mayor.findEdge().getDistancia()<node.findEdge().getDistancia()){
                    Nodo_Mayor = node;
                }
            }
            return Nodo_Mayor;
        }

        @Override
        public String toString() {
            return "Graph nodes: " + nodes + " ";
        }

    }

package model;
/**
 *
 * @author Jhon Alexis
 */
public class Main {

    public static void main(String[] args) {
        Graph graph = getCities();
        /*System.out.println(graph);
         */
       //graph.Mostrar_nodes();
        System.out.println("Nodos mayores con arco: ");
        System.out.println(graph.Nodo_Mayor(graph.getNodes()));
    }

    public static Graph getCities() {
        Node n1 = new Node("Jesus");
        Node n2 = new Node("Claudia");
        Node n3 = new Node("Virginia");
        Node n4 = new Node("Cristian");
        Node n5 = new Node("Obdulia");
        Node n6 = new Node("Luis");
        Node n7 = new Node("Mauricio");
        Node n8 = new Node("Maria");
        Node n9 = new Node("Camila");
        Node n10 = new Node("Liliana");

        n1.addEdge(new Edge(n1, n2, 2));
        n1.addEdge(new Edge(n1, n3, 4));
        n1.addEdge(new Edge(n1, n4, 12));
        n1.addEdge(new Edge(n1, n5, 5));
        n1.addEdge(new Edge(n1, n6, 7));
        n1.addEdge(new Edge(n1, n7, 9));
        n1.addEdge(new Edge(n1, n8, 1));
        n1.addEdge(new Edge(n1, n9, 14));
        n1.addEdge(new Edge(n1, n10, 12));

        n2.addEdge(new Edge(n2, n3, 4));
        n2.addEdge(new Edge(n2, n4, 3));
        n2.addEdge(new Edge(n2, n5, 12));
        n2.addEdge(new Edge(n2, n6, 2));
        n2.addEdge(new Edge(n2, n7, 6));
        n2.addEdge(new Edge(n2, n8, 8));
        n2.addEdge(new Edge(n2, n9, 9));
        n2.addEdge(new Edge(n2, n10, 2));

        n3.addEdge(new Edge(n3, n4, 3));
        n3.addEdge(new Edge(n3, n5, 7));
        n3.addEdge(new Edge(n3, n6, 5));
        n3.addEdge(new Edge(n3, n7, 4));
        n3.addEdge(new Edge(n3, n8, 2));
        n3.addEdge(new Edge(n3, n9, 8));
        n3.addEdge(new Edge(n3, n10, 9));

        n4.addEdge(new Edge(n4, n5, 1));
        n4.addEdge(new Edge(n4, n6, 4));
        n4.addEdge(new Edge(n4, n7, 3));
        n4.addEdge(new Edge(n4, n8, 7));
        n4.addEdge(new Edge(n4, n9, 8));
        n4.addEdge(new Edge(n4, n10, 12));

        n5.addEdge(new Edge(n5, n6, 10));
        n5.addEdge(new Edge(n5, n7, 14));
        n5.addEdge(new Edge(n5, n8, 4));
        n5.addEdge(new Edge(n5, n9, 7));
        n5.addEdge(new Edge(n5, n10, 5));

        n6.addEdge(new Edge(n6, n7, 2));
        n6.addEdge(new Edge(n6, n8, 7));
        n6.addEdge(new Edge(n6, n9, 1));
        n6.addEdge(new Edge(n6, n10, 8));

        n7.addEdge(new Edge(n7, n8, 23));
        n7.addEdge(new Edge(n7, n9, 21));
        n7.addEdge(new Edge(n7, n10, 14));

        n8.addEdge(new Edge(n8, n9, 18));
        n8.addEdge(new Edge(n8, n10, 12));

        n9.addEdge(new Edge(n9, n10, 7));

        Graph graph = new Graph();
        graph.addNode(n1);
        graph.addNode(n2);
        graph.addNode(n3);
        graph.addNode(n4);
        graph.addNode(n5);
        graph.addNode(n6);
        graph.addNode(n7);
        graph.addNode(n8);
        graph.addNode(n9);
        return graph;
    }

}







package view;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author Jhon Alexis Piracoca Arcos 
 */
public class Main {
    Aerolinea saint_tomas;

    static Cliente nuevo_Cliente(ArrayList<Tiquete> listatiquetescliente) {
        Scanner sc = new Scanner(System.in);;
        Cliente cl = new Cliente(listatiquetescliente);
        System.out.println("Ingrese el id ");
        long id = sc.nextLong();
        cl.setId(id);
        System.out.println("Ingrese su nombre ");
        String nombre = sc.next();
        cl.setNombre(nombre);
        System.out.println("Ingrese su apellido ");
        String apellido = sc.next();
        cl.setApellido(apellido);
        System.out.println("Ingrese el correo");
        String correo = sc.next();
        cl.setCorreo(correo);
        System.out.println("Ingrese el telefono");
        String telefono = sc.next();
        cl.setTelefono(telefono);
        System.out.println("SE HA REGISTRADO SU CLIENTE EXITOSAMENTE");
        return cl;
    }
    static Vuelo nuevo_Vuelo(ArrayList<Vuelo> listavuelo) {
        Scanner sc = new Scanner(System.in);
        Vuelo vu = new Vuelo(listavuelo);
        System.out.println("Ingrese hora de salida");
        String hora = sc.next();
        vu.setHorasalida(hora);
        System.out.println("Ingrese hora de regreso");
        String hora1 = sc.next();
        vu.setHorallegada(hora1);
        System.out.println("Ingrese la ciudad de origen");
        String ciudad1 = sc.next();
        vu.setOrigen(ciudad1);
        System.out.println("Ingrese la ciudad de destino");
        String ciudad2 = sc.next();
        vu.setDestino(ciudad2);
        System.out.println("Ingrese el precio del vuelo");
        double precio = sc.nextDouble();
        vu.setPrecio(precio);
        System.out.println("SE HA REGISTRADO SU VUELO EXITOSAMENTE");
        return vu;
    }
    static Asiento crear_tiquete(ArrayList<Asiento> listatiquete) {
        Scanner sc = new Scanner(System.in);
        Tiquete tq = new Tiquete(listatiquete);
        System.out.println("Ingrese precio del tiquete");
        double precio = sc.nextDouble();
        tq.setPrecio(precio);
        System.out.println("Ingrese el numero de maletas");
        int cantidadequipaje = sc.nextInt();
        tq.setCantidadequipaje(cantidadequipaje);
        System.out.println("Ingrese el peso del equipaje");
        double pesoequpaje = sc.nextDouble();
        tq.setPesoequpaje(pesoequpaje);
        System.out.println("SE HA REGISTRADO LA INFORMACION DE SU TIQUETE EXITOSAMENTE");
        return tq;
    }

    public static void main(String[] args) {
        ArrayList<Asiento> lista_asiento = new ArrayList<Asiento>();
        ArrayList<Vuelo> lista_vuelos = new ArrayList<Vuelo>();
        ArrayList<Cliente> lista_clientes = new ArrayList<Cliente>();
        ArrayList<Tiquete> lista_tiquetes_clientes = new ArrayList<Tiquete>();

        Aerolinea admin = new Aerolinea(lista_vuelos, lista_clientes);
        admin.setCorreo("saintomas@gmail.com");
        admin.setContraseña("noes12345");

        Main m = new Main();
        m.saint_tomas = new Aerolinea();

        int op = 0;
        String dato;
        do {
            try {
                dato = JOptionPane.showInputDialog("\nAEROLINEA\n" +
                        "[1] Iniciar Sesion\n" +
                        "[0] Salir\n" +
                        "\nIngrese una opcion:");
                op = Integer.parseUnsignedInt(dato);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero entre 0 y 3");
            }
            if (op < 0) {
                JOptionPane.showMessageDialog(null, "Ingrese valores numericos positivos");
            }
            switch (op) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Ingrese el correo");
                    String correo = sc.next();
                    System.out.println("Ingrese la contraseña");
                    String contraseña = sc.next();
                    if (correo.equals(admin.getCorreo()) && contraseña.equals(admin.getContraseña())) {
                        do {
                            try {
                                dato = JOptionPane.showInputDialog("\nIngrese la opcion que desea\n"
                                        + "[1] Crear Vuelos\n"
                                        + "[2] Ver Vuelos\n"
                                        + "[3] Ingresar Cliente\n"
                                        + "[4] Ver Clientes\n"
                                        + "[5] Comprar tiquetes\n"
                                        + "[6] Ver tiquetes\n"
                                        + "[7] Rutas\n"
                                        + "[0] Atras\n");
                                op = Integer.parseUnsignedInt(dato);
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Ingrese un numero entre 0 y 6");
                            }
                            if (op < 0) {
                                JOptionPane.showMessageDialog(null, "Ingrese valores numericos positivos");
                            }
                            switch (op) {
                                case 1:
                                    lista_vuelos.add(nuevo_Vuelo(lista_vuelos));
                                    break;
                                case 2:
                                    System.out.println(lista_vuelos);
                                    break;
                                case 3:
                                    lista_clientes.add(nuevo_Cliente(lista_tiquetes_clientes));

                                    break;
                                case 4:
                                    System.out.println(lista_clientes);
                                    break;
                                case 5:
                                    lista_asiento.add(crear_tiquete(lista_asiento));
                                    break;
                                case 6:
                                    System.out.println(lista_asiento);
                                    break;
                                case 7:
                                    Graph graph = getRutas();
                                    System.out.println(graph);
                                    break;
                            }
                        } while (op != 0);
                    }
                    break;
            }
        } while (op != 0);
        JOptionPane.showMessageDialog(null, "El programa a finalizado");
    }
    public static Graph getRutas() {
        Node c1 = new Node("Bogota");
        Node c2 = new Node("Lima");
        Node c3 = new Node("Ciudad de Mexico");
        Node c4 = new Node("Rio de Janeiro");
        Node c5 = new Node("Caracas");

        c1.addEdge(new Edge(c1, c2, 500));
        c1.addEdge(new Edge(c1, c3, 600));
        c1.addEdge(new Edge(c1, c4, 800));
        c1.addEdge(new Edge(c1, c5, 700));

        c2.addEdge(new Edge(c2, c3, 1000));
        c2.addEdge(new Edge(c2, c4, 500));
        c2.addEdge(new Edge(c2, c5, 300));

        c3.addEdge(new Edge(c3, c4, 300));
        c3.addEdge(new Edge(c3, c5, 700));

        c4.addEdge(new Edge(c4, c5, 100));

        Graph graph = new Graph();
        graph.addNode(c1);
        graph.addNode(c2);
        graph.addNode(c3);
        graph.addNode(c4);
        graph.addNode(c5);

        return graph;
    }
}



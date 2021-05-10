package main;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Jhon Alexis
 */
public class Main {

    public static void main(String[] args) {

        Queue<Cliente> cola = new LinkedList<Cliente>();

        cola.add(new Cliente("Pedro", "Perez",3314646));
        cola.add(new Cliente("Pablo", "Hernandez",7897464));
        cola.add(new Cliente("Hernan", "Cortes",33754546));
        cola.add(new Cliente("Maria", "Rojas",1215431));

        System.out.println("El primer cliente es: " + cola.peek());
        System.out.println("Tamaño: " + cola.size());
        System.out.println("Cliente atendido: " + cola.poll());
        System.out.println("Tamaño sin un cliente: " + cola.size());
        System.out.println("Clientes restantes: " + cola.toString());
    }
}

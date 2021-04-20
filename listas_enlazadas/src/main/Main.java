package main;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jhon Alexis
 */
public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<Integer>();
        numeros.add(20);
        numeros.add(45);
        numeros.add(85);
        numeros.add(95);
        numeros.add(0);
        numeros.add(63);
        numeros.add(98);
        numeros.add(12);
        numeros.add(30);
        numeros.add(10);

        for (Integer n : numeros) {
            System.out.println(n);
        }
        System.out.println();
        numeros.remove(2);

        for (Integer n : numeros) {
            System.out.println(n);
        }
        numeros.addFirst(254);
        numeros.addLast(478);

        for (Integer n : numeros) {
            System.out.println(n);
        }
        numeros.removeFirst();

        for (Integer n : numeros) {
            System.out.println(n);
        }
    }
}

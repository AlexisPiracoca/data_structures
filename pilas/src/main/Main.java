package main;
import java.util.Stack;
/**
 *
 * @author Jhon Alexis
 */
public class Main {

    public static void main(String[] args) {
        Stack<Ficha> pila = new Stack<Ficha>();

        Ficha f1 = new Ficha("Azul", 69);
        Ficha f2 = new Ficha("Rojo", 87);
        Ficha f3 = new Ficha("Amarillo", 10);
        Ficha f4 = new Ficha("Marrón", 45);

        // adiciona una ficha a la pila
        pila.push(f1);
        pila.push(f2);
        pila.push(f3);
        pila.push(f4);

        System.out.println(pila.peek()); // el último elemento adicionado
        System.out.println("Tamaño: " + pila.size());

        while (!pila.isEmpty()){
            pila.pop(); // extrae un elemento de la pila
            System.out.println(pila); // muestra la pila
        }
    }
}


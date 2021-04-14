package main;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jhon Alexis
 */

public class Main {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        //Metodo add, añade elementos a nuestra lista
        lista.add("Camila");
        lista.add("Pedro");
        lista.add("Manuel");

        System.out.println("Añadimos los datos: ");
        System.out.println(lista.toString());

        //Metodo Iterator, util para recorrer un arrayList
        System.out.println("El metodo iterator: ");
        Iterator<String> it = lista.iterator();
        String nombre;
        while (it.hasNext()){
            nombre = it.next();
            System.out.println(nombre);

        //Metodo Clear, elimina todos los elementos
        /*lista.clear();

        System.out.println("Y aplicamos el metodo clear: ");
        System.out.println(lista.toString());
        */

        }
    }
}


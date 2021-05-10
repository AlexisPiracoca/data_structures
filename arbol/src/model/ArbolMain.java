package model;
/**
 *
 * @author Jhon Alexis
 */
import javax.swing.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ArbolMain {
    public static void main(String[] args) {

        arbolTreemap();
        arbolEntero();
    }

    public static void arbolTreemap() {
      /*  //strings
        TreeMap<String,String> paisesCapitalesTM=new TreeMap<String,String>();
        paisesCapitalesTM.put("India","Delhi");
        paisesCapitalesTM.put("Japón","Tokyo");
        paisesCapitalesTM.put("Francia","Paris");
        paisesCapitalesTM.put("Colombia","Bogotá");
        paisesCapitalesTM.put("Yugoslavia","Belgrado");

        System.out.println("");
        System.out.println("for each mostrando el mapa");
        for (String llavePais:paisesCapitalesTM.keySet()) {
            System.out.println("País:" + llavePais + " y su  capital: " + paisesCapitalesTM.get(llavePais));

        }
         //enteros
        TreeMap<Integer,String> edadesPersonasTM=new TreeMap<Integer,String>();
        edadesPersonasTM.put(23,"Juan");
        edadesPersonasTM.put(20,"Diego");
        edadesPersonasTM.put(45,"Jorge");
        edadesPersonasTM.put(2,"Gabriel");
        edadesPersonasTM.put(33,"Paola");
        edadesPersonasTM.put(55,"Blanca");
        edadesPersonasTM.put(80,"Elena");
        edadesPersonasTM.put(0,"Emilia");

        System.out.println("");
        System.out.println("for each mostrando el mapa");
        for (Integer llaveEdad:edadesPersonasTM.keySet()) {
            System.out.println("Edad:"+ llaveEdad +" años tiene: "+edadesPersonasTM.get(llaveEdad));

        }
    }
        */

        TreeMap<Double, String> notas = new TreeMap<Double, String>();
        notas.put(4.5, "Armando");
        notas.put(3.0, "Mauricio");
        notas.put(3.5, "Camila");
        notas.put(4.2, "Esperanza");
        notas.put(3.9, "Julia");

        Set set = notas.entrySet();
        Iterator it = set.iterator();
        System.out.println("\nIterator: ");
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            System.out.print("Notas: " + me.getKey() + " || " + "Estudiante : " + me.getValue() + "\n");
        }
    }
    public static void arbolEntero() {

        System.out.println("\nArbol entero: ");
        Node raiz = new Node("Alemania");
        raiz.insert("España");
        raiz.insert("Filipinas");
        raiz.insert("Colombia");
        raiz.insert("Bután");
        raiz.insert("Camerún");
        raiz.insert("Bulgaria");
        raiz.insert("Eslovaquia");
        raiz.insert("Andorra");
        raiz.insert("Brasil");

        System.out.println("\nRecorrer preorden: ");
        raiz.preorder();

        System.out.println("\nRecorrer postorden: ");
        raiz.postorder();

        System.out.println("\nRecorrer inorden: ");
        raiz.inorder();
    }
}

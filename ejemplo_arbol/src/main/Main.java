package main;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        arbolEntero();
        arbolTreemap();

    }

    public static void arbolTreemap()
    {
        //strings
        TreeMap<String,String> paisesCapitalesTM=new TreeMap<String,String>();
        paisesCapitalesTM.put("India","Delhi");
        paisesCapitalesTM.put("Japón","Tokyo");
        paisesCapitalesTM.put("Francia","Paris");
        paisesCapitalesTM.put("Colombia","Bogotá");
        paisesCapitalesTM.put("Yugoslavia","Belgrado");

        System.out.println("");
        System.out.println("for each mostrando el mapa");
        for (String llavePais:paisesCapitalesTM.keySet()) {
            System.out.println("País:"+ llavePais +" y su  capital: "+paisesCapitalesTM.get(llavePais));

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

    public static void arbolEntero()
    {
        USTA.modelo.Node raiz = new USTA.modelo.Node(7);
        raiz.insert(3);
        raiz.insert(34);
        raiz.insert(5);
        raiz.insert(12);
        raiz.insert(0);
        raiz.insert(7);
        raiz.insert(541);
        raiz.insert(35);
        raiz.insert(787);
        raiz.insert(13);
        raiz.insert(56);
        raiz.insert(81);



        System.out.println("Recorrer preorden");
        raiz.preorder();

        System.out.println("Recorrer postorden");
        raiz.postorder();

        System.out.println("Recorrer inorden");
        raiz.inorder();
    }
}


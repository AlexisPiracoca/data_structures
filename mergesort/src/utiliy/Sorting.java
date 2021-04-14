package utiliy;

import models.Product;


public class Sorting {

    public static void merge(Product[] arregloIzquierdo, Product[] arregloDerecho, Product[] array, int leftSize, int rightSize) {

        int i = 0, l = 0, r = 0;
        //Los bucles while comprueban las condiciones para la fusión
        while (l < leftSize && r < rightSize) {

            if (arregloIzquierdo[l].getPrice() < arregloDerecho[r].getPrice()) {
                array[i++] = arregloIzquierdo[l++];
            } else {
                array[i++] = arregloDerecho[r++];
            }
        }
        while (l < leftSize) {
            array[i++] = arregloIzquierdo[l++];
        }
        while (r < rightSize) {
            array[i++] = arregloDerecho[r++];
        }
    }

    public static void mergeSort(Product[] array, int len) {
        if (len < 2) {
            return;
        }

        int mitad = len / 2;

        Product[] arregloIzquierdo = new Product[mitad];
        Product[] arregloDerecho = new Product[len - mitad];

        //Dividir en dos el arreglo y dividirlo en dos arreglos separados
        int rightPosition = 0;
        for (int i = 0; i < len; ++i) {
            if (i < mitad) {
                arregloIzquierdo[i] = array[i];
            } else {
                arregloDerecho[rightPosition] = array[i];
                rightPosition ++;
            }
        }
        // Llamada recursiva a la función para dividir aún más las sub matrices
        mergeSort(arregloIzquierdo, mitad);
        mergeSort(arregloDerecho, len - mitad);

        // Llamar al método merge en cada subdivisión
        merge(arregloIzquierdo, arregloDerecho, array, mitad, len - mitad);
    }
}

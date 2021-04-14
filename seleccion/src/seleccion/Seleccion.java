/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccion;

/**
 *
 * @author Jhon Alexis
 */
public class Seleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] v = {1, 5, 11, 96, -8, 21, 18, 12, 22, 30, 97, -1, -40, 85};
        System.out.println("Imprimiendo antes de ordenar: ");
        for (int i : v) {
            System.out.printf("%d, ", i);
        }
       
        Seleccion(v);
        
        System.out.println("\nImprimiendo después de ordenar: ");
        for (int i : v) {
            System.out.printf("%d, ", i);
        }
    }

    public static void Seleccion(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
    }
}

/*
public static void insercionDirecta(int A[]){                                            
    int p, j;
    int aux;
    for (p = 1; p < A.length; p++){ // desde el segundo elemento hasta
              aux = A[p];           // el final, guardamos el elemento y
              j = p - 1;            // empezamos a comprobar con el anterior
              while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el                                
                                             // valor de aux sea menor que los
                         A[j + 1] = A[j];   // de la izquierda, se desplaza a
                         j--;               // la derecha
              }
              A[j + 1] = aux;       // colocamos aux en su sitio
    }
}
*/

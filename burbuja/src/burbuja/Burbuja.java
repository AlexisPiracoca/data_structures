/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jhon Alexis
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int i, n;
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Cuantos numeros va a ingresar :");
        n = Integer.parseInt(br.readLine());
        System.out.println("Usted ingresara " + n + " numeros");
        
        int datos[] = new int[n];
        System.out.println("Ingrese los numeros :");
        
        for (i = 0; i < n; i++) {
            datos[i] = Integer.parseInt(br.readLine());
        }  
        
        for (i = 0; i < n - 1; i++) {
            int temp = i;
            for (int j = i + 1; j < n; j++) {
                if (datos[j] < datos[temp]) {
                    temp = j;
                }
            }
            if (i != temp) {
                int aux = datos[i];
                datos[i] = datos[temp];
                datos[temp] = aux;
            }
        }
        System.out.println("Los numeros de menor a mayor son :");
        for (int k = 0; k < n; k++) {
            System.out.print(datos[k] + " ");
        }
       
        }
    }




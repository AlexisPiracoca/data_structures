/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import java.util.Scanner;

/**
 *
 * @author Jhon Alexis
 */
public class Estudiante {
    private Scanner teclado;
    private String[] nombres;
    private int[] notas;
      
    public void ingresarEstudiantes() {
        teclado = new Scanner(System.in);
        nombres = new String[5];
        notas = new int[5];
        
        System.out.println("Sistema de notas");
        for(int i = 0; i < nombres.length; i++) {
            System.out.print("Ingese el nombre del estudiante: ");
            nombres[i] = teclado.next();
            System.out.print("Ingrese la nota del estudiante: ");
            notas[i] = teclado.nextInt();
        }
    }
    public void notas() {
        for(int j = 0; j < notas.length; j++) {
            for(int i = 0; i < notas.length; i++) {
                if (notas[i] < notas[i+1]) {
                    int nota;
                    nota = notas[i];
                    notas[i] = notas[i+1];
                    notas[i+1] = nota;
                    String nombre;
                    nombre = nombres[i];
                    nombres[i] = nombres[i+1];
                    nombres[i+1] = nombre;
                }
            }
        }
    }
    public void mostrar() {
   	System.out.println("Nombres de los estudiantes y notas de mayor a menor");
        for(int i = 0; i < notas.length; i++) {
            System.out.println(nombres[i] + " - " + notas[i]);
        }
    }  
}


    

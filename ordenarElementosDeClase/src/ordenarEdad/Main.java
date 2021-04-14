/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarEdad;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhon Alexis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int ve[], nEstudiantes, temp, pos;
              
        nEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes: "));
        ve = new int[nEstudiantes];
        
        for(int i = 0; i < nEstudiantes; i++){
            System.out.println((i+1)+". Digite la edad del estudiante: ");
            ve[i] = sc.nextInt();
        }  
         
        
        //Método Burbuja
        for(int i = 0; i < (nEstudiantes-1); i++){
            for(int j = 0; j < (nEstudiantes-1); j++){
                if(ve[j] > ve[i+1]){
                   temp = ve[j]; 
                   ve[j] = ve[j+1];
                   ve[j+1] = temp;
               }
           } 
       }
        
        //Método de inserccion
        for(int i = 0; i < nEstudiantes; i++){
           pos = i;
           temp = ve[i]; 
           
           while((pos > 0) && (ve[pos-1] > temp)){
               ve[pos] = ve[pos-1];
               pos--;
           }
           ve[pos] = temp;
       } 
        
        System.out.println("\n Vector ordenado por burbuja: ");
         for(int i = 0; i < nEstudiantes; i++){
            System.out.print(ve[i]+" - ");
        }  
        
        System.out.println("\n Vector ordenado por inserccion: ");
         for(int i = 0; i < nEstudiantes; i++){
            System.out.print(ve[i]+" - ");
        }  
         
    }
}

 


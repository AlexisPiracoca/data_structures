/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author Jhon Alexis
 */
public class Matriz {
           
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String veces[][] = new String[5][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < veces.length; i++){
            System.out.println("Ingresa un cliente de esta manera: nombre | n. veces que va a la panaderia | dia ");
            for(int j = 0; j < 3; j++){
                veces[i][j] = sc.next();
            }
        }
        System.out.println("Dime que dia quieres ver: ");
        String dia = sc.next();
        dia = dia.toLowerCase();
        for(int i = 0; i < veces.length; i++){
            if(veces[i][2].toLowerCase().equals(dia)){
                System.out.println(" ");
                System.out.println("| nombre | n. veces | dia |");
                for(int j = 0; j < 3; j++){
                    System.out.print("|"+veces[i][j]+"|");
                 }
            }
        }
    }
}
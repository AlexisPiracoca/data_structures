/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;

/**
 *
 * @author Jhon Alexis
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                              
        double resultados[] = new double [5];
        int op = 0;
        double n1, n2, s, r, m, d = 0;
        String dato;
        do{
            try{
                dato=JOptionPane.showInputDialog("\nCalculadora\n"+
                        "[1] Sumar\n"+
                        "[2] Restar\n"+
                        "[3] Multiplicar\n"+
                        "[4] Dividir\n"+
                        "[5] Salir\n"+
                        "\nIngrese una opcion:");
                op=Integer.parseUnsignedInt(dato);
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ingrese un numero entre 1 y 5");
            }
            if(op<0){
                JOptionPane.showMessageDialog(null, "Ingrese valores numericos positivos");
            }
            
       switch(op){
         case 1:
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 1:"));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 2:"));
            s = n1 + n2;
            resultados [0] = s;
            JOptionPane.showMessageDialog(null, "La suma es: "+s);
        break;
        
        case 2:
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 1:"));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 2:"));
            r = n1 - n2;
            resultados [1] = r;
            JOptionPane.showMessageDialog(null, "La resta es: "+r);
        break;
        
        case 3:
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 1:"));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 2:"));
            m = n1 * n2;
            resultados [2] = m;
            JOptionPane.showMessageDialog(null, "La multiplicacion es: "+m);
        break;
        
        case 4:
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 1:"));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 2:"));
            if(n2==0){
                JOptionPane.showMessageDialog(null, "Division entre cero, no es valido");
            }else
                d = n1 / n2;
                resultados [3] = d;
                JOptionPane.showMessageDialog(null, "La division es: "+d);
        break;
       }
     }while(op!=5);

    //Guardar archivo         
         try {
            String ruta = "D:\\resultados.txt";
            java.io.File file = new java.io.File(ruta);
            
    // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(Arrays.toString(resultados));
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }   
    
    
   

             


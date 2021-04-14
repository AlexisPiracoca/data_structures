/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import controller.Panaderia;
import java.util.Arrays;
import model.Cliente;

/**
 *
 * @author yolima
 */
public class Inicio {

   private Panaderia tienda;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Inicio m = new Inicio();
       m.tienda = new Panaderia(); 
       
       for(int i = 0; i <m.tienda.getTotalVentas().length; i++){
            m.tienda.getTotalVentas()[i] = 0;
        }
       
       int vectorTemp[] = new int [100];
       for(int i = 0; i <vectorTemp.length; i++){
           vectorTemp[i] = 0;
        }
       m.tienda.setTotalVentas(vectorTemp);
       m.tienda.incializarTotal();
       m.tienda.getTotalVentas()[0] = 5000;
       m.tienda.getTotalVentas()[50] = 15000;
       
       System.out.println(Arrays.toString(m.tienda.getTotalVentas()));
      
       for(int i = 0; i <m.tienda.getTotalVentas().length; i++){
           System.out.println(m.tienda.getTotalVentas()[i]);
        }
    } 
}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Panaderia;
import java.util.Arrays;
import javax.swing.JOptionPane;
import model.Pan;
import util.Constants;
import util.IOManager;

/**
 *
 * @author Jhon Alexis
 */
public class MainView {
    private static Panaderia pc;
       
    public static void main(String[] args) {
        pc = new Panaderia();
                
        int menuOption;
        
        do{
            menuOption = IOManager.showCustomMenu(Constants.MAIN_MENU_TITLE, Constants.MAIN_MENU_INFO);
            
            //Main menu
            switch(menuOption){
                case 0:
                    break;

                case 1:
                    menuOption = ClienteModule();
                    break;
                    
                case 2:
                    menuOption = PanModule();
                    break;
                    
                default:
                    break;
            }
            
        }while(menuOption != 0);
        
    } 
    
    //cliente
    private static int ClienteModule(){
        int ClienteOption;
        do{
            ClienteOption = IOManager.showCustomMenu(Constants.CLIENTE_MENU_TITLE, Constants.CLIENTE_MENU_INFO);
            switch(ClienteOption){
                case 1: 
                    pc.save(IOManager.getInt("Indica el ID"), 
                            IOManager.getString("Ingresa el nombre del cliente"), 
                            IOManager.getString("Ingresa el numero de panes")
                            );
                    break;
                
                case 2:
                    IOManager.showMessage(Arrays.toString(pc.list()));
            
            
                           }
        }while(ClienteOption != 0);
              
        return -1;
        
       }
    
    //pan
    private static int PanModule(){
        int PanOption;
        do{
            PanOption = IOManager.showCustomMenu(Constants.PAN_MENU_TITLE, Constants.PAN_MENU_INFO);
            switch(PanOption){
                case 1: 
                    pc.save(IOManager.getString("Indica el nombre del pan"), 
                            IOManager.getInt("Ingresa el precio del pan")
                            );
                    break;
                
                case 2:
                    IOManager.showMessage(Arrays.toString(pc.list()));
            
                              }
        }while(PanOption != 0);
              
        return -1;
        
       }
}


          

     
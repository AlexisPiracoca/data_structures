/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GameController;
import java.util.Arrays;
import model.Game;
import util.Constants;
import util.IOManager;

/**
 *
 * @author Jhon Alexis
 */
public class MainView {
    private static GameController gc;
       
    public static void main(String[] args) {
        gc = new GameController();
                
        int menuOption;
        
        do{
            menuOption = IOManager.showCustomMenu(Constants.MAIN_MENU_TITLE, Constants.MAIN_MENU_INFO);
            
            //Main menu
            switch(menuOption){
                case 0:
                    break;

                case 1:
                    menuOption = GameModule();
                    break;
                    
                                   
                default:
                    break;
            }
            
        }while(menuOption != 0);
        
    } 
    
    //game
    private static int GameModule(){
        int GameOption;
        do{
            GameOption = IOManager.showCustomMenu(Constants.GAME_MENU_TITLE, Constants.GAME_MENU_INFO);
            switch(GameOption){
                case 1: 
                    gc.save(IOManager.getInt("Indica el ID"), 
                            IOManager.getString("Ingresa el nombre del juego"), 
                            IOManager.getString("Ingresa el genero"), 
                            IOManager.getString("Ingresa la empresa desarrolladora")
                            );
                    break;
                
                case 2:
                    IOManager.showMessage(Arrays.toString(gc.list()));
            }
        }while(GameOption != 0);
        
        return 0;
    } 
          
}

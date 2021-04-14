/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Arrays;
import model.Game;

/**
 *
 * @author Jhon Alexis
 */
public class GameController extends AbstractFacade<Game>{
    
//Constructors
    public GameController() {
        data = new Game[10];
    }
    
    //methods
    public boolean save(int id, String nombre, String genero, String desarrollador){
        try{
            if(findOne(id) == null ){
                Game newGame = new Game(id, nombre, genero, desarrollador);
                data[id] = newGame;
            
            }else
                System.err.println("La llave primaria (índice) especificada ya existe");
            
            return true;
        
        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo guardar el juego, porque la estructura es nula");
            return false;
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo guardar el juego");
            return false;
        
        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
        
    }
    
    public boolean update(int id, String nombre, String genero, String desarrollador){
        try {
            if(findOne(id) == null){
                           
                return false;
            }
                      
            //Optimal option 
            data[id].setNombre(nombre);
            data[id].setGenero(genero);
            data[id].setDesarrollador(desarrollador);
            return true;
        
        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo actualizar el juego, porque la estructura es nula");
            return false;
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo actualizar el juego");
            return false;
        
        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }
}

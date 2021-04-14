/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Jhon Aleixs
 * @param <Game>
 */
public abstract class AbstractFacade<Game> {
    
    //Attributes
    Game[] data;
    
    public boolean delete(int id){
        try {
            if(findOne(id) == null){
                               
                return false;
            }
            
            data[id] = null;
            
            return true;
        
        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo eliminar el juego, porque la estructura es nula");
            return false;
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo eliminar el jueo");
            return false;
        
        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }
    
    
    public Game findOne(int id){
        for(int i=0; i < data.length; i++){
            if(data[i] != null && id == data[i].hashCode()){
                return data[i];
            }
        }
        
        System.err.println("La llave primaria (índice) especificada no existe o no tiene ningún objeto asociado");
        
        return null;
    }
    
   
    public Game[] list(){
        try {
            
            return data;
            
        } catch (Exception e) {
            System.err.println("Lo sentimos, ocurrió un error al tratar de listar");
            return null;
                   }
    }
}

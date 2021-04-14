/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jhon Alexis
 */
public class Game {
    
    //Attributes
    private int id;
    private String nombre;
    private String genero;
    private String desarrollador;
   
    //Constructor
    public Game() {	
    }

public Game(int id, String nombre, String genero, String desarrollador) {
	this.id = id;
	this.nombre = nombre;
	this.genero = genero;
        this.desarrollador = desarrollador;
   }

//Setter and getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    @Override
    public String toString() {
        return "ID: " +id+ ", NOMBRE: " +nombre+ ", GENERO: " +genero+ ", DESARROLLADOR: "+desarrollador+ "\n"; 
    }
    
} 
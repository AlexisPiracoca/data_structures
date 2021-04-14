/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Animal;
import model.Veterinaria;

/**
 *
 * @author Jhon Alexis
 */
public class Main {
    public static void main(String[] args) {
        
       Veterinaria sonrisas = new Veterinaria();
        
       System.out.println(sonrisas.getAnimales().getId().getNombre().getTipo().getEnfermedad());
       
    }

}


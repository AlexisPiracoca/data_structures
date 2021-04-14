/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author yolima
 */
public class Cliente {
    
    private String nombre;
    private Pan canasta[];
    private int tamañoCanasata;

    public Cliente(int tamañoCanasta) {
        canasta = new Pan[tamañoCanasta];
        for(int i = 0; i<canasta.length; i++)
            canasta[i] = new Pan();
    }

    public Cliente(String nombre, Pan[] Canasta) {
        this.nombre = nombre;
        this.canasta = Canasta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pan[] getCanasta() {
        return canasta;
    }

    public void setCanasta(Pan[] Canasta) {
        this.canasta = Canasta;
    }
    
    
}

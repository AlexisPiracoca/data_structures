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
public class Cliente {
    private int id;
    private String nombre;
    public Pan Canasta[];

    public Cliente() {
    }

    public Cliente(int id, String nombre, Pan[] Canasta) {
        this.nombre = nombre;
        this.Canasta = Canasta;
    }

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

    public Pan[] getCanasta() {
        return Canasta;
    }

    public void setCanasta(Pan[] Canasta) {
        this.Canasta = Canasta;
    }

    @Override
    public String toString() {
        return "ID: " +id+ ", NOMBRE: " +nombre+ ", CANASTA: " +Canasta+ "\n";
    }
     
}

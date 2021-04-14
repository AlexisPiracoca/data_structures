/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
import model.Pan;

/**
 *
 * @author Jhon Alexis
 */
public class Panaderia {
    
    private Cliente clientes[];
    private Pan despensa[];
    private int clienteactual;

    public Panaderia() {
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
    
    private void venderPan()
    {
        System.out.println("Tipo de pan a la venta:");
        for(int i = 0; i < despensa.length;i++)
        System.out.println(despensa[i].getTipo());
        System.out.println("Cuántos panes desea comprar de cada tipo?:");
        int numeroPanes = 0;
        for(int i = 0; i < despensa.length;i++)
        System.out.println(despensa[i].getTipo());
        int numCanasta = 0;
        for(int j = 0; j < numeroPanes;j++)
        {
        clientes[clienteactual].getCanasta()[numCanasta] = despensa[j];
        numCanasta++;
        }

     }    

    public void save(int aInt, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public long[] list() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void save(String string, int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     }
   
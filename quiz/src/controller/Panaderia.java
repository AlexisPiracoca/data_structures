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
    private int ventasDiarias[];
    private int numVentas;
    private int totalVentas[];

    public Panaderia() {
        despensa = new Pan[20];
        for(int i = 0; i<despensa.length; i++)
            despensa[i] = new Pan();
        
        clientes = new Cliente[10];
        for(int i = 0; i<clientes.length; i++)
            clientes[i] = new Cliente(20);
        
        clienteactual = 0;
        
        ventasDiarias = new int[100];
        for(int i = 0; i<100; i++)
            ventasDiarias[i] = 0;
        numVentas = 0;
        
    }
        
    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int[] getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int[] totalVentas) {
        this.totalVentas = totalVentas;
    }
    
    
    public void venderPan()
    {
        System.out.println("Tipo de pan a la venta:");
        for(int i = 0; i < despensa.length;i++)
            System.out.println(despensa[i].getTipo());
            System.out.println("Cuántos panes desea comprar de cada tipo:");
        int numeroPanes = 0;
        
        for(int i = 0; i < despensa.length;i++){
            System.out.println(despensa[i].getTipo());
            System.out.println("Cuántos panes desea comprar de cada tipo:");
        int numCanasta = 0;
        
        for(int j = 0; j < numeroPanes;j++)
        {
          clientes[clienteactual].getCanasta()[numCanasta] = despensa[i];
          numCanasta++;
        
          ventasDiarias[numVentas] +=despensa[i].getPrecio();
            }
        }
        
        numVentas++;
    }
    public void mostrarVentasDiarias(){
            for(int i = 0; i < numVentas+1; i++){
                System.out.println("Venta número "+i+1+ ": "+ventasDiarias[i]);
        }
        }
    public void incializarTotal(){
            for(int i = 0; i < getTotalVentas().length; i++){
                this.totalVentas[i] = 0;
            }
        }
    }    


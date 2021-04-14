/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.Scanner;


/**
 *
 * @author Jhon Alexis
 */
public class Veterinaria {
    private Animal animales[]; 
    private int pos;

    public Veterinaria() {
    }

    public Veterinaria(Animal[] Animales, int pos) {
        this.animales = Animales;
        this.pos = pos;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] Animales) {
        this.animales = Animales;
    } 
       
    
    public void registrar_amimal(){
        int id;
        String nombre, tipo, enfermedad;
               
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Id del animal: ");
        id = sc.nextInt();
        
        System.out.println("Nombre del animal: ");
        nombre = sc.next();
        
        System.out.println("Tipo de animal: ");
        tipo = sc.next();
        
        System.out.println("Enfermedad del animal: ");
        enfermedad = sc.next();
        
        animales[pos].setId(id);
        animales[pos].setNombre(nombre);
        animales[pos].setTipo(tipo);
        animales[pos].setEnfermedad(enfermedad);
       
       System.out.println();
       System.out.println("Datos del Animal");
       System.out.println("ID: " + id);
       System.out.println("NOMBRE: " + nombre);
       System.out.println("TIPO: " + tipo);
       System.out.println("ENFERMEDAD: " + enfermedad);
       System.out.println();
     
    }

    public void nivel_enfermedad(){
        int nivel, op = 0;
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            System.out.println("Cual es el grado de enfermedad del animal: ");
            nivel = sc.nextInt();
            
         }if(nivel = op){
             System.out.println("Es importante atender el paciente");
         }else{
             System.out.println("No es de vital importancia atender el paciente");
         }
    }
}


package model;

import java.util.Scanner;

/**
 *
 * @author Jhon Alexis
 */
public class Banco {
    private Usuario usuarios[]; 
    private int pos;

    public Banco() {
        usuarios = new Usuario[3];
        for(int i = 0; i < usuarios.length; i++){
            usuarios[i] = new Usuario();
        }
        pos = 0;
        crear_usuarios();
    }

    public Banco(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }
    
    //Getters y setters
    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }
    
    public void crear_usuarios(){
       String nombre = null, apellido = null;
       
       Scanner sc = new Scanner(System.in); 
       
       System.out.println("Cuantas usuarios quiere crear: ");
       int nUsuarios;
       nUsuarios = sc.nextInt();
       usuarios[pos].setnUsuarios(nUsuarios);
       
         for(int i = 0; i < nUsuarios; i++){
            System.out.print("Nombre del titular: ");
                nombre = sc.next();
       
            System.out.print("Apellido: ");
                apellido = sc.next();
       
            usuarios[pos].setNombre(nombre);
            usuarios[pos].setApellido(apellido);
       }
        
       System.out.println("Cuantas cuentas quiere crear (maximo 3 cuentas por usuario)");
       int nCuentas;
       nCuentas = sc.nextInt();
       usuarios[pos].setnCuentas(nCuentas);
       
           String tipoDeCuenta = null;
           int numeroCuenta = 0;
           double saldo = 0;
       
           for(int i = 0; i < nCuentas; i++){
          
            System.out.println("Digite el tipo de cuenta: ");
                tipoDeCuenta = sc.next();
            
            System.out.println("Digite el numero de cuenta: ");
                numeroCuenta = sc.nextInt();
            
            System.out.println("Digite el saldo: ");
                saldo = sc.nextDouble();
            
            usuarios[pos].getCuentas()[i].setTipoDeCuenta(tipoDeCuenta);
            usuarios[pos].getCuentas()[i].setNumeroCuenta(numeroCuenta);
            usuarios[pos].getCuentas()[i].setSaldo(saldo);
            
        }
       System.out.println("Datos del Usuario y su Cuenta");
       System.out.println("Nombre del titular de la cuenta: " + nombre);
       System.out.println("Apellido: " + apellido);
       System.out.println("Tipo de cuenta: " + tipoDeCuenta);
       System.out.println("Numero de cuenta: " + numeroCuenta);
       System.out.println("Saldo: " + saldo);
       System.out.println();
       
    }
    public String cuenta_mayor_saldo(){
          Cuenta cutemp = new Cuenta("ahorros", 1200000,0);
          
          for(int i = 0; i < usuarios.length; i++ ){
           for(int j = 0; j < usuarios[i].getCuentas().length; j++ ){        
               if(usuarios[i].getCuentas()[j].getSaldo() < cutemp.getSaldo()){
                     cutemp = usuarios[i].getCuentas()[j];
                 }
              }
           }
          return cutemp.getTipoDeCuenta();
        }
    
    public Usuario menor_saldo_cuenta_ahorros(){
        Usuario ustemp = new Usuario();
        Cuenta cuentastemp[] = {new Cuenta ("ahorros", 1200000,0)};
        ustemp.setCuentas(cuentastemp);
        
        for(int i = 0; i < usuarios.length; i++ ){
           for(int j = 0; j < usuarios[i].getCuentas().length; j++ ){
               if(usuarios[i].getCuentas()[j].getTipoDeCuenta().equals("ahorros")){
                   if(usuarios[i].getCuentas()[j].getSaldo() < ustemp.getCuentas()[0].getSaldo()){
                  
                       ustemp = usuarios[i];
                  }
               }
            } 
        }
        return ustemp;
    }
    public Usuario mayor_saldo_cuenta_corriente(){
        Usuario ustemp = new Usuario();
        Cuenta cuentastemp[] = {new Cuenta ("corriente", 2200000,0)};
        ustemp.setCuentas(cuentastemp);
        
        for(int i = 0; i < usuarios.length; i++ ){
           for(int j = 0; j < usuarios[i].getCuentas().length; j++ ){
               if(usuarios[i].getCuentas()[j].getTipoDeCuenta().equals("corriente")){
                   if(usuarios[i].getCuentas()[j].getSaldo() > ustemp.getCuentas()[0].getSaldo()){
                  
                       ustemp = usuarios[i];
                  }
               }
            } 
        }
        return ustemp;
    }
    public Usuario organizar_alfabeticamente(){
        Usuario ustemp = new Usuario();
              
        for(int i = 0; i < usuarios.length; i++ ){
           for(int j = 0; j < usuarios.length && i !=j; j++){
                   if(usuarios[i].getApellido().compareTo(usuarios[j].getApellido()) > 0 ){
                       ustemp = usuarios[i];
                  }
               }
            } 
        return ustemp;
    }  
 }
    
    



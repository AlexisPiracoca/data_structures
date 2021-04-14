
package test;

import model.Banco;

/**
 *
 * @author Jhon Alexis
 */
public class Main {

    public static void main(String[] args) {
      
       Banco santotoBank = new Banco();
       
       System.out.println(santotoBank.getUsuarios()[0].getCuentas()[0].getTipoDeCuenta());    
       
       System.out.println("El tipo de cuenta con mayor saldo es: " + santotoBank.cuenta_mayor_saldo());
       
       System.out.println("El usuario con menor saldo en cuentas de ahorros es : "+
               santotoBank.menor_saldo_cuenta_ahorros().getNombre() + " "   + 
               santotoBank.menor_saldo_cuenta_ahorros().getApellido());
       
       System.out.println("El usuario con mayor saldo en cuentas corrientes es : "+
               santotoBank.mayor_saldo_cuenta_corriente());
       
       System.out.println("Usuarios alfabéticamente(por su apellido): " + santotoBank.organizar_alfabeticamente());
     }  
}


package model;

/**
 *
 * @author Jhon Alexis
 */
public class Cuenta {
    private String tipoDeCuenta;
    private int numeroCuenta;
    private double saldo;

    //Constructor por defecto
    public Cuenta() {
    }

    //Constructor con parámetros
    public Cuenta(String tipoDeCuenta, int numeroCuenta, double saldo) {                         
        this.tipoDeCuenta = tipoDeCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //Getters y setters
    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
    
}

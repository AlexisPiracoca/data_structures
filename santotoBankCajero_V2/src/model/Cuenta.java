package model;

public class Cuenta {
    private int numero_cuenta;
    private double saldo;
    private int clave;

    public Cuenta() {
    }

    public Cuenta(int numero_cuenta, double saldo, int clave) {
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
        this.clave = clave;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Numero de cuenta: " + numero_cuenta + " || " +
               "Saldo: " + saldo + " || " +
               "Clave: " + clave;
    }
}

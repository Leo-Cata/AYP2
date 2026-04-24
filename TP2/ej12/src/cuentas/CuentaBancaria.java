package cuentas;

public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;

    // constructor de cuentas bancarias
    public CuentaBancaria(int numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // getters y setters

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // metodo tostring para imprimir 
    @Override
    public String toString() {
        return "";
    }
}

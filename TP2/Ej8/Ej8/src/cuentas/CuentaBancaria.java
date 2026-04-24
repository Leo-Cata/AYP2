package cuentas;
import clientes.Cliente;

public class CuentaBancaria {
    private Cliente titular;
    private int numeroCuenta;
    private double saldo;

    // constructor de cuentas bancarias
    public CuentaBancaria(Cliente titular, int numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // getters y setters
    public Cliente getTitular() {
        return titular;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
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
        return "Titular: "+this.titular+"\nNro de cuenta: "+ this.numeroCuenta+"\nSaldo: "+ this.saldo;
    }
}

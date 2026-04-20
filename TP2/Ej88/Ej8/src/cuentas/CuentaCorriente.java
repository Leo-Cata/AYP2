package cuentas;
import clientes.Cliente;

public class CuentaCorriente extends CuentaBancaria {

    private double saldoMinimo;

    // constructor clase cuenta corriente
    public CuentaCorriente(Cliente titular, int numeroCuenta, double saldo, double saldoMinimo){
        super(titular, numeroCuenta, saldo);
        this.saldoMinimo = saldoMinimo;
    }

    // getter y setter saldomin
    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }
    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    // metodo para extraer dinero hasta cierto monto negativo
    public String extraerDineroCuentaCorriente(double montoExtraer){
        if(getSaldo() - montoExtraer >= saldoMinimo){
            setSaldo(getSaldo() - montoExtraer);
            return "Extraccion Realizada";
        }
        return "Extraccion Invalida";
    }

    // metodo para depositar dinero 
    public String depositarDineroCuentaCorriente(double montoDepositar){
        if(montoDepositar>0){
            setSaldo(getSaldo() + montoDepositar);
            return "Deposito Realizado";
        }
        return "Deposito invalido";
    }

    // sobrescribe el metodo dde imprimir para mostar el saldo minimo tambien
    @Override
    public String toString() {
        return super.toString() +"\nSaldo Minimo:"+ this.saldoMinimo;
    }

    
}

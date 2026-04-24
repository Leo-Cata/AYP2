package cuentas;
public class CajaAhorro extends CuentaBancaria {

    // constructor para cuenta CajaAhorro 
    public CajaAhorro(int numeroCuenta, double saldo){
        super(numeroCuenta,saldo);
    }

    // metodo para extraer dinero siempre y cuanddo el saldo sea >= 0
    public String extraerDinero(double montoExtraer){
        if(getSaldo()-montoExtraer >=0){
            setSaldo(getSaldo() - montoExtraer);
            return "Extraccion Realizado";
        }
        return "Extraccion invalida";
    }

    // metodo para depositar dinero siempre que el monto sea >0
    public String depositarDinero(double montoDepositar){
        if(montoDepositar>0){
            setSaldo(getSaldo() + montoDepositar);
            return "Deposito Realizado";
        }
        return "Deposito Invalido";
    }
    
    @Override
    public String toString() {
    	return "\nCaja Ahorro Nro: "+ this.getNumeroCuenta() + ", Saldo: "+ this.getSaldo();
    }
}

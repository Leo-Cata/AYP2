package test;
import clientes.Cliente;
import cuentas.CajaAhorro;
import cuentas.CuentaCorriente;

public class CuentasTest{

    public static void main(String[] args) {
        // test crear clientes
        Cliente c1 = new Cliente("leo", "avenida siempreviva", "leo@mail", 12356789);
        Cliente c2 = new Cliente("matthew", "el peron", "matt@mail", 456);
        Cliente c3 = new Cliente("agustin", "casa 1", "agus@mail", 789);
        Cliente c4 = new Cliente("jose", "casa 2", "jose@mail", 102030);

        CajaAhorro ca1 = new CajaAhorro(123,200.0);
        CuentaCorriente cc1 = new CuentaCorriente(345, 150.0, -500.0);
        c1.setCuentaBancaria(ca1);
        c1.setCuentaBancaria(cc1);
        System.out.println(c1);

        System.out.println("\nSaldo total:");
        System.out.println(c1.calcularSaldoTotal());

    }
} 

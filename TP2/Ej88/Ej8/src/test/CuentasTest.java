package test;
import clientes.Cliente;
import cuentas.CajaAhorro;
import cuentas.CuentaCorriente;

public class CuentasTest{

    public static void main(String[] args) {
        // test crear clientes
        Cliente c1 = new Cliente("leo", "avenida siempreviva", "leo@mail", 123);
        Cliente c2 = new Cliente("matthew", "el peron", "matt@mail", 456);
        Cliente c3 = new Cliente("agustin", "casa 1", "agus@mail", 789);
        Cliente c4 = new Cliente("jose", "casa 2", "jose@mail", 102030);

        // test crear cuenta corriente
        CuentaCorriente cc1= new CuentaCorriente(c1, 123, 100, -50);
        CuentaCorriente cc2= new CuentaCorriente(c2, 456, 100, -50);
        CuentaCorriente cc3= new CuentaCorriente(c3, 678, 100, -50);
        CuentaCorriente cc4= new CuentaCorriente(c4, 102030, 100, -50);

        // test crear caja ahorro
        CajaAhorro ca1 = new CajaAhorro(c4, 102030, 100);
        CajaAhorro ca2 = new CajaAhorro(c3, 789, 100);
        CajaAhorro ca3 = new CajaAhorro(c2, 456, 100);
        CajaAhorro ca4 = new CajaAhorro(c1, 123, 100);

        System.out.println("Cuentas corrientes");
        System.out.println();
        System.out.println(cc1.toString());
        System.out.println();
        System.out.println(cc2.toString());
        System.out.println();
        System.out.println(cc3.toString());
        System.out.println();
        System.out.println(cc4.toString());
        System.out.println();

        System.out.println("Caja Ahorro");
        System.out.println();
        System.out.println(ca1.toString());
        System.out.println();
        System.out.println(ca2.toString());
        System.out.println();
        System.out.println(ca3.toString());
        System.out.println();
        System.out.println(ca4.toString());
        System.out.println();
        
    System.out.println("Cuenta Corriente");

    System.out.println(cc1.depositarDineroCuentaCorriente(1));
    System.out.println(cc2.extraerDineroCuentaCorriente(100000));
    System.out.println(cc3.extraerDineroCuentaCorriente(150));
    System.out.println(cc4.depositarDineroCuentaCorriente(0));
        
    System.out.println("Caja Ahorro");
        
    System.out.println(ca1.depositarDinero(0));
    System.out.println(ca2.depositarDinero(1));
    System.out.println(ca3.extraerDinero(1000));
    System.out.println(cc4.extraerDineroCuentaCorriente(100));
    }
} 

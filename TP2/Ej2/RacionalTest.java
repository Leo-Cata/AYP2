package Ej2;

public class RacionalTest {

    public static void main(String[] args) {

        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(1, 2);

        System.out.print("Suma ");
        System.out.println(r1.suma(r2));
        System.out.print("Resta ");
        System.out.println(r1.resta(r2));
        System.out.print("multiplicacion ");
        System.out.println(r1.multiplicacion(r2));
        System.out.print("cociente ");
        System.out.println(r1.potencia(2));
        System.out.print("division ");
        System.out.println(r1.division(r2));
    }
}

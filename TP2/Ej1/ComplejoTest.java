package Ej1;

public class ComplejoTest {

    public static void main(String[] args) {

        Complejo complejo1 = new Complejo(5, 10);
        Complejo complejo2 = new Complejo(2, 4);

        System.out.print("Suma ");
        System.out.println(complejo1.Suma(complejo2));
        System.out.print("Resta ");
        System.out.println(complejo1.Resta(complejo2));
        System.out.print("multiplicacion ");
        System.out.println(complejo1.Multiplicacion(complejo2));
        System.out.print("cociente ");
        System.out.println(complejo1.Cociente(complejo2));
        System.out.print("division ");
        System.out.println(complejo1.Division(5f));
    }

}

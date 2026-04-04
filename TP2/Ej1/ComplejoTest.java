package Ej1;

public class ComplejoTest {

    public static void main(String[] args) {

        Complejo complejo1 = new Complejo(5, 10);
        Complejo complejo2 = new Complejo(2, 4);

        System.out.print("Suma ");
        System.out.println(complejo1.suma(complejo2));
        System.out.print("Resta ");
        System.out.println(complejo1.resta(complejo2));
        System.out.print("multiplicacion ");
        System.out.println(complejo1.multiplicacion(complejo2));
        System.out.print("cociente ");
        System.out.println(complejo1.cociente(complejo2));
        System.out.print("division ");
        System.out.println(complejo1.division(5f));
    }

}

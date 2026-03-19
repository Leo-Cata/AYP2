/*Escribir un programa que imprima una tabla de los cuadrados y los cubos de los números del 0 al 10*/

public class ej7 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", Math.powExact(i, 2));
        }
        for (int j = 0; j < 10; j++) {
            System.out.printf("%d ", Math.powExact(j, 3));

        }
    }
}

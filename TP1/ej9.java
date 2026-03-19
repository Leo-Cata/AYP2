/*Escribir un programa que lee diez números e imprima el número más grande y el número más pequeño.*/

import java.util.Scanner;

public class ej9 {

    public static void main(String[] args) {
        int masGrande = 0, masChico = 0, ingresado;
        Scanner input = new Scanner(System.in);
        // pide 10 numeros y hace las comparaciones
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero");
            ingresado = input.nextInt();

            if (ingresado > masGrande) {
                masGrande = ingresado;
            } else if (ingresado < masChico) {
                masChico = ingresado;
            }
        }
        System.out.printf("el numero mas grande es: %d, y el mas chico es: %d", masGrande, masChico);

    }
}

/*Escribir un programa que lee dos números e imprima el número más grande seguido de las palabras es más grande. Si son iguales, imprimir el mensaje los números son iguales.*/

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {

        //variables para guardar los numeros
        int number1;
        int number2;

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese dos numeros int para comparar: ");
        number1 = input.nextInt();
        number2 = input.nextInt();

        if (number1 > number2) {
            System.out.printf("%d es el mas grande", number1);
        } else if (number1 < number2) {
            System.out.printf("%d es el mas grande", number2);
        } else {
            System.out.printf("Son iguales");
        }
    }
}

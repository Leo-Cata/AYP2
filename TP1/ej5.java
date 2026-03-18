/*Escribir un programa que lee dos números e imprima si el primero es múltiplo del segundo */

import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {

        //variables para el scanner y los numeros
        Scanner input = new Scanner(System.in);
        int number1, number2;

        //pide numeros
        System.out.print("Ingrese 2 numeros para verificar si son multiplos ");
        number1 = input.nextInt();
        number2 = input.nextInt();

// pone el numero mas grande % numero mas chico para calcular, si es == a 0 son multiplos
        if (number1 > number2) {
            System.out.printf("%d y %d %s", number1, number2, (number1 % number2 == 0) ? "son multiplos" : "no son multiplos");
        } else if (number2 > number1) {
            System.out.printf("%d y %d %s", number2, number1, (number2 % number1 == 0) ? "son multiplos" : "no son multiplos");
        } else {
            System.out.printf("%d y %d son multimos", number1, number2);
        }
    }
}

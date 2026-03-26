/*12. Escribir un programa que lee 21 números y al final imprime los mismos descartando los duplicados.*/

import java.util.Scanner;

public class ej12 {

    public static void main(String[] args) {
        //array contador y de numeros a ingresar
        int[] contador = new int[21];
        int[] numeroIngresados = new int[21];
        Scanner input = new Scanner(System.in);

        // pide 20 numeros del 0 al 20 y lo guarda en el array
        System.out.print("Ingrese un numero del 0 al 19\n");

        for (int i = 0; i < 20; i++) {
            System.out.print("");
            numeroIngresados[i] = input.nextInt();

            //si el numero ingresado es 0 en el array contador
            //lo guarda, sino, lo no lo guarda
            if (contador[numeroIngresados[i]] == 0) {
                contador[numeroIngresados[i]] = 1;
            }
        }

        //loopea por todos los numeros sin repetir
        for (int i = 0; i < 20; i++) {
            if (contador[i] == 1) {
                System.out.printf("%d ", i);
            }
        }
    }
}

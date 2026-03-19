/*Escribir un programa que lee cinco números entre 1 y 30 y dibuje un histograma horizontal usando*/

import java.util.Scanner;

public class ej11 {

    public static void main(String[] args) {
        //variable para guardar los numeros y scanner
        int[] numeroIngresados = new int[5];
        Scanner input = new Scanner(System.in);

        // pide 5 numeros entre el 1 y el 30
        for (int i = 0; i < 5; i++) {
            //pide un numero y lo guarda
            System.out.print("Ingrese un numero entre el 1 y el 30\n");
            numeroIngresados[i] = input.nextInt();

            //si el numero ingresado no esta entre 1 y el 30, pide nuevamente
            if (numeroIngresados[i] < 1 || numeroIngresados[i] > 30) {
                System.out.print("nuero fuera de rango\n");
                i--;
            }
        }

// para los 5 elementos, imprime * tantas veces sea el numero en posicion [i]
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < numeroIngresados[i]; j++) {
                System.out.print("*");
            }
            //salto de linea
            System.out.println();
        }
    }
}

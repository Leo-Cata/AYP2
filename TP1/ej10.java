/*Escribir una aplicación que encuentre el menor de varios enteros. El primer valor leído especifica el número de valores que el usuario va a introducir.*/

import java.util.Scanner;

public class ej10 {

    public static void main(String[] args) {
        int menor = 0, cantidadDeVals;
        Scanner input = new Scanner(System.in);

//pide el largo para despues crear un array de ese tamanio
        System.out.print("que cantidad de valores va a ingresar? ");
        cantidadDeVals = input.nextInt();

        int[] arrayDeNums = new int[cantidadDeVals];

// hace el loop tantes veces se ingreso, pide un numero y lo ingresa
// en el primer loop, guarda el menor como el primer numero ingresado en caso que ninguno sea menor a 0
        for (int i = 0; i < cantidadDeVals; i++) {
            System.out.print("Ingrese un valor: ");
            arrayDeNums[i] = input.nextInt();

            if (i == 0 || arrayDeNums[i] < menor) {
                menor = arrayDeNums[i];
            }
        }

        System.out.printf("El menor valor ingresado es: %d", menor);
    }
}

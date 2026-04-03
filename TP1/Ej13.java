
/* Escribir un programa para simular el lanzamiento de dos dados. El programa debe pedir el número de veces que se tiran los dados y mostrar una tabla de frecuencias indicando cuántas veces aparece cada suma. */
import java.util.Scanner;
import java.util.Random;

public class Ej13 {

    public static void main(String[] args) {
        //variables del array para la suma, numeros, scanner y para generar numero random
        int[] contadorSumas = new int[13];
        int numeroA, numeroB, contadorTirarDados;
        Scanner input = new Scanner(System.in);
        Random numeroRandom = new Random();

        // pide que se ingrese cuantas veces se tiran los dados
        System.out.print("Ingrese cuantas veces se tiraran los dados: ");
        contadorTirarDados = input.nextInt();

        //loopea contadorTirarDados veces para tirar los dados y agregar al suma al array
        for (int i = 0; i < contadorTirarDados; i++) {
            numeroA = numeroRandom.nextInt(6) + 1;
            numeroB = numeroRandom.nextInt(6) + 1;
            contadorSumas[numeroA + numeroB]++;
        }

        // loopea por todo el array para imprimir la cantidad de sumas
        for (int i = 2; i < 13; i++) {
            System.out.printf("la suma con resultado %d salio %d veces\n", i, contadorSumas[i]);
        }
    }
}

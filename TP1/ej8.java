
import java.util.Scanner;

/* Escribir un programa que lee diez números e imprima la cantidad de números negativos, positivos y ceros*/
public class ej8 {

    public static void main(String[] args) {
        //variables para los numeros y scanner
        int positivos = 0, negativos = 0, ceros = 0, numeroIngresado;
        Scanner input = new Scanner(System.in);

        // por 10 loops, pide numeros y suma al contador que correstonda
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero ");
            numeroIngresado = input.nextInt();

            if (numeroIngresado > 0) {
                positivos++;
            } else if (numeroIngresado < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.printf("hay %d positivos, %d negativos y %d ceros", positivos, negativos, ceros);
    }
}

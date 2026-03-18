
import java.util.Scanner;

/*
Escribir un programa que lee dos números e imprima la suma, producto, diferencia y cociente de los números.

 */
public class ej1 {

    public static void main(String args[]) {

        // crea un nuevo scanner
        Scanner input = new Scanner(System.in);

        // variables para los numeros
        int number1;
        int number2;
        int result;

        //pide numeros para sumar
        System.out.print("Ingresar el primero int para sumar ");
        number1 = input.nextInt();
        System.out.print("Ingrese el segundo int para sumar ");
        number2 = input.nextInt();

        //imprime la suma
        result = number1 + number2;
        System.out.printf("la suma de %d y %d es: %d\n", number1, number2, result);

        //imprime la multiplicacion
        result = number1 * number2;
        System.out.printf("la multiplicacion de %d y %d es: %d\n", number1, number2, result);

        //imprime el mod
        result = number1 % number2;
        System.out.printf("el mod de %d y %d es: %d\n", number1, number2, result);
    }
}

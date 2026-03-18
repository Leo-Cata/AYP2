/* Escribir un programa que lee un número e imprima si es par o impar utilizando el operador módulo.*/

import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {
        // scanner y variable para numero
        Scanner input = new Scanner(System.in);
        int number;

//pide un numero y lo guarda
        System.out.print("Ingrese un numero para calcular si es par o impar: ");
        number = input.nextInt();

// muestra el numero y con un ternary operator da el resultado
        System.out.printf("%d es: %s", number, (number % 2 == 0) ? "par" : "impar");
    }
}

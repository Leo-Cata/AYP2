/*Escribir el método factorial y un programa que lee un entero n no negativo y calcula su factorial del mismo.*/
import java.math.BigInteger;
import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
        //variables para scanner y guardar numero ingresado/resultado
        Scanner input = new Scanner(System.in);
        int numeroIngresado;

        //inicializa el biginteger = a 1
        BigInteger resultadoFactorial = BigInteger.ONE;

        // pide el factorial
        System.out.print("Ingrese un numero >0 para calcular su factorial con sigo mismo: ");
        numeroIngresado = input.nextInt();

        // loop que recore n veces y guarda el resultado del factorial
        for (int i = 1; i <= numeroIngresado; i++) {

            // utiliza el metodo multiply para multiplicar con el valor of i casteado como BigInteger
            resultadoFactorial = resultadoFactorial.multiply(BigInteger.valueOf(i));
        }

        // imprime el factorial 
        System.out.printf("El factorial de %d con sigo mismo es: %d", numeroIngresado, resultadoFactorial);
    }
}

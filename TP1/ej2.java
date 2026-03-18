/*Escribir un programa que reciba el radio de un círculo e imprima el diámetro (2r), la circunferencia (2πr) y el área (πr2) de este círculo. Utilizar el valor constante 3.14159 para π. */

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float pi = 3.14159f;
        // para guardar el radio del circulo
        float radio;
        // para calcular el diametro
        float diametro;
        // para calcular la circunferencia
        float circunferencia;
        // para calcular el area
        float area;

        //pide y guarda el radio
        System.out.print("Ingrese el radio del circulo ");
        radio = input.nextFloat();

        // calcula e imprime los resultados
        diametro = 2 * radio;
        circunferencia = 2 * pi * radio;
        area = pi * (radio * radio);

        System.out.printf("dado el radio %f, el diametro es: %f, la circunferencia es: %f, y el area es: %f", radio, diametro, circunferencia, area);
    }
}

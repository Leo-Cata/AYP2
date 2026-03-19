/*Escribir un programa que lee un nombre y un apellido por separado y lo muestre concatenado y separado por un espacio*/

import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {
        //variable para los nombres y scanner
        String nombre, apellido, todo;
        Scanner input = new Scanner(System.in);

        //pide nombre y apellido
        System.out.print("Ingrese nombre\n");
        nombre = input.nextLine();
        System.out.print("Ingrese Apellido\n");
        apellido = input.nextLine();

        //concatena y muestra el nombre completo
        todo = nombre + " " + apellido;
        System.out.printf("Tu nombre es: %s", todo);
    }

}

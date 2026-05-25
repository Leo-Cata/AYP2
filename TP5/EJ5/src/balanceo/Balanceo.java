package balanceo;

import doublyLinkedStack.SinglyLinkedStack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Balanceo {
    public static void main(String[] args) {
        // verifica que se haya ingresado algo por args
        if (args.length < 1) {
            System.out.println("Nombre del archivo no ingresado");
            return;
        }

        /**
         * asigna el nombre del archivo
         * crea el contador de linea
         * crea el stack o pila
         */
        String nombreArchivo = args[0];
        int lineaActual = 1;
        SinglyLinkedStack<Character> stackSimbolos = new SinglyLinkedStack<>();

        // simbolos de apertura y cierra, cada contra parte este en el mismo indice
        final String simbolosOpenings = "({[";
        final String simbolosClosings = ")}]";
        /**
         * try catch en el cual se leera y se apilara
         */
        try {
            File archivoLeido = new File(nombreArchivo);
            Scanner lector = new Scanner(archivoLeido);
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                // foreach el cual transforma la linea a un array de chars
                for (char c : linea.toCharArray()) {
                    // indexof devuelve el indice si hay caracteres que coinciden con la variable
                    if (simbolosOpenings.indexOf(c) != -1) {
                        stackSimbolos.push(c);
                    } else if (simbolosClosings.indexOf(c) != -1) {

                        // se verifica que no este vacia
                        if (stackSimbolos.isEmpty()) {
                            System.out.println("Error inesperado en la linea: " + lineaActual);
                            return;
                        }

                        // se despila para comprar
                        char apertura = stackSimbolos.pop();

                        // se compara si el index del archivo en la pila no es igual al ultimo simbolo
                        // que coincide con uno de cerrar
                        if (simbolosOpenings.indexOf(apertura) != simbolosClosings.indexOf(c)) {
                            System.out.println("Error de balanceo, " + apertura + " no coincide con: " + c
                                    + ", en la linea " + lineaActual);
                            return;
                        }
                    }
                }

                // se actualiza la linea
                lineaActual++;
            }

            lector.close();

            // se chequea que la pila este vacia al finalizar
            if (!stackSimbolos.isEmpty()) {
                System.out.println("Error, sobran elementos de apertura");
            } else {
                System.out.println("El archivo esta correctamente balanceado");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error con el archivo");
        }
    }

}

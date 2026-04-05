package Ej2;

public class Racional {

//variable del numero racional
    private int numerador, denominador;

    // static hace que la variable sea de la clase y no de un objecto
    public static int contadorObjetos;

//constructor para asignal los valores
    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;

        //contador de cuantes veces se crero un objecto
        contadorObjetos++;
    }

    //metodo para sumar racionales
    // devuelve la suma entre 2 numeros racionales
    public Racional suma(Racional arg) {
        int nuevoNumerador = this.numerador * arg.denominador + this.denominador * arg.numerador;
        int nuevoDenominador = this.denominador * arg.denominador;

        // guarda el resultado en un nuevo Racional
        Racional resultado = new Racional(nuevoNumerador, nuevoDenominador);

        // simplifica el nuevo racional antes de devolverlo
        resultado.simplificar();
        return resultado;
    }

    //metodo para restar racionales
    // devuelve la resta entre 2 numeros racionales
    public Racional resta(Racional arg) {
        int nuevoNumerador = this.numerador * arg.denominador - this.denominador * arg.numerador;
        int nuevoDenominador = this.denominador * arg.denominador;

        // guarda el resultado en un nuevo Racional
        Racional resultado = new Racional(nuevoNumerador, nuevoDenominador);

        // simplifica el nuevo racional antes de devolverlo
        resultado.simplificar();
        return resultado;
    }

    //metodo para multiplicar racionales
    // devuelve la multiplicacion entre 2 numeros racionales
    public Racional multiplicacion(Racional arg) {
        int nuevoNumerador = this.numerador * arg.numerador;
        int nuevoDenominador = this.denominador * arg.denominador;

        // guarda el resultado en un nuevo Racional
        Racional resultado = new Racional(nuevoNumerador, nuevoDenominador);

        // simplifica el nuevo racional antes de devolverlo
        resultado.simplificar();
        return resultado;
    }

    //metodo para dividir racionales
    // devuelve la division entre 2 numeros racionales
    public Racional division(Racional arg) {
        int nuevoNumerador = this.numerador * arg.denominador;
        int nuevoDenominador = this.denominador * arg.numerador;

        // guarda el resultado en un nuevo Racional
        Racional resultado = new Racional(nuevoNumerador, nuevoDenominador);

        // simplifica el nuevo racional antes de devolverlo
        resultado.simplificar();
        return resultado;
    }

    //metodo para potencias racionales
    // devuelve la potencia de racionales
    public Racional potencia(int exponente) {
        int nuevoNumerador = Math.powExact(this.numerador, exponente);
        int nuevoDenominador = Math.powExact(this.denominador, exponente);

        // guarda el resultado en un nuevo Racional
        Racional resultado = new Racional(nuevoNumerador, nuevoDenominador);

        // simplifica el nuevo racional antes de devolverlo
        resultado.simplificar();
        return resultado;
    }

    // funcion para buscar el maximo comun divisor 
    // repitiendo el modulo del numerador por el denominador
    // hasta que el resto sea 0, osea n/d= resto 0
    private int MCD(int numerador, int denominador) {
        // mientras que el denominador sea distinto de 0
        // guarda temp el denominador
        // saca el mod del num y el deno
        // asigna el numerador el deno temp
        while (denominador != 0) {
            int denominadorTemp = denominador;
            denominador = numerador % denominador;
            numerador = denominadorTemp;
        }
        return numerador;
    }

// funcion para simplificar la funcion utilizando el divisor encontrado en la funcion de simplificar
    public void simplificar() {
        int divisor = MCD(this.numerador, this.denominador);
        this.numerador /= divisor;
        this.denominador /= divisor;
    }

    // override indica al compilador que se sobreescribe el metodo estandar de impresion
    // entonces utiliza esta manera cuando se use un println
    @Override
    public String toString() {
        return (this.denominador == 0) ? this.numerador + "" : this.numerador + "/" + this.denominador;

    }
}

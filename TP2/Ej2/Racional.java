package Ej2;

public class Racional {

//variable del numero racional
    private int numerador, denominador;

//constructor para asignal los valores
    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //metodo para sumar racionales
    // devuelve la suma entre 2 numeros racionales
    public Racional suma(Racional arg) {
        int nuevoNumerador = this.numerador * arg.denominador + this.denominador * arg.numerador;
        int nuevoDenominador = this.denominador * arg.denominador;

        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    //metodo para restar racionales
    // devuelve la resta entre 2 numeros racionales
    public Racional resta(Racional arg) {
        int nuevoNumerador = this.numerador * arg.denominador - this.denominador * arg.numerador;
        int nuevoDenominador = this.denominador * arg.denominador;

        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    //metodo para multiplicar racionales
    // devuelve la multiplicacion entre 2 numeros racionales
    public Racional multiplicacion(Racional arg) {
        int nuevoNumerador = this.numerador * arg.numerador;
        int nuevoDenominador = this.denominador * arg.denominador;

        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    //metodo para dividir racionales
    // devuelve la division entre 2 numeros racionales
    public Racional division(Racional arg) {
        int nuevoNumerador = this.numerador * arg.denominador;
        int nuevoDenominador = this.denominador * arg.numerador;

        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    //metodo para potencias racionales
    // devuelve la potencia de racionales
    public Racional potencia(int exponente) {
        int nuevoNumerador = Math.powExact(this.numerador, exponente);
        int nuevoDenominador = Math.powExact(this.denominador, exponente);

        return new Racional(nuevoNumerador, nuevoDenominador);
    }
}

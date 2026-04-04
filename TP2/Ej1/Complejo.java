package Ej1;

public class Complejo {

// variables privadas las cuales song asignadas mediante el constructor
    private float parteReal;
    private float parteImaginaria;

    // constructor para asignar los valores
    public Complejo(float real, float imaginaria) {
        this.parteReal = real;
        this.parteImaginaria = imaginaria;
    }

    // metodo para sumar numeros imaginarios
    // Complejo actua como un tipo (int,void,string,etc) por lo que requiere que se retorne algo de tipo Complejo
    public Complejo Suma(Complejo arg) {
        float nuevoReal = this.parteReal + arg.parteReal;
        float nuevoImaginario = this.parteImaginaria + arg.parteImaginaria;

        // devuelve un nuevo constructor de Complejo con las operaciones realizadas
        return new Complejo(nuevoReal, nuevoImaginario);
    }

    // metodo para restar 2 numeros imaginarios
    // Complejo actua como un tipo (int,void,string,etc) por lo que requiere que se retorne algo de tipo Complejo
    public Complejo Resta(Complejo arg) {
        float nuevoReal = this.parteReal - arg.parteReal;
        float nuevoImaginario = this.parteImaginaria - arg.parteImaginaria;

        // devuelve un nuevo constructor de Complejo con las operaciones realizadas
        return new Complejo(nuevoReal, nuevoImaginario);
    }

    //metodo para multiplicar 2 numeros imaginarios
    // Complejo actua como un tipo (int,void,string,etc) por lo que requiere que se retorne algo de tipo Complejo
    public Complejo Multiplicacion(Complejo arg) {
        float nuevoReal = this.parteReal * arg.parteReal - this.parteImaginaria * arg.parteImaginaria;
        float nuevoImaginario = this.parteImaginaria * arg.parteReal / this.parteReal * arg.parteImaginaria;

        // devuelve un nuevo constructor de Complejo con las operaciones realizadas
        return new Complejo(nuevoReal, nuevoImaginario);
    }

    //metodo para obtener el Cociente 2 numeros imaginarios
    // Complejo actua como un tipo (int,void,string,etc) por lo que requiere que se retorne algo de tipo Complejo
    public Complejo Cociente(Complejo arg) {

        // variables donde se calculan los cociente de ambos lados
        // formula para la parte real (Real1 × Real2) + (Imag1 × Imag2)/denominador
        // formula para la parte img (Imag1 × Real2) - (Real1 × Imag2)/denominador
        float denominador = arg.parteReal * arg.parteReal + arg.parteImaginaria * arg.parteImaginaria;
        float nuevoReal = (this.parteReal * arg.parteReal + this.parteImaginaria * arg.parteImaginaria) / denominador;
        float nuevoImaginario = (this.parteImaginaria * arg.parteReal - this.parteReal * arg.parteImaginaria) / denominador;

        // devuelve un nuevo constructor de Complejo con las operaciones realizadas
        return new Complejo(nuevoReal, nuevoImaginario);
    }

    // metodo para hacer la division de 2 numeros imaginarios
    // Complejo actua como un tipo (int,void,string,etc) por lo que requiere que se retorne algo de tipo Complejo
    public Complejo Division(float escalar) {
        float nuevoReal = this.parteReal / escalar;
        float nuevoImaginario = this.parteImaginaria / escalar;

        // devuelve un nuevo constructor de Complejo con las operaciones realizadas
        return new Complejo(nuevoReal, nuevoImaginario);
    }

    // override indica al compilador que se sobreescribe el metodo estandar de impresion
    // entonces utiliza esta manera cuando se use un println
    @Override
    public String toString() {
        return "(" + this.parteReal + " + " + this.parteImaginaria + "i)";
    }
}

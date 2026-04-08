package Ej3;

public class Tiempo {

    private int horas, minutos, segundos;

    // constructor para asignar la hora
    // si los valores puestos se pasan del rango, setea todo como 0
    public Tiempo(int horas, int minutos, int segundos) {
        if (segundos > 59 || minutos > 59 || horas > 23) {
            System.out.print("Valores fuera de rango");
            this.horas = 00;
            this.minutos = 00;
            this.segundos = 00;
        } else {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }

    // funcion para incrementar un segundo
    public Tiempo incrementarSegundo() {
        int segundosInc = this.segundos + 1;

        // cuando los segundos llegan al minuto, incrementa un minuto y setea los segundos a 00
        if (segundosInc > 59) {
            segundosInc = 00;
            incrementarMinuto();
        }

        // devuelve el tiempo tiempo con las horas/minutos intactos pero 1 segundo incrementado
        return new Tiempo(this.horas, this.minutos, segundosInc);
    }

    // funcion para incrementar un minuto
    public Tiempo incrementarMinuto() {
        int minutoIncrementado = this.minutos + 1;

        if (minutoIncrementado > 59) {
            minutoIncrementado = 0;
            incrementarHora();
        }

        // devuelve el tiempo con las horas/segundos intacctos pero el minuto incrementado por 1
        return new Tiempo(this.horas, minutoIncrementado, this.segundos);
    }

    // funcion para incrementar una hora 
    public Tiempo incrementarHora() {
        int horaIncrementada = this.horas + 1;

        return new Tiempo(horaIncrementada, this.minutos, this.segundos);
    }

    // override indica al compilador que se sobreescribe el metodo estandar de impresion
    // entonces utiliza esta manera cuando se use un println
    @Override
    public String toString() {
        return this.horas + ":" + this.minutos + ":" + this.segundos;
    }
}

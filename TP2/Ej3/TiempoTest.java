package Ej3;

public class TiempoTest {

    public static void main(String[] args) {

        Tiempo tiempo = new Tiempo(16, 59, 59);

        System.out.print("Hora Actual: ");
        System.out.println(tiempo);
        System.out.print("Hora Incrementada: ");
        tiempo = tiempo.incrementarHora();
        System.out.println(tiempo);
        System.out.print("Minuto Incrementado: ");
        tiempo = tiempo.incrementarMinuto();
        System.out.println(tiempo);
        System.out.print("Segundo Incrementado: ");
        tiempo = tiempo.incrementarSegundo();
        System.out.println(tiempo);
    }
}

package Ej4;

public class FechaTest {
    public static void main(String[] args) {
        
        Fecha fecha1 = new Fecha(23, 11, 1999);
        Fecha fecha2 = new Fecha(11, 4, 2026);
        
        /*
        System.out.print("Fecha actual");
        System.out.println(fecha1);
        System.out.println("Fecha + 1 dia");
        System.out.println(fecha1.incrementarDia());
        System.out.println("Fecha - 1 dia");
        System.out.println(fecha2.DecrementarDia());
        System.out.println("Fecha + 1 mes");
        System.out.println(fecha1.IncrementarMes());

        System.out.println("comparacion de fechas");
        System.out.println(fecha1.compararFechas(fecha2));
*/
        System.out.println("Comparacion de fechas");
        System.out.println(fecha1.calcularDiasEntreFechas(fecha2));
    }
}

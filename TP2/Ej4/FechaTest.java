package Ej4;

public class FechaTest {
    public static void main(String[] args) {
        
        Fecha fecha1 = new Fecha(31, 12, 1998);
        
        System.out.print("Fecha actual");
        System.out.println(fecha1);
        System.out.println("Fecha + 1 dia");
        System.out.println(fecha1.incrementarDia());
        System.out.println("Fecha + 1 mes");
        System.out.println(fecha1.IncrementarMes());
    }
}

package Ej7Test;

import Ej7.*;


public class EmpleadoTest {
    public static void main(String[] args) {
        Empleado emp = new Empleado("null", 123123);
        Empleado empA = new EmpleadoAsalariado("leo", 40404040, 500.1f);
        Empleado empH = new EmpleadoHora("matias", 40404040, 25.0f,40.0f);
        Empleado empC= new EmpleadoComision("cata", 40404040, 12.5f);
        Empleado empBC= new EmpleadoBaseMasComision("sergio", 17171717, 12.5f, 500.2f);
    

        //imprimir por consola        
        System.out.println("Empleado");
        System.out.println(emp);        

        System.out.println("Empleado Asalariado");
        empA.setDNI(44444);
        System.out.println(empA.toString());
        
        System.out.println("Empleado Hora");
        System.out.println(empH.toString());
        
        System.out.println("Empleado Comision");
        System.out.println(empC.toString());

        System.out.println("Empleado Base + Comision");
        System.out.println(empBC.toString());

    }
}

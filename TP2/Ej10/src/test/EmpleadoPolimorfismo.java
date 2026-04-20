package test;
import empleados.*;

public class EmpleadoPolimorfismo {
public static void main(String[] args) {
    Empleado[] empleados = new Empleado[4];
    
    EmpleadoAsalariado ea = new EmpleadoAsalariado("leo", 123, 10);
    EmpleadoBaseMasComision ebc1 = new EmpleadoBaseMasComision("Mat", 321, 10, 50);
    EmpleadoComision ec = new EmpleadoComision("leomat", 333, 10);
    EmpleadoBaseMasComision ebc2= new EmpleadoBaseMasComision("comision", 111, 10, 50);

    empleados[0] = ea;
    empleados[1] = ebc1;
    empleados[2] = ec;
    empleados[3] = ebc2;

    // foreach que recorera por todos los elementos del array y a los de tipo EmpleadoBaseMasComision setea el % de ventas a 20
    for (Empleado empleado : empleados) {
        if(empleado instanceof EmpleadoBaseMasComision ){
            EmpleadoBaseMasComision EBC = (EmpleadoBaseMasComision) empleado;
            EBC.setPorcentajeVentas(20);
        }
        if(empleado != null){
            System.out.println(empleado.toString());
        }
    }
}
}
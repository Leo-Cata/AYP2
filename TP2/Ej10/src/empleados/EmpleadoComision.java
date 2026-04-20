package empleados;

public class EmpleadoComision extends Empleado {
    private float porcentajeVentas;

    //constructor con la superclase + porcentaje de esta classe
    public EmpleadoComision(String nombre, int DNI, float porcentaje){
        super(nombre, DNI);

        this.porcentajeVentas = porcentaje;
    }

    //getter y setter para el %
    public float getPorcentajeVentas() {
        return porcentajeVentas;
    }
    public void setPorcentajeVentas(float porcentajeVentas) {
        this.porcentajeVentas = porcentajeVentas;
    }
    
    // metodo para imprimir todos los datos
    @Override
    public String toString(){
        return super.toString() + "\nporcentaje por venta: " + this.porcentajeVentas + "%" ;
    }
}

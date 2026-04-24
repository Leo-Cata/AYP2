package empleados;

public class EmpleadoBaseMasComision extends EmpleadoComision{
    private float salarioBase;

    //constucto de la clase
    public EmpleadoBaseMasComision(String nombre, int DNI, float porcentaje, float salarioBase, float ventasTotales){
        super(nombre, DNI, porcentaje,ventasTotales);
        this.salarioBase=salarioBase;
    }

    // getter y setter del salario base
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    public float getSalarioBase() {
        return salarioBase;
    }
    
    //metodo para obtener el pago
    @Override
    public double obtenerPago() {
    	return (double) this.salarioBase + (this.getVentasTotales()*this.getPorcentajeVentas()/100);
    }
    
    // metodo para imprimir todos los datos
    @Override
    public String toString() {
        return super.toString() + "\nSalario base: " + this.salarioBase;
    }
}
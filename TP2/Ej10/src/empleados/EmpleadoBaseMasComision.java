package empleados;

public class EmpleadoBaseMasComision extends EmpleadoComision{
    private float salarioBase;

    //constucto de la clase
    public EmpleadoBaseMasComision(String nombre, int DNI, float porcentaje, float salario){
        super(nombre, DNI, porcentaje);
        this.salarioBase=salario;
    }

    // getter y setter del salario base
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    public float getSalarioBase() {
        return salarioBase;
    }
    
    // metodo para imprimir todos los datos
    @Override
    public String toString() {
        return super.toString() + "\nSalario base: " + this.salarioBase;
    }
}
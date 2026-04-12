package Ej7;

public class EmpleadoAsalariado extends Empleado{
    private float salarioMensual;

    // constructor de objecto empleado asalariado, super obtiene nombre y dni de Empleado
    public EmpleadoAsalariado(String nombre, int DNI, float salario){
        super(nombre, DNI);
        this.salarioMensual=salario;
    }
    // getters y setters para el salario
    public float getSalario(){
        return this.salarioMensual;
    }
    public void setSalario(float salario){
        this.salarioMensual = salario;
    }

    // metodo para imprimir por pantalla, con super.toString llama al metodo de toString de la clase superior
    @Override
    public String toString(){
        return super.toString() + "\nSalario mensual: " + this.salarioMensual;
    }
}
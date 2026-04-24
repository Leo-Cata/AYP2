package empleados;

public class EmpleadoHora extends Empleado{
    private float valorHora,horasTrabajadas;

    public EmpleadoHora(String nombre, int DNI, float valorHora,float horasTrabajas){
        // pasa las variables del constructor en Empleado los nombres y DNI que se pasen en este metodo
        super(nombre, DNI);

        //setea los valores pasados
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajas;
    }
    
    // metodo para obtenerPago
    @Override
    public double obtenerPago() {
    	return (double)this.valorHora * this.horasTrabajadas;
    }

    // getters y setters para las variables de esta clase
    public float getValorHora(){
        return this.valorHora;
    }
    public float getHorasTrabajadas(){
        return this.horasTrabajadas;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    public void setHorasTrabajadas(float horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

    //metodo para imprimer todos los datos
    @Override
    public String toString(){
        return super.toString()+ "\nvalor por hora: "+ this.valorHora + "\nhoras trabajadas: " + this.horasTrabajadas ;
    }
}

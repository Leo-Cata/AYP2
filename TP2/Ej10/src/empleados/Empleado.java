package empleados;

public class Empleado {

    // datos de los empleados
    private String nombre;
    private int DNI;

    // constructor para inicializar un objeto empleado
    public Empleado(String nombreCtr, int DNICtr) {
        this.nombre = nombreCtr;
        this.DNI = DNICtr;
    }

    // getters y setters para empleado
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    // metoddo par imprimir como string los datos
    @Override
    public String toString() {
        return "nombre: " + this.nombre + "\nDNI: " + this.DNI;
    }
}

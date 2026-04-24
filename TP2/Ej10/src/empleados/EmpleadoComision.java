package empleados;

public class EmpleadoComision extends Empleado {
    private float porcentajeVentas,ventasTotales;

    //constructor con la superclase + porcentaje de esta classe
    public EmpleadoComision(String nombre, int DNI, float porcentaje, float ventasTotales){
        super(nombre, DNI);

        this.porcentajeVentas = porcentaje;
        this.ventasTotales = ventasTotales;
    }

    //getter y setter para el %
    public float getPorcentajeVentas() {
        return porcentajeVentas;
    }
    public void setPorcentajeVentas(float porcentajeVentas) {
        this.porcentajeVentas = porcentajeVentas;
    }
    public float getVentasTotales() {
		return ventasTotales;
	}

	public void setVentasTotales(float ventasTotales) {
		this.ventasTotales = ventasTotales;
	}

	//implementacion obtenerpagos
    @Override
    public double obtenerPago() {
    	return (double)this.porcentajeVentas/100 * ventasTotales;
    			
    }
    // metodo para imprimir todos los datos
    @Override
    public String toString(){
        return super.toString() + "\nporcentaje por venta: " + this.porcentajeVentas + "%" + "\nVentas totales: $" + this.ventasTotales ;
    }
}

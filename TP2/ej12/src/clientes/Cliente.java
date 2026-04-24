package clientes;

import cuentas.CuentaBancaria;

public class Cliente {
	private String nombre, direccion, email;
	private int cuit, cantidadCuentas, maxNroCuentas = 10;
	private CuentaBancaria[] cuentaBancaria;

	public Cliente(String nombre, String direccion, String email, int cuit) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.cuit = cuit;
		this.cantidadCuentas = 0;
		this.cuentaBancaria = new CuentaBancaria[maxNroCuentas];
	}

	// getters y setters para cliente
	public void getCuentasBancarias() {
		for (int i = 0; i < this.cantidadCuentas; i++) {
			System.out.println(this.cuentaBancaria[i]);
		}
	}

	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		if (this.cantidadCuentas < maxNroCuentas) {
			this.cuentaBancaria[this.cantidadCuentas] = cuentaBancaria;
			this.cantidadCuentas++;
		} else {
			System.out.println("Numero maximo de cuentas alcanzado");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getEmail() {
		return email;
	}

	public int getCuit() {
		return cuit;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public int getCantidadCuentas() {
		return cantidadCuentas;
	}

	public void setCantidadCuentas(int cantidadCuentas) {
		this.cantidadCuentas = cantidadCuentas;
	}

	public CuentaBancaria[] getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(CuentaBancaria[] cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	// metodo que salcula el saldo de tolas las las cuentas
	public double calcularSaldoTotal(){
		double saldoTotal = 0;

		for (int i = 0; i < cantidadCuentas; i++) {
			saldoTotal += cuentaBancaria[i].getSaldo();
		}
		return saldoTotal;
	}

	// metodo para imprimir la informacion del cliente
	@Override
	public String toString() {
		String resultado = "Nombre: " + this.nombre + "\nDireccion: " + this.direccion +
				"\nEmail: " + this.email + "\nCUIT: " + this.cuit +
				"\nNumero de cuentas: " + this.cantidadCuentas
				+ "\nCuentas Bancarias: ";

		for (int i = 0; i < this.cantidadCuentas; i++) {
			resultado += this.cuentaBancaria[i].toString();
		}

		return resultado;
	}

}

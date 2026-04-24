package clientes;

public class Cliente {
    private String nombre, direccion, email;
    private int cuit;

    public Cliente(String nombre, String direccion, String email, int cuit){
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.cuit = cuit;
    }

    //getters y setters para cliente
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
    
    //metodo para imprimir la informacion del cliente
    @Override
    public String toString() {
        return "Nombre: "+ this.nombre + "\nDireccion: "+ this.direccion + "\nEmail: " + this.email + "\nCUIT: " + this.cuit;
    }
}

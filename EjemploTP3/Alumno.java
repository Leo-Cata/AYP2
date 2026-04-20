import java.util.Objects;

public class Alumno {

    private String nombre, mail;
    private int legajo;

    public Alumno(String nombre, String mail, int legajo) {
        this.nombre = nombre;
        this.mail = mail;
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.mail + ", " + this.legajo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        // castea obj para que sea de tipo alumno 
        Alumno other = (Alumno) obj;
        return Objects.equals(mail, other.mail);
    }

// hashcode necesario para lo de arriba
    @Override
    public int hashCode() {
        return Objects.hash(mail);
    }
}

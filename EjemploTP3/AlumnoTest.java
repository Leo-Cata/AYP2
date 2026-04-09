package EjemploTP3;

public class AlumnoTest {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("Leo", "leo@mail.com", 44);
        Alumno a2 = new Alumno("Matias", "matias@mail.com", 43);
        Alumno a3 = null;
        System.out.println(a1);
        System.out.println(a2);

        if (a1.equals(a2)) {
            System.out.print("son iguales");
        } else {
            System.out.print("No son iguales");
        }
    }
}

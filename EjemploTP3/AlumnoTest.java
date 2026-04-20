
public class AlumnoTest {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("Leo", "leo@mail.com", 44);
        Alumno a2 = new Alumno("Matias", "matias@mail.com", 43);
        Alumno a3 = null;
        Alumno a4 = new Alumno(null, null, 0);
        System.out.println(a1);
        System.out.println(a2);

        if (a1.equals(a2)) {
            System.out.print("son iguales");
        } else {
            System.out.print("No son iguales");
        }
    }
}

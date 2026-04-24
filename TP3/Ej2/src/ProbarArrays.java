import java.util.Arrays;

public class ProbarArrays {

    public static void main(String[] args) {
        int[] arrayInt = new int[10];
        String[] arrayString = new String[10];
        int[] arrayToSort = { 4, 2, 1, 24, 5, 5, 6, 7, 2341, 1, 23 };
        /*
         * equals(A, B)
         * fill(A,x)
         * copyOf(A, n)
         * copyOfRange(A, s, t)
         * toString(A)
         * sort(A)
         * binarySearch(A, x)
         */

        Arrays.fill(arrayInt, 1);
        System.out.println(Arrays.toString(arrayInt));

        System.out.println();
        Arrays.fill(arrayString, "a");
        System.out.println(Arrays.toString(arrayString));

        System.out.println();
        if (Arrays.equals(arrayInt, arrayInt)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        System.out.println();
        arrayInt = Arrays.copyOf(arrayInt, 8);
        System.out.println(Arrays.toString(arrayInt));

        System.out.println();
        arrayInt = Arrays.copyOfRange(arrayInt, 2, 3);
        System.out.println(Arrays.toString(arrayInt));

        System.out.println();
        Arrays.sort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));

        System.out.println();
        System.out.println(Arrays.binarySearch(arrayToSort, 23));
    }
}

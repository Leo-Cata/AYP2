package test;
import lista.Lista;

public class ListaTest {
    public static void main(String[] args) {
        Lista<Integer> lista1 = new Lista<>(10);
        
        lista1.addLast(1);
        lista1.addLast(2);
        lista1.addLast(3);

        System.out.println(lista1.getPos(1));
        System.out.println(lista1.getPos(2));
        System.out.println(lista1.getPos(3));

        lista1.addPos(11, 10);
        System.out.println(lista1.getPos(10));
        
        lista1.addPos(12, 4);
        lista1.remove(11);
        lista1.removePos(3);

        System.out.println();
        System.out.println(lista1.getPos(1));
        System.out.println(lista1.getPos(2));
        System.out.println(lista1.getPos(3));
        System.out.println(lista1.getPos(4));
        System.out.println(lista1.getPos(5));
        System.out.println(lista1.getPos(6));
        System.out.println(lista1.getPos(7));
        System.out.println(lista1.getPos(8));
        System.out.println(lista1.getPos(9));

    }
}

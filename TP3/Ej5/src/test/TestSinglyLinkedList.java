package test;

import singlyLinkedList.*;

public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<Object> listaLinkeada1 = new SinglyLinkedList<>(); // <Object> para que reciba cualquier tipo,
                                                                            // si no especificar

        listaLinkeada1.addFirst(1);
        System.out.println(listaLinkeada1.getFirst());
        listaLinkeada1.addFirst("asd");
        System.out.println(listaLinkeada1.getFirst());
        listaLinkeada1.addLast("ultimo");
        System.out.println(listaLinkeada1.getLast());

        System.out.println(listaLinkeada1.getSize());

        listaLinkeada1.addPos("caca", 0);
        System.out.println(listaLinkeada1.getFirst());

        System.out.println(listaLinkeada1.removeElement("caca"));
        System.out.println(listaLinkeada1.getFirst());

        SinglyLinkedList<Object> listaLinkeada2 = new SinglyLinkedList<>();
        listaLinkeada2.addFirst("args1");
        listaLinkeada2.addFirst("args2");
        listaLinkeada2.addFirst("args3");

        listaLinkeada1.concatenate(listaLinkeada2);
        System.out.println(listaLinkeada1.toString());
        System.out.println(listaLinkeada1.search("args2s"));

    }
}

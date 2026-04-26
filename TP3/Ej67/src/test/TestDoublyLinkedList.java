package test;

import doublyLinkedList.DoublyLinkedList;

public class TestDoublyLinkedList<Ele> {
    public static void main(String[] args) {
        DoublyLinkedList<Object> listaDoble = new DoublyLinkedList<>();

        listaDoble.addFirst("1");
        System.out.println(listaDoble);
        listaDoble.addFirst("2");
        listaDoble.addFirst("3");
        System.out.println(listaDoble.search("2"));
        System.out.println(listaDoble);
    }
}

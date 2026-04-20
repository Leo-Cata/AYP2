package test;

import netdatastructures.SinglyLinkedList;

public class ListTest{

    public static void main(String[] args) {
        SinglyLinkedList<String> lista1 = new SinglyLinkedList<String>();
    lista1.addFirst("primero");
    lista1.addLast("Ultimo");

    System.out.println(lista1.first());
    System.out.println(lista1.removeFirst());
    System.out.println(lista1.first());

    }
}
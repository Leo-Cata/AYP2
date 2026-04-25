package singlyLinkedList;

// es la estructura interna del objeto, de lo que tiene adentro
public class Node<Elemento> {
    private Elemento elemento; // elemento que se guarda
    private Node<Elemento> next; // referencia al siguiente elemento

    // constructor de node que requiere el elemento a guardar y referencia al
    // siguiente
    public Node(Elemento elemento, Node<Elemento> nextEle) {
        this.elemento = elemento;
        this.next = nextEle;
    }

    // funciones para traer el elemento actual/siguiente y settear el siguiente
    // elemento
    public Elemento getElement() {
        return this.elemento;
    }

    public Node<Elemento> getNext() {
        return next;
    }

    public void setNext(Node<Elemento> next) {
        this.next = next;
    }

}

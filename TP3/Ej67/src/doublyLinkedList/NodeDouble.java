package doublyLinkedList;

public class NodeDouble<Ele> {
    private Ele elemento;
    private NodeDouble<Ele> next;
    private NodeDouble<Ele> prev;

    // constructor
    public NodeDouble(Ele elemento, NodeDouble<Ele> next, NodeDouble<Ele> prev) {
        this.elemento = elemento;
        this.next = next;
        this.prev = prev;
    }

    // metodos basicos
    public Ele getElement() {
        return elemento;
    }

    public NodeDouble<Ele> getNext() {
        return next;
    }

    public NodeDouble<Ele> getPrev() {
        return prev;
    }

    public void setNext(NodeDouble<Ele> next) {
        this.next = next;
    }

    public void setPrev(NodeDouble<Ele> prev) {
        this.prev = prev;
    }
}

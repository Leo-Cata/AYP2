package doublyLinkedList;

public class DoublyLinkedList<Ele> {
    private NodeDouble<Ele> header;
    private NodeDouble<Ele> trailer;
    private int size = 0;

    // constructor
    public DoublyLinkedList() {
        // se instancian el header y el trailer si se asignan a si mismo
        header = new NodeDouble<>(null, null, null);
        trailer = new NodeDouble<>(null, null, header);
        header.setNext(trailer);
    }

    // metodos para obtener info de la lista
    public int getSize() {
        return size;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    // chequea si esta vacio, sino devuelve al siguiente de la cabeza
    public Ele getFirst() {
        if (isEmpty()) {
            return null;
        }
        return header.getNext().getElement();
    }

    // chequea si esta vacio, sino devuelve al anterior a la cola
    public Ele getLast() {
        if (isEmpty()) {
            return null;
        }
        return trailer.getPrev().getElement();
    }

    // metodo para agregar entre medio, se le pasan los elementos anterior y
    // siguientes
    private void addBetween(Ele elemento, NodeDouble<Ele> prev, NodeDouble<Ele> next) {
        NodeDouble<Ele> nuevoElemento = new NodeDouble<>(elemento, next, prev);
        prev.setNext(nuevoElemento);
        next.setPrev(nuevoElemento);
    }

    // para agregar al principio se agrega entre medio del header y el que le sigue
    public void addFirst(Ele elemento) {
        addBetween(elemento, header, header.getNext());
    }

    public void addLast(Ele elemento) {
        addBetween(elemento, trailer.getPrev(), trailer);
    }

    // remuevo x elemento, obteniendo el next/prev y asignandose cada uno al otro
    public Ele remove(NodeDouble<Ele> nodoRemover) {
        NodeDouble<Ele> prev = nodoRemover.getPrev();
        NodeDouble<Ele> next = nodoRemover.getNext();

        prev.setNext(next);
        next.setPrev(prev);
        size--;

        return nodoRemover.getElement();
    }

    // remueve el primero llamando a remover y pasando el siguiente de la cabeza
    public Ele removeFirst() {
        if (isEmpty()) {
            return null;
        }
        return remove(header.getNext());
    }

    public Ele removeLast() {
        if (isEmpty()) {
            return null;
        }
        return remove(trailer.getPrev());
    }

    /* Inserta el elemento e en la posicion n de la lista */
    public void addPos(Ele elemento, int posicion) throws IndexOutOfBoundsException {
        NodeDouble<Ele> elementoActual = header.getNext();
        if (posicion > size || posicion < 0) {
            throw new IndexOutOfBoundsException("Fuera de rango");
        } else if (size == 0 || posicion == 0) {
            addFirst(elemento);
        } else if (size == posicion) {
            addLast(elemento);
        } else {
            for (int i = 0; i < posicion - 1; i++) {
                elementoActual = elementoActual.getNext();
            }
            // una vez en la posicion
            NodeDouble<Ele> siguienteNode = elementoActual.getNext(); // se guarda el siguiente al original
            NodeDouble<Ele> nuevoSig = new NodeDouble<>(elemento, siguienteNode, elementoActual); // se crea el nuevo
                                                                                                  // siguiente pasando
                                                                                                  // el actual como el
                                                                                                  // prev y el siguiente
                                                                                                  // viejo como next
            elementoActual.setNext(nuevoSig); // se setea el nuevo sig al actual
            siguienteNode.setPrev(nuevoSig); // se setea nuevosig como el prev del siguiente original

            size++;
        }
    }

    // Elimina el elemento e de la lista
    // Retorna NULL si no lo encuentra
    public Ele removeElement(Ele elemento) {
        // se chequea si el elemento a borrar es el primero o el ultimo
        if (elemento.equals(header.getNext().getElement())) {
            removeFirst();
            return elemento;
        } else if (elemento.equals(trailer.getPrev().getElement())) {
            removeLast();
            return elemento;
        }

        // referencia al nodo actual
        NodeDouble<Ele> nodoActual = header.getNext();

        while (nodoActual != null) {
            // si elemento = elemento actual
            if (elemento.equals(nodoActual.getElement())) {
                // al siguiente del actual, setear el previo como el previo del actual
                nodoActual.getNext().setPrev(nodoActual.getPrev());
                // al prev del actual setear el siguiente como el siguiente del actual
                nodoActual.getPrev().setNext(nodoActual.getNext());

                size--;
                return elemento;
            }
            nodoActual = nodoActual.getNext();
        }

        return null;
    }

    /* Elimina elemento que se encuentra en la posicion n de la lista */
    /* Retorna NULL si no es una posición valida */
    public Ele removePos(int posicion) throws IndexOutOfBoundsException {

        // caso base cuando se va del rango
        if (posicion < 0 || posicion > size) {
            return null;
        }

        NodeDouble<Ele> nodoActual = header.getNext();
        // si no, recorre hasta posicion -1
        for (int i = 0; i < posicion; i++) {
            nodoActual = nodoActual.getNext();
        }

        // al anterior del actual, setear al siguiente el siguiente del actual
        nodoActual.getPrev().setNext(nodoActual.getNext());
        // al siguiente del actual, setear el anterior el anterior del actual
        nodoActual.getNext().setPrev(nodoActual.getPrev());

        size--;
        return nodoActual.getElement();
    }

    /* Inserta todos los elementos de la Lista l al final de la lista */
    public void concatenate(DoublyLinkedList<Ele> listaDoble) {
        // guarda el siguiente de la cabeza
        NodeDouble<Ele> nodoActual = listaDoble.header.getNext();

        // mientras que actual no sea el trailer, osea el final
        while (nodoActual != listaDoble.trailer) {

            // al la lista que se llamo, agregar al final el primer elmento de la lista2
            this.addLast(nodoActual.getElement());

            // actualiza el nodo actual
            nodoActual = nodoActual.getNext();
        }
    }

    /* Busca el elemento e dentro de la lista */
    /* Retorna el elemento si lo encuentra o Null si no está en la lista */
    public Ele search(Ele elemento) {
        NodeDouble<Ele> nodoActual = header.getNext(); // primer nodo
        while (nodoActual != trailer) { // hasta llegar al trailer
            if (elemento.equals(nodoActual.getElement())) { // chequear si los elementos son iguales
                return elemento;
            }
            nodoActual = nodoActual.getNext();
        }
        return null;
    }

    /**
     * Produces a string representation of the contents of the list. This exists
     * for debugging purposes only.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        NodeDouble<Ele> walk = header.getNext();
        while (walk != trailer) {
            sb.append(walk.getElement());
            if (walk != trailer.getPrev())
                sb.append(", ");
            walk = walk.getNext();
        }
        sb.append(")");
        return sb.toString();
    }
}

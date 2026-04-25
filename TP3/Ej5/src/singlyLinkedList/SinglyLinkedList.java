package singlyLinkedList;

// contiene la estructura de la lista implementando los nodos
public class SinglyLinkedList<Elemento> {
    // Nodos para el primer y ultimo elemento, y contador de elementos
    private Node<Elemento> head = null;
    private Node<Elemento> tail = null;
    private int size = 0;

    // metodos
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // si la lista esta vacia, devuelven null, sino el primer/ultimo elemento
    public Elemento getFirst() {
        if (isEmpty()) {
            return null;
        } else {
            return head.getElement();
        }
    }

    public Elemento getLast() {
        if (isEmpty()) {
            return null;
        } else {
            return tail.getElement();
        }
    }

    public Node<Elemento> getHead() {
        return head;
    }

    // metodo para agregar al principio
    public void addFirst(Elemento elemento) {
        head = new Node<>(elemento, head); // setea el nuevo elemento como head
        if (size == 0) {
            tail = head; // chequea que si no hay otros elemento, la cabeza y la cola son el mismo
                         // elemento
        }
        size++;
    }

    // metodo para agregar un elemento al final
    public void addLast(Elemento elemento) {
        Node<Elemento> newTail = new Node<>(elemento, null); // guarda el elemento pasado para ser la nueva tail

        if (isEmpty()) {
            head = newTail; // si esta vacia, el nuevo tail va a ser la cabeza y tail
        } else {
            tail.setNext(newTail); // sino, setea al siguiente de la cola la nueva cola
        }
        tail = newTail; // y setea la cola como la nueva cola
        size++; // le suma 1 al tamaño
    }

    public Elemento removeFirst() {
        if (isEmpty()) {
            return null; // si no hay nada para eliminar retorna null
        }
        Elemento elementoRemovido = head.getElement(); // guarda el primer elemento para retonarlo
        head = head.getNext(); // setea como la cabeza el siguiente de la cabeza
        size--; // le resta al tamaño

        if (size == 0) {
            return null; // en el caso que al eliminar el tamaño sea 0, retorna null
        }

        return elementoRemovido; // devuelve el elemento removido
    }

    /* Inserta el elemento e en la posicion n de la lista */
    public void addPos(Elemento elemento, int posicion) throws IndexOutOfBoundsException {
        // posicion--; // le resta 1 para obteneer la posicion real
        Node<Elemento> elementoActual = head; // guarda la cabeza para despues iterar
        if (posicion > size || posicion < 0) {
            throw new IndexOutOfBoundsException("Fuera de rango");
        } else if (size == 0 || posicion == 0) {
            addFirst(elemento); // si la posicion pasada es 0 agregara al principio
        } else if (size == posicion) {
            addLast(elemento); // si la posicion es igual al final agrega a lo ultimo
        } else { // si no cumple ninguno de los caso, loopea
            for (int i = 0; i < posicion - 1; i++) {
                elementoActual = elementoActual.getNext();
            }

            // cuando se obtiene el elemento anterior a la posicion
            Node<Elemento> elementoSig = elementoActual.getNext(); // guardo el siguiente original
            Node<Elemento> nuevoSig = new Node<>(elemento, elementoSig); // creo un nuevo nodo, asignando el elemento
                                                                         // pasado y el siguiente original

            elementoActual.setNext(nuevoSig); // asigno el nuevo siguiente

            size++;
        }
    }

    // Elimina el elemento e de la lista
    // Retorna NULL si no lo encuentra
    public Elemento removeElement(Elemento elemento) {
        // si el elemento a eliminar es igual al de la cabeza, removefirst()
        if (elemento.equals(head.getElement())) {
            removeFirst();
            return elemento;
        }

        // elemento anterior = primer ele, elemento actual = primer+1
        Node<Elemento> elementoAnterior = head;
        Node<Elemento> elementoActual = head.getNext();

        // mientras que el elemento actual no sea null
        while (elementoActual != null) {

            // si el elemento = elemento actual
            if (elemento.equals(elementoActual.getElement())) {

                // anterior = siguiente del actual
                elementoAnterior.setNext(elementoActual.getNext());

                // si el sig del actual es null, antonces el anterior va a ser la cola
                if (elementoActual.getNext() == null) {
                    tail = elementoAnterior;
                }

                size--;
                return elemento;
            }

            // si no se cumple nada de lo anterior, el elemento anterior va a ser el actual
            // el actual va a ser el siguiente
            elementoAnterior = elementoActual;
            elementoActual = elementoActual.getNext();
        }
        return null;
    }

    /* Inserta todos los elementos de la Lista l al final de la lista */
    public void concatenate(SinglyLinkedList<Elemento> lista) {

        // obtiene la cabeza de la lista pasada
        Node<Elemento> elementoActual = lista.getHead();

        // si elemento acctual no es null
        while (elementoActual != null) {

            // this = lista que no pasas, agregar elementos de lista2
            this.addLast(elementoActual.getElement());

            // obtiene el siguiente
            elementoActual = elementoActual.getNext();
        }
    }

    /* Busca el elemento e dentro de la lista */
    /* Retorna el elemento si lo encuentra o Null si no está en la lista */
    public Elemento search(Elemento elemento) {
        Node<Elemento> elementoActual = head;
        while (elementoActual != null) {
            if (elemento.equals(elementoActual.getElement())) {
                return elemento;
            }
            elementoActual = elementoActual.getNext();
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
        Node<Elemento> walk = head;
        while (walk != null) {
            sb.append(walk.getElement());
            if (walk != tail)
                sb.append(", ");
            walk = walk.getNext();
        }
        sb.append(")");
        return sb.toString();
    }
}

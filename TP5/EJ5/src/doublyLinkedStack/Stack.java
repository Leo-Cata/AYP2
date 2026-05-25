package doublyLinkedStack;

public interface Stack<E> {

    /** Retorna la cantidad de elementos en la pila */
    int size();

    /** Retorna true si la pila está vacía */
    boolean isEmpty();

    /** Retorna el elemento en el tope sin quitarlo */
    E top();

    /** Agrega un elemento al tope de la pila */
    public void push(E elemento); // En el TAD de la materia, SÍ es void.

    /** Remueve y retorna el elemento del tope de la pila */
    E pop();
}

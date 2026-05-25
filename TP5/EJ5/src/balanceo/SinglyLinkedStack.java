package doublyLinkedStack;

import net.datastructures.SinglyLinkedList;

public class SinglyLinkedStack<E> implements Stack<E> {

	private final SinglyLinkedList<E> singlyStack = new SinglyLinkedList<>();

	// constructor
	public SinglyLinkedStack() {
	}

	@Override
	public void push(E elemento) {
		singlyStack.addFirst(elemento);
	}

	@Override
	public E pop() {
		return singlyStack.removeFirst();
	}

	@Override
	public E top() {
		return singlyStack.first();
	}

	@Override
	public int size() {
		return singlyStack.size();
	}

	@Override
	public boolean isEmpty() {
		return singlyStack.isEmpty();
	}
}

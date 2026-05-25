package doublyLinkedStack;
/**
 * implementacion de lista doble para pila
 * */

import net.datastructures.DoublyLinkedList;

public class DoublyLinkedStack<E> implements Stack<E>{
	
	private DoublyLinkedList<E> doubleStack = new DoublyLinkedList<E>();
	
	// constructors
	public DoublyLinkedStack(DoublyLinkedList<E> doubleStack) {
		this.doubleStack = doubleStack;
	}

	/**
	 * implementacion de push
	 * @param elemento para agregar al final
	 * */
	@Override
	public void push(E elemento) {
		doubleStack.addFirst(elemento);
	}
	
	/**
	 * implementaccion de pop
	 * */
	@Override
	public E pop() {
		return doubleStack.removeFirst();
	}
	
	/**
	 * implementacion de top 
	 **/
	@Override
	public E top() {
		return doubleStack.first();
	}
	
	/**
	 * implementacion size
	 * */
	@Override
	public int size() {
		return doubleStack.size();
	}
	
	/**
	 * implementacion isEmpty
	 * */
	@Override
	public boolean isEmpty() {
		return doubleStack.isEmpty();
	}
	
	}
package doublyLinkedStack;

public class ArrayStack<E> implements Stack<E> {
	
	private E[] arrayStack;
	private int indice = -1;
	
	public ArrayStack(int size) {
		arrayStack = (E[]) new Object[size];
	}
	
	@Override
	public void push(E elemento) {
		if(indice == arrayStack.length -1) {
			return;
		}else {
			indice++;
			arrayStack[indice] = elemento;
		}
	}
	
	@Override
	public E pop() {
		if(indice == -1) {
			return null;
		}
		E temp = arrayStack[indice];
		arrayStack[indice] = null;
		indice--;
		return temp;
	}
	
	@Override
	public E top() {
		return arrayStack[indice];
	}
	
	@Override
	public int size() {
		return indice+1;
	}
	
	@Override
	public boolean isEmpty() {
		return indice == -1;
	}
}

/*	A simple stack class
	The first way to implement this data structure: inheritance
	ADT of the stack class: push, pop, isempty*/
	

	
public class Stack extends List {
	public Stack () {
		super("The stack");
	}

	public void push (Object obj) {
		super.insertAtFront(obj);
	}
	
	public Object pop () {
		return super.removeFromFront();
	}
	
	public boolean isEmpty () {
		return super.isEmpty();
	}
	/* For software engineering reasons, we'll add a print method.
	   When we're happy, it must be removed.*/
	public String print () {
		return super.print();
	}
}
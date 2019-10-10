 //Basic Node Class
 
 public class Node {
	private Object data;
	private Node next; // self-referential code
	
	public Node (Object obj, Node nextNode) {
		data = obj;
		next = nextNode;
	}
	
	public Node (Object obj) {
		data = obj;
		next = null;
	}
	
	public void setObject (Object obj){
		data = obj;
	}
	
	public void setNext (Node nextNode) {
		next = nextNode;
	}
	
	public Object getObject () {
		return data;
	}
	
	public Node getNext () {
		return next;
	}
}
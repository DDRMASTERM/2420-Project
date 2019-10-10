// List class

public class List {
	private Node firstNode;
	private Node lastNode;
	private String name;
	private int size;
	
	public List() {
		name = "default list";
		firstNode = lastNode = null;
	}
		
	public List(String s) {
		name = s;
		firstNode = lastNode = null;
	}
	
	public void insertAtFront (Object insertItem) {
		if (isEmpty()) {
			firstNode = lastNode = new Node(insertItem);
		}
		else{
			firstNode = new Node(insertItem, firstNode);
		}
		size++;
	}
	
	public Object removeFromFront (){
		Object removeItem = null;
		if (isEmpty()) {
			removeItem = "This list is empty!";
			return removeItem;
		}
		removeItem = firstNode.getObject();
		if (firstNode.equals(lastNode)) {
			firstNode = lastNode = null;
		}
		else{
			firstNode = firstNode.getNext();
		}
		size--;
		return removeItem ;
	}
	
	public void insertAtBack (Object insertItem) {
		Node newNode = new Node(insertItem);
		Node tempNode = firstNode;
		if (isEmpty()) {
			firstNode = lastNode = new Node(insertItem);
		}
		else{
			while(tempNode.getNext()!=null){
				tempNode=tempNode.getNext();
			}
			lastNode = newNode;
			tempNode.setNext(lastNode);
		}
		size++;
	}
	public void insertAtBack2 (Object insertItem) {
		Node newNode = new Node(insertItem, firstNode);
		Node tempNode = firstNode;
		if (isEmpty()) {
			firstNode = lastNode = new Node(insertItem);
		}
		else{
			while(tempNode.getNext()!=null){
				tempNode=tempNode.getNext();
			}
			lastNode = newNode;
			tempNode.setNext(lastNode);
		}
		size++;
	}
	public Object removeFromBack(){
		Object removeItem = null;
		Node tempNode = firstNode;
		if (isEmpty()) {
			removeItem = "This list is empty!";
			return removeItem;
		}
		removeItem = lastNode.getObject();
		if (firstNode.equals(lastNode)) {
			firstNode = lastNode = null;
		}
		else{
			while(tempNode.getNext().getNext()!=null){
				tempNode=tempNode.getNext();
			}
			tempNode.setNext(null);
			lastNode=tempNode;
		}
		size--;
		return removeItem ;
		
	}
	
	
	
		
	
	
	public boolean isEmpty() {
		return (firstNode == null);
	}
	
	public int getSize (){
		return size;
	}
	
	public String print () {
		String result = "";
		String newline = "\n";
		if (isEmpty()) {;
			return result;
		};
		Node current = firstNode;
		while (current!=null){
			result = current.getObject()+result;
			current = current.getNext();
			}
		result+= newline;
		return result;
	}
}
	
	
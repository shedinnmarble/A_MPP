package Q3;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class Queue {
	class Node {
		Object value;
		Node next;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	private int size=0;
	private Node head;
	private Node tail;

	 public void add(Object newValue) {
		Node n = new Node();
		if(head == null) head = n;
		else tail.next = n;
		tail = n;
		tail.value = newValue;
		size++;

	}
	synchronized public Object remove() {
		if(head == null) return null;
		Node n = head;
		head = n.next;
		size--;
		return n.value;

	}
}

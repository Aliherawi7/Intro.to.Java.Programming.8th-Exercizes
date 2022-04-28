
public class Node<E> {
	int id;
	E item;
	Node next;
	
	public Node(int id, E item) {
		this.id = id;
		this.item = item;
		next = null;
	}

}

import java.util.Scanner;

public class LinkedList<E>{
	Node<E> first;
	
	public LinkedList() {
		first = null;
	}
	public void add(int id, E value) {
		Node n = new Node(id, value);
		if(first ==null)
			first = n;
		else
			n.next = first;
		first = n;
		
	}
	
	public Node find(int id){
		Node temp = first;
		while(temp != null) {
			if(temp.id == id) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	public Node deleteLast() {
		Node temp;
		if(first == null) {
			return null;
		}else if(first.next == null) {
			 temp = first.next;
			 first = null;
			 return temp;
		}else {
			temp = first;
			while(temp.next != null) {
				temp = temp.next;
			}
			Node curr = temp;
			temp.next = curr.next;
			return temp;
		}
			
		
	}
	
	public void printList() {
		Node top = first;
		while(top != null) {
			System.out.print(top.item+" ");
			top = top.next;
		}
	}
	
	public void reverseList() {
		Node p1, p2, p3;
		
		if (first == null || first.next == null) return;
		
		p1 = first; // p1 = mohammd
		p2 = p1.next; // p2 = ahmad  
		p1.next = null;  // p1.next = null;
		while (p2 != null) { //while p2 is not empty
			p3 = p2.next; // p3 = Ali
			p2.next = p1; // Ali => mohammad
			p1 = p2; // mohammad => Ahmad
			p2 = p3; // Ahmad => Ali
		}
		first = p1;
	}
	
	public boolean contain(E item) {
		Node temp = first;
		while(temp != null) {
			if(temp.item.equals(item)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public int keyOf(E item) {
		Node temp = first;
		while(temp != null) {
			if(temp.item.equals(item)) {
				return temp.id;
			}
			temp = temp.next;
		}
		return -1;
	
	}
	
	public void clear() {
		first = null;
	}

	
}

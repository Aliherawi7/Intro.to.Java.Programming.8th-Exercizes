package LinkedList;

import java.util.NoSuchElementException;

public class DoubleLinkedList {
	private int size;
	private Link head, tail = null;
	
	public DoubleLinkedList() {
		head = tail =  null;
		size = 0;
	}
	public void add(int key, String item){
		Link newNode = new Link(key, item);
		// if list is empty head and tail point to newNode
		if(head == null) {
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
			size++;
			
		}else {
			// add new item to the end of list
			tail.next = newNode;
			// newNode.previous set to tail
			newNode.previous = tail;
			// newNode becomes new tail
			tail = newNode;
			// tail's next point to null
			tail.next = null;
			
			size++;
		}
	}
	
	public void printList() {
		Link current = head;
		if(head == null) {
			System.out.println("Double linked list is empty!");
			return; 
		}
		
		System.out.println("Double linked list items: ");
		while(current != null) {
			System.out.print(current.item+" ");
			current = current.next;
		}
		
	}
	
	public int ListLength() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public Link find(int key) {
		Link temp = head;
		while(temp != null) {
			if(temp.key == key) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	

}

import java.util.Iterator;

public class PriorityQueue {
	private int maxSize;
	private int [] Array;
	private int nItems;
	public PriorityQueue(int size) {
		maxSize = size;
		Array = new int[size];
		nItems = 0;
	}
	
	public void insert(int item) {
		int i ;
		if(nItems == 0) {
			Array[nItems] = item;
			++nItems;
		}else {
			for(i = nItems; i>=0; i--) 
				if(item > Array[i])
					Array[i+1] = Array[i];
				else 
					break;
			Array[i+1] = item;
			nItems++;
		}
	}
	
	public void remove() {
		--nItems;
	}
	
	public int getMin() {
		return nItems-1;
	}
	
	public int getMax() {
		return Array[0];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public void display() {
		for(int i =0; i < nItems; i++) {
			System.out.print(Array[i] + " ");
		}
	}

}

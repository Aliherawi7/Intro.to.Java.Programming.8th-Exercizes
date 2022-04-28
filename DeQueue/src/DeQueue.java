
public class DeQueue {
	private int addleft, addright;
	private int size;
	private final int remLeft = 0, remRight = size-1;
	private Object[] deQueue;
	public DeQueue(int size) {
		this.size = size;
		deQueue = new Object[size];
		addright = size-1;
		addleft = 0;
	}
	
	public void insertLeft(Object o) throws IndexOutOfBoundsException {
		if(isFull()) {
			throw new IndexOutOfBoundsException();
		}
		deQueue[addleft] = o;
		addleft++;
	}
	
	public void insertRight(Object o) throws IndexOutOfBoundsException {
		if(isFull()) {
			throw new IndexOutOfBoundsException("Stack over flow");
		}
		
		deQueue[addright] = o;
		addright--;
	}
	
	public void removeRight()throws IndexOutOfBoundsException {
		if(addright == size-1) {
			throw new IndexOutOfBoundsException("Sorry there is not any item at right");
		}
		++addright;
	}
	
	public void removeLeft()throws IndexOutOfBoundsException {
		if(addleft == 0) {
			throw new IndexOutOfBoundsException("Sorry there is not any item at left");
		}
		--addleft;
	}
	
	public boolean isFull() {
		if(addleft + (size-addright) == size-1) {
			return true;
		}
		return false;
	}
	public boolean isEmpty() {
		if(addleft == 0 && addright == size-1) {
			return true;
		}
		return false;
	}
	
	public void display() {
		System.out.println("the left side:");
		for(int i = 0; i < addleft; i++) {
			System.out.print(deQueue[i] + " ");
		}
		System.out.println();
		System.out.println("the right side:");
		
		for(int i = addright+1; i < size; i++) {
			System.out.print(deQueue[i] + " ");
		}
		
	}

}


public class  MyQueue {
	private int rear;
	private int front;
	private int size;
	private Object[] queueArray;
	public MyQueue(int size) {
		this.size = size;
		queueArray =  new Object[size];
		rear = 0;
		front = 0;
	}
	
	public void enQueue(Object o) throws IndexOutOfBoundsException{
		if(isFull()) {
			throw new IndexOutOfBoundsException();
		}
		if(rear == size ) {
			rear = 0;
		}
		if(front == size) {
			front = 0;
		}
		queueArray[rear] = o;
		rear++;
		
	}
	public Object deQueue() throws IndexOutOfBoundsException{
		if(isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		if(front == rear) {
			front = rear = 0;
		}
		Object holder = queueArray[front];
		queueArray[front] = null;
		front++;
		return holder;
	}
	public boolean isEmpty() {
		if(front == rear) {
			front = rear = 0;
			return true;
		}
		if(front == 0 && rear == 0) {
			return true;
		}
		
		return false;	
	}
	
	public boolean isFull() {
		if(rear == size && front == 0) {
			return true;
		}
		if(rear - front == -1) {
			return true;
		}
		
		return false;
	}
	public void display() {
		if(rear > front) {
			for(int i = front+1; i<rear; i++) {
			System.out.println(i+ ": "+ queueArray[i]);
			}
		}else if(rear < front) {
			for(int i = front; i < size; i++) {
				System.out.println(i + ": "+ queueArray[i]);
			}
		}
		
	}
	
	public int headOfqueue() {
		return front;
	}
	public int backOfqueue() {
		return rear;
	}
	
	
	
	
	

}

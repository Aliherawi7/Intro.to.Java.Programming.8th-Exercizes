
public class Test {

	public static void main(String[] args) {
		MyQueue mq = new MyQueue(5);
		mq.enQueue(20);
		mq.enQueue(25);
		mq.enQueue(30);
		mq.enQueue(35);
		mq.enQueue(35);
		mq.deQueue();
		mq.deQueue();
		
		mq.display();
		System.out.println("is Empty: " + mq.isEmpty());
		System.out.println("is full: " + mq.isFull());
		System.out.println("Head of queue: " + mq.headOfqueue());
		System.out.println("End of queue: " + mq.backOfqueue());
	}

}

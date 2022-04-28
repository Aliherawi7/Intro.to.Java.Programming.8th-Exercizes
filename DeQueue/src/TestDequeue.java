
public class TestDequeue {

	public static void main(String[] args) {
		DeQueue dq = new DeQueue(10);
		dq.insertLeft(10);
		dq.insertLeft(20);
		dq.removeLeft();
		
		dq.insertRight(100);
		dq.insertRight(200);
		dq.insertRight(300);
		dq.removeRight();
		
		dq.display();

	}

}

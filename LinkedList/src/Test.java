
public class Test {

	public static void main(String[] args) {
		LinkedList<Double> lk = new LinkedList();
		lk.add(1, 3.249);
		lk.add(2, 2.95);
		lk.add(3, 20.4);
		lk.reverseList();
		
		//lk.printList();
		lk.clear();
		System.out.println("\n"+ lk.contain(20.4));
		System.out.println("\n"+ lk.keyOf(2.95));
		lk.printList();
	}

}

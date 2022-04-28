package Ex7;

public class Test {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		for(int i=0; i<11; i++) {
			list.add("Hello world");
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
		
		
	}

}

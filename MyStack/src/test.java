
public class test {

	public static void main(String[] args) {
		MyStack ms = new MyStack(2);
		ms.push(10);
		ms.push(12);
		ms.pop();
		ms.pop();
		try {
			ms.pop();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(ms.isEmpty());
		System.out.println(ms.isFull());
		
		
			
			
		
		
		
		
	}

}

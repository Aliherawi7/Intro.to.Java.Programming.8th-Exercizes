
public class MyStack {
	Object [] list = null;
	static int counter =0;
	public MyStack(int size) {
		list = new Object[size];
	}
	
	public void push(Object o) {
		if(counter > size()-1) {
			System.out.println("Stack OverFlow");
		}else {
			list[counter] = o;
			counter++;
		}
		
	}
	
	public Object peek() throws ArrayIndexOutOfBoundsException{
		if(counter < 0) {
			throw new ArrayIndexOutOfBoundsException("Stack UnderFlow");
		}else
			return list[counter-1];
	}
	
	public Object pop() throws ArrayIndexOutOfBoundsException{
		if(counter <= 0) {
			throw new ArrayIndexOutOfBoundsException("Stack UnderFlow");
		}else {
			Object holder = list[counter-1];
			list[counter-1] = null;
			counter--;
			return holder;
		}
		

	}
	
	public int  size() {
		return list.length;
	}
	
	public boolean isEmpty() {
		if(counter == 0) {
			return true;
		}else return false;
	}
	
	public boolean isFull() {
		if(size() == counter) {
			return true;
		}else return false;
	}

}

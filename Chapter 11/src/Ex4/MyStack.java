package Ex4;

import java.util.ArrayList;

public class MyStack extends ArrayList{
	public MyStack() {
		super();
	}
	
	public boolean isEmpty() {
		return isEmpty();
	}
	public int getSize() {
		return size();
	}
	public Object peek() {
		return get(getSize()-1);
	}
	public Object pop() {
		Object o = get(getSize()-1);
		remove(getSize()-1);
		return o;
	}
	public void push(Object o) {
		add(o);
	}
	public Object search(Object o) {
		return lastIndexOf(o);
	}
	public String toString() {
		return "stack: " + super.toString();
	}
	
	
}

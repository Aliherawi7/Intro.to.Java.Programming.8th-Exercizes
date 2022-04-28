package Ex7;

public class ArrayList {
	private String[] list;
	private int index;
	public ArrayList() {
		list = new String[10];
	}

	public void add(Object o) {
		if(index == list.length-1) {
			index = list.length-1; //add new item to the end of the old array
			String[] list = new String[2 * this.list.length];
			for(int i=0; i<this.list.length; i++) {
				list[i] = this.list[i];
			}	 
			this.list = list;
		}
		list[index] = (String) o;
		index++;
	}
	
	public void add(int index, Object o) {
		if(index >=0 && index < list.length)
			list[index] = (String) o;
		
	}
	public void clear() {
		for(int i =0; i<list.length; i++) {
			list[i] = null;
		}
	}
	public boolean contains(Object o) {
		boolean alarm = false;
		for(int i =0; i<list.length; i++) {
			if(list[i].equals(o)) {
				alarm = true;
				return true;
			}
			if(alarm)
				break;
		}
		return false;
	}
	public Object get(int index) {
		return (String) list[index];
	}
	public int indexOf(Object o) {
		boolean alarm =false;
		for(int i =0; i<list.length; i++) {
			if(list[i].equals(o)) {
				alarm = true;
				return i;
			}
			if(alarm)
				break;
		}
		return -1;
	}
	public boolean isEmpty() {
		for(int i =0; i<list.length; i++) {
			if(! list[i].isBlank()) 
				return false;
		}
		return true;
			
	}
	public int lastIndexOf(Object o) {
		int indexHolder = -1;
		for(int i =0; i<list.length; i++) {
			if(list[i].equals(o)) 
				indexHolder = i;
		}
		return indexHolder;
	}
	public boolean remove(Object o) {
		for(int i =0; i<list.length; i++) {
			if(list[i].equals(o)) {
				list[i] = null;	
				return true;
			}
		}
		return false;
	}
	public int size() {
		int size = 0;
		for(int i =0; i<list.length; i++) {
			if(!(list[i] == null))
				size++;
		}
		return size;
	}
	public boolean remove(int index) {
		if(index >=0 && index <list.length) {
			list[index] = null;
			return true;
		}else return false;
		
		
	}
	public void set(int index, Object o) {
		if(index >=0 && index <list.length) 
			list[index] = (String) o;
		
	}
	
}

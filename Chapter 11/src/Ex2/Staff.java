package Ex2;

public class Staff extends Employee{
	String title;
	
	public Staff(String name, String address, String phoneNumber, String emailAddress, 
			String office, long salary, String title) {
		
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.title = title;
	}
	public String toString() {
		return "class name: Staff" + "person name: " + super.name;
	}
}

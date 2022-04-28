package Ex2;

public class Person {
	String name;
	String address;
	String phoneNumber;
	String emailAddress;
	public Person(String name, String address, String phoneNumber, String emailAddress) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	public String toString() {
		return "class name: Person" + "person name: " + name;
		
	}
}

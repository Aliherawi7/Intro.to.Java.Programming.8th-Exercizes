package Ex2;

public class Employee extends Person{
	String office;
	long salary;
	MyDate hiredDate;
	
	public Employee(String name, String address, String phoneNumber, String emailAddress, 
			String office, long salary) {
		
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.hiredDate = new MyDate();
	}
	public String toString() {
		return "class name: Employee" + "person name: " + super.name;
	}
	
	
	
	
}
class MyDate {
	int year, month, day;
	
	public MyDate(){
		java.util.Date date = new java.util.Date();
		this.year = date.getYear();
		this.month = date.getMonth();
		this.day = date.getDay();
		
	}
	
}

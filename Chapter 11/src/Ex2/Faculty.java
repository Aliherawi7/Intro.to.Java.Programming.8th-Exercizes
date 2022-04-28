package Ex2;

public class Faculty extends Employee{
	int officeHours ;
	int rank;
	public Faculty(String name, String address, String phoneNumber,
			String emailAddress, String office, long salary, int officeHours, int rank) {
		
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.officeHours  = officeHours;
		this.rank = rank;
		
	}
	public String toString() {
		return "class name: Faculty" + "person name: " + super.name;
	}
}

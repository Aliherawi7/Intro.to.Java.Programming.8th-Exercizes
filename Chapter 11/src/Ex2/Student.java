package Ex2;

public class Student extends Person{
	public final String FRESHMAN_STATUS = "freshman";
	public final String SOPHOMORE_STUTUS = "sophomore";
	public final String JUNIOR_STUTUS = "junior";
	public final String SENIOR_STUTUS = "senior";
	String status;
	public Student(String name, String address, String phoneNumber, String emailAddress, String status ) {
		super(name, address, phoneNumber, emailAddress);
		this.status = status;
	}
	public String toString() {
		return "class name: Student" + "person name: " + super.name;
	}
}

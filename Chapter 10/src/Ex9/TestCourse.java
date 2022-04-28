package Ex9;

public class TestCourse {
	public static void main(String[] args) {
		Course n = new Course("math");
		n.addStudent("Ali");
		n.addStudent("hamed");
		n.dropStudent("hamed");
		String[] s = n.getStudents();
		for(int i = 0; i< n.numberOfStudents; i++)
			System.out.println(s[i]);
	}
}

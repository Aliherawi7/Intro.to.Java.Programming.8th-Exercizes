package Ex5;

public class test {

	public static void main(String[] args) {
		Course a = new Course("Math");
		a.addStudent("Karim");
		a.addStudent("Ahmad");
		a.addStudent("Zora");
		String[] s = a.getStudents();
		for(int i =0; i<s.length; i++ ) {
			System.out.println(s[i]);
		}
	}

}

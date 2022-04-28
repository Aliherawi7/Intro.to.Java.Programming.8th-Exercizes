package Ex5;
public class Course {
	private String name;
	private java.util.ArrayList list = new java.util.ArrayList();
	private int numberOfStudents ;
	
	public  Course( String courseName) {
		name = courseName;
	}
	
	public String getCourseName() {
		return name;
	}
	public void addStudent(String student) {
		list.add(student);
	}
	public void dropStudent(String student) {
		list.remove(student);
	}
	public String[] getStudents() {
		
		String[] list = this.list.toString().split(", ");
		// to remove the "[" and "]" from the first word and the last
		list[0] = list[0].substring(1, list[0].length()-1);
		list[list.length-1] = list[list.length-1].substring(0, list[list.length-1].length()-1);
		
		return list;
	}
	public int getNumberOfStudents() {
		return list.size();
	}
	
	
}

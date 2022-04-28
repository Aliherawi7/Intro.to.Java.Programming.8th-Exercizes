package Ex9;

public class Course {
	String courseName;
	String [] students = new String[100];
	int numberOfStudents;
	String[] bigArray = new String[500];
	int studentNumberHolder;
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void addStudent(String student) {
		if( numberOfStudents == 99) {
			for(int i =0; i<numberOfStudents; i++) {
				bigArray[i+studentNumberHolder] = students[i];
			}
			studentNumberHolder +=numberOfStudents;
			numberOfStudents =0;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	public void dropStudent(String student) {
		int hold =-1;
		for(int i =0; i < student.length(); i++) {
			if(student.equals(students[i]))
				hold = i;	
		}
		students[hold] =  "";
		
	}
	public void clear() {
		int hold = numberOfStudents;
		for(int i=0; i < hold; i++) {
			students[i] = "";
			numberOfStudents--;
		}
	}
	public String[] getStudents() {
		return students;
	}
	public int getNumberOfStudents() {
		if(studentNumberHolder>0)
			return studentNumberHolder+numberOfStudents;
		else 
			return numberOfStudents;
	}
	
}

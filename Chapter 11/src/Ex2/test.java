package Ex2;

public class test {

	public static void main(String[] args) {
		Person p = new Person("Ali", "Herat", "078954344", "falan@flan.com");
		Student stu = new Student("Ahmad", "Herat", "078954344", "falan@flan.com","junior");
		Employee Em = new Employee("alim", "Herat", "078954344", "falan@flan.com","management", 1000);
		Faculty fa = new Faculty("karim", "Herat", "078954344", "falan@flan.com","management", 1000, 8, 3);
		Staff stf = new Staff("john", "Herat", "078954344", "falan@flan.com","management", 1000, "cleaner");
		
		System.out.println(p.toString());
		System.out.println(stu.toString());
		System.out.println(Em.toString());
		System.out.println(fa.toString());
		System.out.println(stf.toString());
		

	}

}

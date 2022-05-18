package primitive.practice;

public class PersonTest {
	public static void main(String[] args) {

		// First we'll create a person, JOE using 2 args constructor.
		Person person1 = new Person("Amzad", "45");

		// Next we'll create a person, using 1 arguments
		Person person2 = new Person("39");

		System.out.println(person1);
		System.out.println(person2);
		
		person2.setInstanceName("Nikhath");
		person2.setAge("39");
		System.out.println(person2);
		
		// And now the noargs constructor, and using setters
		Person person3 = new Person();
		System.out.println(person3);
		person3.setAge("16");
		person3.setInstanceName("Arshad");
		System.out.println(person3);
	}
}
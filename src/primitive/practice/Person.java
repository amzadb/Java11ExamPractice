package primitive.practice;

public class Person {
	static String name = "UNKNOWN"; // Class Variable
	String instanceName = "UNKNOWN"; // Instance Variable;
	String age = "25"; // Instance Variable initialized;

	// No Args Constructor
	public Person() {

	}

	// Single Parameter Constructor.
	public Person(String age) {
		// Constructors are perfect examples of how a method parameter
		// name can have same name as class or instance variable name.

		// In this constructor, the Person instance age does not get
		// set at all, because age not qualified by 'this'.
		// This is a common mistake and may be tested on exam
		age = age;
	}

	// Two Args Constructor
	public Person(String name, String age) {
		// constructor parameters are named and typed the same as the
		// class variable 'name' and the instance variable 'age'

		// Correctly setting object's age using 'this' qualifier
		this.age = age;

		// instanceName is an instance variable and has different
		// name from the parameter which will be assigned to it, so
		// this not required, but good practice to use it

		// Also setting static variable name in same assignment
		// statement
		this.instanceName = Person.name = name;
	}

	public String toString() {
		// instance and class variable names have scope within all
		// non-static methods of the enclosing class, no qualifier
		// required. Qualifiers do help readability though
		return instanceName + " is " + age + " years old (" + getAgeGroupClassification() + ")";
	}

	// This method tests local variable declaration in if/else blocks
	public String getAgeGroupClassification() {

		// Declaring a local variable ageClassification, initializing to "GenY"
		String ageClassification = "GenZ";

		// This local variable age 'shadows' the instance variable age
		int age = Integer.parseInt(this.age);

		if (age >= 90) {
			ageClassification = "The Greatest Generation";
		} else if (age >= 80) {
			ageClassification = "The Silent Generation";
		} else if (age >= 70) {
			ageClassification = "Baby boomers";
		} else if (age >= 50) {
			ageClassification = "GenX";
		} else if (age >= 35) {
			ageClassification = "GenY";
		} else if (age >= 20) {
			ageClassification = "GenZ";
		}
		return ageClassification;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public static String getName() {
		return name;
	}

	public String getInstanceName() {
		return instanceName;
	}

	public String getAge() {
		return age;
	}
	
	

}
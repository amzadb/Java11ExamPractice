package string.handling;

public class String7 {

	public static void main(String[] args) {
		String s1 = "";
		System.out.println("s1: " + s1.isBlank() + " " + s1.isEmpty());

		String s2 = " ";
		System.out.println("s2: " + s2.isBlank() + " " + s2.isEmpty());

		String s3 = "Program";
		System.out.println("s3: " + s3.isBlank() + " " + s3.isEmpty());

		String s4 = new String();
		System.out.println("s4: " + s4.isBlank() + " " + s4.isEmpty());

		String s5 = new String("");
		System.out.println("s5: " + s5.isBlank() + " " + s5.isEmpty());

		String s6 = new String(" ");
		System.out.println("s6: " + s6.isBlank() + " " + s6.isEmpty());

		String s7 = new String("Program");
		System.out.println("s7: " + s7.isBlank() + " " + s7.isEmpty());
	}

}

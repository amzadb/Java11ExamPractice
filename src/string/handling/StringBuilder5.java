package string.handling;

public class StringBuilder5 {

	public static void main(String[] args) {

		// Create empty StringBuilder
		StringBuilder builder = new StringBuilder();

		// Add some code with leading/trailing whitespcace
		builder.append("  ABCD                 ");
		System.out.println("Original Value of builder = *" + builder + "*");
		System.out.println("Length of builder = " + builder.length());
		System.out.println("Capacity of builder = " + builder.capacity());

		// What do you think trimToSize does?
		builder.trimToSize();
		System.out.println("Current Value of builder = *" + builder + "*");
		System.out.println("Length of builder = " + builder.length());
		System.out.println("Capacity of builder = " + builder.capacity());

		builder.replace(0, builder.length(), builder.toString().strip());
		System.out.println("Next Value of builder = *" + builder + "*");
		System.out.println("Length of builder = " + builder.length());
		System.out.println("Capacity of builder = " + builder.capacity());
		
		
	}

}

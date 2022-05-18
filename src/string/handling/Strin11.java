package string.handling;

public class Strin11 {

	public static void main(String[] args) {

		String stringOriginal = "aaabbb";

		// The behavior is the same for all the replace methods,
		// if there is no match, a new String object is NOT created.
		String stringReplaced = stringOriginal.replace('C', 'a');
		System.out.println("1.  stringOriginal==stringReplaced = " + (stringOriginal == stringReplaced));

		stringReplaced = stringOriginal.replace("CC", "aa");
		System.out.println("2.  stringOriginal==stringReplaced = " + (stringOriginal == stringReplaced));

		stringReplaced = stringOriginal.replaceAll("CC", "aa");
		System.out.println("3.  stringOriginal==stringReplaced = " + (stringOriginal == stringReplaced));

		stringReplaced = stringOriginal.replaceFirst("CC", "aa");
		System.out.println("4.  stringOriginal==stringReplaced = " + (stringOriginal == stringReplaced));
	}

}

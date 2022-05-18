package string.handling;

public class String5 {

	public static void main(String[] args) {

		String helloString = "hello";
		String worldString = " world";

		// Use the compound concatenator on string literals
		String compoundString = "hello";
		compoundString += " world";
		System.out.println("compoundString = " + compoundString);

		// Use the compound concatenator on String objects
		String compoundString2 = helloString;
		compoundString2 += worldString;
		System.out.println("compoundString2 = " + compoundString2);
		
        // Use a null String on the left
        String nullString = null;
        nullString += helloString;
        System.out.println("nullString = " + nullString);

        // Use a null String on the right...
        nullString = null;
        String compoundStringWithNull = helloString;
        compoundStringWithNull += nullString;
        System.out.println("compoundStringWithNull = " + compoundStringWithNull);
        
        int anInt = 100;

        // Valid...
        String compoundString3 = helloString;
        compoundString3 += anInt;
        System.out.println("compoundString3 = " + compoundString3);

        // Invalid...
        // anInt += helloString;
        // System.out.println("anInt = " + anInt);
        
        String mathString1 = "The value is ";
        mathString1 += 5 + 7;
        System.out.println("mathString1 = " + mathString1);
        
        // Now we'll replace the compound concatenation operator with the
        // code it represents, we think...
        String mathString2 = "The value is ";
        mathString2 = mathString2 + 5 + 7;
        System.out.println("mathString2 =" + mathString2);

        // Adding parentheses when expanding out the compound concatenation
        // operator fixes the issue, so the right hand operand of the compound
        // concatenation operator is wrapped with an implied parentheses set
        String mathString3 = "The value is ";
        mathString3 = mathString3 + (5 + 7);
        System.out.println("mathString3 =" + mathString3);
	}

}

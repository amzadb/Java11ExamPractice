package primitive.practice;

public class Variables1 {
	// Default values for numeric static variables set to a representation of 0
	static byte staticVarByte;
	static char staticVarChar;
	static short staticVarShort;
	static int staticVarInt;
	static long staticVarLong;
	static float staticVarFloat;
	static double staticVarDouble;

	// Default value for boolean static variables set to false;
	static boolean staticVarBoolean;

	// Default values for numeric instance variables set to a representation of 0
	byte varByte;
	char varChar;
	short varShort;
	int varInt;
	long varLong;
	float varFloat;
	double varDouble;

	// Default value for boolean instance variables set to false;
	boolean varBoolean;

	public static void main(String[] args) {
		Variables1 obj = new Variables1();

		// These class variable references do not produce compile errors
		System.out.println("----------  Class Variables set to default values --------------");
		System.out.println("staticByte=" + Variables1.staticVarByte);
		System.out.println("staticChar=" + Variables1.staticVarChar);
		System.out.println("staticShort=" + Variables1.staticVarShort);
		System.out.println("staticInt=" + Variables1.staticVarInt);
		System.out.println("staticLong=" + Variables1.staticVarLong);
		System.out.println("staticFloat=" + Variables1.staticVarFloat);
		System.out.println("staticDouble=" + Variables1.staticVarDouble);
		System.out.println("staticBoolean=" + Variables1.staticVarBoolean);

		// These object instance variable references do not produce compile errors
		System.out.println("----------  Instance Variables set to default values ------------");
		System.out.println("varByte=" + obj.varByte);
		System.out.println("varChar=" + obj.varChar);
		System.out.println("varShort=" + obj.varShort);
		System.out.println("varInt=" + obj.varInt);
		System.out.println("varLong=" + obj.varLong);
		System.out.println("varFloat=" + obj.varFloat);
		System.out.println("varDouble=" + obj.varDouble);
		System.out.println("varBoolean=" + obj.varBoolean);
	}
}
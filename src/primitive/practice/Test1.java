package primitive.practice;

public class Test1 {
	static int i;

	public static void main(String[] args) {

		int i, j=0, k = 10; // Line 1
		i = Test1.i + k; // Line 2
		k = i++ + k; // Line 3
		Test1.i = j + i; // Line 4
		System.out.println(i + " " + k);
	}

}
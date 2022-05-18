package pet.util; // <Line 2>

import java.util.List; // <Line 1>

public class Pug {

	public static void main(String[] args) {
		System.out.println("Number of args: " + args.length);
		
		List<String> names = List.of(args);
		System.out.println("Number of names: " + names.size());
		
		for (String name : names) {
			System.out.println(name); // <Line 3>
		}
	}

}

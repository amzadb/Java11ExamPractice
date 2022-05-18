package com.garden.test;

import static java.lang.Math.*;

public class StaticImportTest {

	public static void main(String[] args) {
		System.out.println("PI value: " + PI);
		double radius = 1.25;
		double area = PI * radius * radius;
		System.out.println("Radius: " + radius);
		System.out.println("Area: " + area);
		
		System.out.println("Square root of 100: " + sqrt(100));
		System.out.println("2 power of 10: " + pow(2, 10));
	}

}

package com.yml.testmaximum;

public class MaximumMain {

	public static void main(String[] args) {
		
		String x = "Peach", y = "Banana", z = "Apple";
		String a = "Cat", b = "Dog", c = "Buffalo";
		String i = "Dairymilk", j = "FiveStar", k = "Mars";
		
		new Maximum().maximumString(x, y, z); //test case 1
		new Maximum().maximumString(a, b, c); //test case 2
		new Maximum().maximumString(i, j, k); //test case 3
	}

}

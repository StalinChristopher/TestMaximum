package com.yml.testmaximum;

public class MaximumMain {

	public static void main(String[] args) {
		
		Integer x = 100, y = 50, z = 60;
		Float a = 40f, b = 80f, c = 60f;
		String i = "Dairymilk", j = "FiveStar", k = "Mars";
		
		//Calling static method maximum() of generic type
		
		Maximum.maximum(x, y, z); //test case 1 of type Integer
		Maximum.maximum(a, b, c); //test case 2 of type Float
		Maximum.maximum(i, j, k); //test case 3 of type String
	}

}

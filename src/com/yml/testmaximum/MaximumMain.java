package com.yml.testmaximum;

public class MaximumMain {

	public static void main(String[] args) {
		
		Integer x = 100, y = 50, z = 60;
		Float a = 40f, b = 80f, c = 60f;
		String i = "Dairymilk", j = "FiveStar", k = "Mars";
		
		/*initialising variables using constructor of generic class and calling testMaximum() method which
		 *calls the static method maximum() internally
		 */
		new Maximum<Integer>(x, y, z, 200).testMaximum(); //test case 1 of type Integer
		new Maximum<Float>(a, b, c, 350f).testMaximum(); //test case 2 of type Float
		new Maximum<String>(i, j, k, "Perk").testMaximum(); //test case 3 of type String
	}

}

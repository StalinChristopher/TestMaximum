package com.yml.testmaximum;

public class MaximumMain {

	public static void main(String[] args) {
		
		Integer x = 100, y = 50, z = 60;
		Float a = 40f, b = 80f, c = 60f;
		String i = "Dairymilk", j = "FiveStar", k = "Mars";
		
		/*initialising variables using constructor of generic class and calling testMaximum() method which
		 *calls the static method maximum() internally
		 */
		new Maximum<Integer>().testMaximum(x, y, z, 10); //test case 1 of type Integer
		new Maximum<Float>().testMaximum(a, b, c, 350f); //test case 2 of type Float
		new Maximum<String>().testMaximum(i, j, k, "Perk"); //test case 3 of type String
	}

}

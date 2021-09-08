package com.yml.testmaximum;

public class MaximumMain {

	public static void main(String[] args) {
		
		Float x = 100.0f, y = 50.0f, z = 20.0f;
		Float a = 40f, b = 80f, c = 50f;
		Float i = 30f, j = 50f, k = 90f;
		
		new Maximum().maximumFloat(x, y, z);
		new Maximum().maximumFloat(a, b, c);
		new Maximum().maximumFloat(i, j, k);
	}

}

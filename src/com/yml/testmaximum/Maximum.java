package com.yml.testmaximum;

public class Maximum {
	
	public static <T extends Comparable<T>> void maximum(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		
		System.out.println("Max of "+x+", "+y+", "+z+" is "+max);
		
	}
	
	
}

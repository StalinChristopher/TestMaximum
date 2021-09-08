package com.yml.testmaximum;

public class Maximum<T extends Comparable<T>> {
	
	T x,y,z;
	
	Maximum(T x, T y, T z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void testMaximum() {
		Maximum.maximum(x, y, z);
	}
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

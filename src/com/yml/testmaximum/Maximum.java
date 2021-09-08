package com.yml.testmaximum;

public class Maximum {
	

	/**
	 *  
	 * @method to print maximum of 3 integers
	 * 
	 */
	private void printIntegerMax(Integer x, Integer y, Integer z, Integer max) {
		System.out.println("Max of "+x+", "+y+", "+z+" is "+max);
	}
	
	/**
	 *  
	 * @method to find the maximum of 3 Floats
	 * 
	 */
	public void maximumFloat(Float x, Float y, Float z) {
		Float max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0){
			max = z;
		}
		printFloatMax(x,y,x,max);
	}
	
	
	/**
	 *  
	 * @method to print maximum of 3 Floats
	 * 
	 */
	private void printFloatMax(Float x, Float y, Float z, Float max) {
		System.out.println("Max of "+x+", "+y+", "+z+" is "+max);
	}
	
	
	/**
	 *  
	 * @method to find the maximum of 3 Strings
	 * 
	 */
	public void maximumString(String x, String y, String z) {
		String max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0){
			max = z;
		}
		printStringMax(x, y, z, max);
	}

	
	/**
	 *  
	 * @method to print maximum of 3 Strings
	 * 
	 */
	private void printStringMax(String x, String y, String z, String max) {
		System.out.println("Max of "+x+", "+y+", "+z+" is "+max);
		
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

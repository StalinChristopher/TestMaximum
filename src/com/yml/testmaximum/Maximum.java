package com.yml.testmaximum;

public class Maximum {
	
	public void maximumInteger(Integer x, Integer y, Integer z) {
		Integer max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0){
			max = z;
		}
		
		printIntegerMax(x,y,z,max);
	}

	private void printIntegerMax(Integer x, Integer y, Integer z, Integer max) {
		System.out.println("Max of "+x+", "+y+", "+z+" is "+max);
	}
	
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
	
	private void printFloatMax(Float x, Float y, Float z, Float max) {
		System.out.println("Max of "+x+", "+y+", "+z+" is "+max);
	}
}

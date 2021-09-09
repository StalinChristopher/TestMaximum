package com.yml.testmaximum;
import java.util.*;

public class Maximum<T extends Comparable<T>> {
	
	List<T> list = new ArrayList<T>();
	
	Maximum(T...a){
		for(T value : a) {
			this.setList(value);
		}
	}

	public void setList(T value) {
		list.add(value);
	}

	public void testMaximum() {
		Maximum.maximum(list);
	}
	public static <T extends Comparable<T>> void maximum(List<T> a ) {
		StringBuilder builder = new StringBuilder();
		T max = a.get(0);
		builder.append("Max of ");
		for(T value : a) {
			builder.append(value+", ");
			if(value.compareTo(max)>0) {
				max = value;
			}
		}
		builder.append(" is "+max);
		System.out.println(builder);
		
	}
	
	
}

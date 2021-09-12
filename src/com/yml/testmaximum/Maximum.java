package com.yml.testmaximum;
import java.util.*;

public class Maximum<T extends Comparable<T>> {
	
	List<T> list = new ArrayList<T>();
	
	//Method is called in the main class where any number of arguments of any type can be given
	public void testMaximum(T...a) {
		for(T value : a) {
			list.add(value);
		}
		Maximum.maximum(list);
	}
	
	/*Internal method to find the maximum of any number of arguments of any type stored in the form of the list
	 * Bubble sort is used to sort and last element is set as the maximum element
	 * String builder is used to append the string
	 */
	public static <T extends Comparable<T>> void maximum(List<T> paramList ) {
		int n = paramList.size();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(paramList.get(j).compareTo(paramList.get(j+1))>0) {
					T temp = paramList.get(j);
					paramList.set(j, paramList.get(j+1));
					paramList.set(j+1, temp);
				}
			}
		}
		T max = paramList.get(n-1);
		printMax(paramList,max);
		
	}
	
	public static <T> void printMax(List<T> paramList, T max) {
		StringBuilder builder = new StringBuilder();
		builder.append("Max of ");
		for(T value : paramList) {
			builder.append(value+",  ");
		}
		builder.append(" is "+max);
		System.out.println(builder);
	}
}

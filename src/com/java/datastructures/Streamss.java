package com.java.datastructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Streamss {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] a = {1,3,4,5,8,2,1};
		 int[] b = {};
		 
 		 
		 for(int i=0;i<a.length;i++)
		 {
 		 int index = i;
		  b = IntStream.range(0, a.length)
				 			.filter(p -> p != index)
				 			.map(m -> a[m]) 
				            .toArray();
		 
		  System.out.println(Arrays.toString(b));
		  
		    
		  
		 }
			

		 
	}

}
 

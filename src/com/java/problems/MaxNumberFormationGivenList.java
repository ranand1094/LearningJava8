package com.java.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MaxNumberFormationGivenList {
	private static List<Integer> getSubArray(List in) {
		 List listofSubArrays = new ArrayList();
		List<Integer> subArrays = new ArrayList();
		int size = in.size();
		String temp ="";
		int result=0;
		
		
		for(int i =0;i<size;i++)
		{
			for(int j =i;j<size;j++)
			{
				listofSubArrays = new ArrayList();
				temp ="";
				 for(int k=i;k<=j;k++)
				 {
					 temp = temp+in.get(k);
				 }
 
				 listofSubArrays.add(temp);
 			}
		}
		return listofSubArrays;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = {"10","68","75","7","21","12"};
		List in = new ArrayList<>();
		String listString = "";
		 for(int i =0;i<a.length;i++)
		 {
			 in.add(a[i]);
		 }
		 
		 
		 
			Collections.sort(in, (a1, b) -> (b +""+ a1).compareTo(a1 +""+ b));
 in.stream().forEach(System.out::print);
		 
 
		 Optional<Integer> val =  getSubArray(in).stream().max((a1,b)->b.compareTo(a1));

		 
		 
		 System.out.println(val.get());
		
		
	}

}


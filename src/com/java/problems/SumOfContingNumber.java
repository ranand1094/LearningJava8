package com.java.problems;
import java.io.*; 
//Java program to print largest contiguous array sum 
import java.util.*; 

class Kadane 
{ 
	public static void main (String[] args) 
	{ 
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		System.out.println("Maximum contiguous sum is "+maxSubArraySum(a)); 
	} 

	static int maxSubArraySum(int a[]) 
	{ 
		int size = a.length; 
		int max = 0, min = 0; 
 		for (int i = 0; i < size; i++) 
		{ 
			max = max + a[i]; 
			if (min < max) 
				min = max; 
			if (max < 0) 
				max = 0; 
		} 
		return min; 
	} 
} 

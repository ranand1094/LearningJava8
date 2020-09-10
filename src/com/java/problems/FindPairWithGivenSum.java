package com.java.problems;

import java.util.Arrays;

public class FindPairWithGivenSum {

	public static void main(String[] args) {
		int x[] = { 1, 4,2, 2, 3, 5, 7, 8 };
		int sum = 3;
	 	orderOfN(x, sum);
		System.out.println("*****************");
		orderOfN2(x, sum);
	}

	public static void orderOfN(int arr[], int sum) {
        Arrays.sort(arr); 

        int low = 0; 
        int high = arr.length - 1; 
  
        while (low < high) { 
            if (arr[low] + arr[high] == sum) { 
                System.out.println("The pair is : ("
                                   + arr[low] + ", " + arr[high] + ")"); 
            } 
            if (arr[low] + arr[high] > sum) { 
                high--; 
            } 
            else { 
                low++; 
            } 
        } }

	public static void orderOfN2(int x[], int sum) {
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = 0; j < x.length - 1; j++) {
				int tempSum = x[i] + x[j];
				if (tempSum == sum) {
					System.out.println("Pair found at index " + i + " and " + j + "(" + x[i] + "+" + x[j] + ")");
 				}
			}
		}
	}
}
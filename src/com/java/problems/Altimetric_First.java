package com.java.problems;

import java.util.HashSet;
import java.util.TreeSet;

public class Altimetric_First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,100,2,3,4,6,7,2,9,13,44,51,2,44,55,6};
 		int i = 0;
		while (i <= a.length) {
			int j = i + 1;
			if (j < a.length) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i = -1;
				}
			}
			i++;
		}
		 
		
		for (int j = 0; j <= a.length - 1; j++)
			System.out.print(a[j]+" ");
	}

}

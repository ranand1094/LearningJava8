package com.java.problems;

import java.util.Arrays;

public class ConcatenationOfZigZagStringNRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="GEEKSFORGEEKS";
		// AAD
		// NN
		int n = 3;
		char[][] c =  new char[n][s.length()];
		char[] c2 = s.toCharArray();
		String[] c1 =  new String[n];
		Arrays.fill(c1, "");
		int row = 0;
	
		for(int i = 0; i<s.length()-1 ;i++)
		{
			
  			c1[row] += s.charAt(i);
 			
			if(row == n)
			{
				row = 0;
			}
			else {
				row = n - row;
			}
			
		}
		
		for(int i = 0; i<c1.length ;i++)
		{
			System.out.print(c1[i]+" ");

		}
		
		/*
		 * System.out.println();
		 * 
		 * 
		 * for(int i = 0; i<n ;i++) { for(int j = i; j<s.length();j=j+n) {
		 * System.out.print(c[i][j]+" "); } System.out.println(); }
		 * System.out.println(); //printZigZagConcat(s,n);
		 */
	}
	
	static void printZigZagConcat(String str, 
            int n)  
    { 
  
        // Corner Case (Only one row) 
        if (n == 1)  
        { 
            System.out.print(str); 
            return; 
        } 
        char[] str1 = str.toCharArray(); 
  
        // Find length of string 
        int len = str.length(); 
  
        // Create an array of 
        // strings for all n rows 
        String[] arr = new String[n]; 
        Arrays.fill(arr, ""); 
  
        // Initialize index for 
        // array of strings arr[] 
        int row = 0; 
        boolean down = true; // True if we are moving  
        // down in rows, else false 
  
        // Travers through 
        // given string 
        for (int i = 0; i < len; ++i)  
        { 
            // append current character 
            // to current row 
            arr[row] += (str1[i]); 
  
            // If last row is reached, 
            // change direction to 'up' 
            if (row == n - 1)  
            { 
                down = false; 
            }  
              
            // If 1st row is reached,  
            // change direction to 'down' 
            else if (row == 0)  
            { 
                down = true; 
            } 
  
            // If direction is down,  
            // increment, else decrement 
            if (down) 
            { 
                row++; 
            }  
            else 
            { 
                row--; 
            } 
        } 
  
        // Print concatenation 
        // of all rows 
        for (int i = 0; i < n; ++i)  
        { 
            System.out.print(arr[i]); 
        } 
    } 

}

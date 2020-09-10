package com.java.problems;
//Java implementation of O(n^2) 
//time and O(1) space method 
//to find the longest palindromic substring 
public class LongestPalinSubstring { 

	static String printSubStr(String str, 
							int low, int high) 
	{ 
		return
			str.substring( 
				low, high + 1); 
	} 

	static String longestPalSubstr(String str) 
	{ 
		int maxLength = 1; 

		int start = 0; 
		int len = str.length(); 

		int low, high; 
		for (int i = 1; i < len; ++i) { 
			low = i - 1; 
			high = i; 
			while (low >= 0 && high < len 
				&& str.charAt(low) 
						== str.charAt(high)) { 
				if (high - low + 1 > maxLength) { 
					start = low; 
					maxLength = high - low + 1; 
				} 
				--low; 
				++high; 
			} 

			low = i - 1; 
			high = i + 1; 
			while (low >= 0 && high < len 
				&& str.charAt(low) 
						== str.charAt(high)) { 
				if (high - low + 1 > maxLength) { 
					start = low; 
					maxLength = high - low + 1; 
				} 
				--low; 
				++high; 
			} 
		} 

		return	printSubStr(str, start, start + maxLength - 1); 

 	} 

	public static void main(String[] args) 
	{ 

		String str = "OurCompanyisAltimetrikirtemitlAisaverygoodCompany"; 
		System.out.println(longestPalSubstr(str)); 
	} 
} 
//This code is contributed by Sumit Ghosh 

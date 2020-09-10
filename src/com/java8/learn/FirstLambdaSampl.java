package com.java8.learn;

import java.util.Scanner;

public class FirstLambdaSampl {

	 
	public static void main(String args[]) {
		
		int a,b,c;
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Numbers");
	    
	    a = myObj.nextInt();
	    b = myObj.nextInt();
	    c = myObj.nextInt();

		MyInterface myEx = (x,y,z) -> x+y+z;
		
		System.out.println(myEx.add(a, b,c));
		
	}
}


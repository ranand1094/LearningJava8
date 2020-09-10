package com.java.problems;

import java.util.stream.IntStream;

public class NFactorial {

	public static void main(String[] args) {
		NFactorial fac = new NFactorial();
		System.out.println(fac.fact(3));
  		

	}
	
	public static long fact(int num){
		IntStream stream = IntStream.rangeClosed(1, num);
	    return (stream.reduce(1,(a, b) -> a * b));
	}

}

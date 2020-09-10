package com.java8.practise;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Mail ID");
		String input = s.nextLine();
		s.
		String regex = "^(.+)@(.+)$";
		
		boolean mail = regexMatcher(input,regex);
		if(!mail)
		{
			throw new Exception("Invalid Mail ID.");
		}
		
		System.out.println("Enter Name");
		String Name = s.nextLine();
		
		System.out.println("Welcome "+Name);
		
		
		
		 
			
	}
	
	public static boolean regexMatcher(String s,String r)
	{
		
		Pattern pattern = Pattern.compile(r);
	    Matcher matcher = pattern.matcher(s);
	    Predicate<String> p = x -> matcher.matches();
	    
	    boolean x = p.test(s);
	    
	    return x;
	}

}

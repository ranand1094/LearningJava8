package com.java8.practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Uniphore {
	public static void main(String[] args) {
		String s = "Hello Good morning Hope you are doing good";
		List<String> listString = Arrays.asList(s.toLowerCase().split("\\s"));
		Set<String> setString = new HashSet<String>();

		Map<String,String> map = new HashMap<>();
		
		String ma = map.put("A","");
		String ma2 = map.put("A","s");
		
		System.out.println(ma +" = "+ ma2+" ma2");
		
		
		listString.forEach(str -> {
			boolean b = setString.add(str);
 			if (!b) {
				System.out.println(str + " is repeated.");
 			}
 		});
 	}
}
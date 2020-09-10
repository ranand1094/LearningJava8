package com.java.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctChars {
	public static void main(String[] args) {
		
		List<String> lis = Arrays.asList("aaryanna",
										"aayanna", 
										"airianna", 
										"alassandra", 
										"allanna", 
										"allannah", 
										"allessandra", 
										"allianna", 
										"allyanna", 
										"anastaisa", 
										"anastashia", 
										"anastasia", 
										"annabella", 
										"annabelle", 
										"annebelle");
		String prefix = "aa";
 		(lis.stream()
 				.filter(n -> n.startsWith(prefix))
 				.map(s -> s+" - "+s.chars()
 									.distinct()
 									//.filter(a->a == 'a')
 									.count())
 				.collect(Collectors.toList()))
 			.forEach(s->System.out.println(s));
	}
}

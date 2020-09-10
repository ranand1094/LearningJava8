package com.java.problems;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Limits {
	public static Stream<String> permutations(String str) {
		if (str.isEmpty()) {
			return Stream.of("");
		}
		
 		return IntStream.range(0, str.length()).boxed()
				.flatMap(i -> permutations(str.substring(0, i) + str.substring(i + 1)).map(t -> str.charAt(i) + t));
	}

	public static void main(String[] args) {
		
		Date startDate = new Date();
		long startTime = System.nanoTime();
		System.out.println("Started at " + startDate);
		Set<String> stringSet = permutations("anand").parallel().collect(Collectors.toSet());
		Set<String> stringRevSet = new HashSet<>();
		
		//stringRevSet.stream().flatMap(stringRevSet -> 
		stringSet.forEach(x->{
			StringBuffer sb = new StringBuffer(x);
			String st = sb.reverse().toString();
 			if(st.equals(x))
				stringRevSet.add(x);
 		});
 		stringRevSet.forEach(y->System.out.println(y));
		Date endDate = new Date();
		long totalTime = System.nanoTime() - startTime;
		System.out.println("Ended at " + endDate + " total time=" + totalTime + " nanosec");
}
	
	
	
}
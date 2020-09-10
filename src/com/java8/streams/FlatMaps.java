package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FlatMaps {

	public static void main(String[] args) {
		List list = Arrays.asList("Anand", "Aravind", "Champa", "Rama");
		List list1 = Arrays.asList("90","94","82","80");
		List<List> li = Arrays.asList(list,list1);
		
		Map<String,Long> xl = (Map<String, Long>) li.stream()
				.flatMap(x -> x.stream())
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		xl.forEach((k,v)->System.out.println(k+"-"+v));
 	}

}

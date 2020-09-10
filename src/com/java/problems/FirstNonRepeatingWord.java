package com.java.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingWord {

	public static void main(String[] args) {

		String s = "hello anand how are man you hi how hello are you";

		List<String> al = Arrays.asList(s.split(" "));
  
		Map<String, Long> map = ((Map) al.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

		for (String sa : s.split(" ")) {
			if (map.get(sa) > 1) {
				System.out.println(sa);
			}
		}
	}
}

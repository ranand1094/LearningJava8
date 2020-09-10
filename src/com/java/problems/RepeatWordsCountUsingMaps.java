package com.java.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepeatWordsCountUsingMaps {

	public static void main(String[] args) {

		List list = Arrays.asList("A1", "A", "A", "A", "A", "Anand", "Aravind", "Champa", "Rama", "Anand", "Aravind",
				"Aravind", "Champa", "Rama", "A2", "AA", "AA", "AA", "AA", "AA");

		List intList = Arrays.asList(2, 2, 3, 4, 5, 6, 1, 2, 3, 44, 1, 22, 3, 44, 4);

		String x = "11aaaaaabnnsmdnj120029938817773666433391273aa5623340010001000000000923888102390980800012930098912873981273777891288enwuihfdjsnamcnasdkjbrhueihl";

		String xa = x.replaceAll("[a-zA-Z]", "");
//System.out.println(xa);
		char sc[] = xa.toCharArray();

		List<Integer> ar = new ArrayList();
		for (int i = 0; i < sc.length; i++) {
			ar.add((int) sc[i] - 48);
		}

		// ar.forEach(xa1->System.out.println(xa1));

		List<String> lsi = ((Map<String, Long>) list.stream()
						.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())))
						.entrySet().stream()
						.sorted(Entry.comparingByKey((a, b) -> a.compareTo(b)))
						.sorted(Entry.comparingByValue((a, b) -> b.compareTo(a)))
						.map(n -> n.getKey() + "-" + n.getValue()).collect(Collectors.toList());

		lsi.forEach(s -> System.out.println(s));
		// .findFirst().ifPresent(p -> System.out.println(p.getKey()));
		// .forEach(xx -> System.out.println(xx));
		// .max(Comparator.comparing(Entry::getValue)).ifPresent(p ->
		// System.out.println(p));
	}
}

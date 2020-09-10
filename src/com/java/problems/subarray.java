package com.java.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**/
		int x[] = { 1, 2};
		Map<List,Integer> listofSubArrays = getSubArray(x);
		listofSubArrays.entrySet().stream()
				.sorted(Entry.comparingByValue((a,b)->b.compareTo(a)))
				.map(k -> k.getKey())
				.collect(Collectors.toList())
				.forEach(i->System.out.println(i));
	}

	private static Map<List,Integer> getSubArray(int x[]) {
		List<Integer> listofSubArrays = new ArrayList();
		Map<List,Integer> subArrays = new HashMap();
		int size = x.length;
		int temp = 0;
		int result = 0;

		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				listofSubArrays = new ArrayList();
				temp = 0;
				for (int k = i; k <= j; k++) {
 					listofSubArrays.add(x[k]);
 					temp = temp+x[k];
 				}
				if(temp == 3)
					subArrays.put(listofSubArrays,listofSubArrays.size());
 			}
 		}
		return subArrays;
	}
}

package com.java.problems;

import java.util.Arrays;
import java.util.List;

public class SortingOrderOfN {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, 1, 2, 1, 1, 0, 2, 1, 0, 2, 1);
		int listSize = list.size();
		for (int j = 0; j < listSize - 1; j++) {
			if (list.get(j) > list.get(j + 1)) {
				int temp = list.get(j);
				list.set(j, list.get(j + 1));
				list.set(j + 1, temp);
				j = -1;
			}
		}
		list.forEach(s -> System.out.print(s + " "));
	}
}
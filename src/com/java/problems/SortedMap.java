package com.java.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(12,24);
		map.put(45,11);
		map.put(96,74);
		map.put(71,30);
		map.put(32,31);
 
		SortedMap sortedMap = new SortedMap();
		sortedMap.getvalues(map).forEach((k) -> System.out.print(k+" "));
	}
	
	public static List<Integer> getvalues(HashMap<Integer,Integer> map)
	{
		
		List<Integer> list = new ArrayList<Integer>();
		
		list = map.entrySet()
 			.stream()
 			.sorted(Entry.comparingByValue((a, b) -> a.compareTo(b)))
			.map(n ->  n.getValue())
            .collect(Collectors.toList());

		return list;
	}

}

 
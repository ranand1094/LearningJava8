package com.java8.streams;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LearnStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(8,12,1,2,3,4,5,6,7,8,9);
		
		System.out.println();
		
		System.out.println(list.stream().filter(i->(i%2==0)).map(i->(i*i)).sorted().
		limit(2).collect(Collectors.toList()));
		
		
		
		
		System.out.println(list.parallelStream().filter(i->(i%2==0)).map(i->(i*i)).
		sorted().limit(2).collect(Collectors.toList()));
		  
		System.out.println(list.contains(123));
		  
		LocalTime dateb4 = LocalTime.now();
		  
		list.forEach(i->System.out.println(i));
		  
		LocalTime datea4 = LocalTime.now();
		  
		System.out.println(" For Each "+Duration.between(datea4,dateb4));
		  
		  
		dateb4 = LocalTime.now(); for(int i:list) { System.out.println(i); } datea4 =
		LocalTime.now();
		  
		System.out.println(" For "+Duration.between(datea4,dateb4));

	}

}

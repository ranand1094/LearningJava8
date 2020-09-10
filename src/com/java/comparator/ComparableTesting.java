package com.java.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	Object[] x = {"1","2",3,23.2};
	
	System.out.println(x.getClass().isArray());
	
	for(Object o : x)
	{
		System.out.println("Value :- "+o+" ** Type :- "+o.getClass().getSimpleName());
	}
	
 	}

}

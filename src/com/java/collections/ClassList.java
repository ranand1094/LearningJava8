package com.java.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ClassList implements Serializable {

	public static void main(String[] args) {
		//ClassList.listMethod();

		List x1 = Arrays.asList("Anand","Aravind");
		TreeSet ts = new TreeSet();
		ts.add("Z");
		ts.add("Z1");
		ts.add("Z4");
		ts.add("Z8");
		
		System.out.println(ts + "SET");
		
		Iterator tsIterator = ts.descendingIterator();
		while(tsIterator.hasNext())
		{
			System.out.println(tsIterator.next());
		}
 	}
 private static void setMethod() {
		// TODO Auto-generated method stub
	 HashSet hs = new HashSet();
	 
	 hs.add("Anand1As");
	 

	 for(int i=0;i<=10;i++)
		 hs.add(i);
	 
	 hs.add("Anand1");
	 hs.add("Anand");
	 hs.add("Anand2");
	 hs.add("Anand3");
	System.out.println(hs);
	
 	 
	}
public static void listMethod()
 {
	 List<String> list = new ArrayList<String>();
		List list2 = new ArrayList();
		List sorted = new ArrayList();

		list.add("anan");
		list.add("anan");
		list.add("anan");
		list.add("anan");
		list.add("anan");
		list.add("anan");
		list.add("anan");
		 		
		for (int i=0;i<=(list.size()-1) ;i++) {
			System.out.println(i);
			for (int j=(list.size()-1);j>i ;j--) {
				String x = list.get(j);
				String y = list.get(i);
				
				for(int s=0 ; s<x.length();s++)
				{
					int a = x.charAt(s);
					int b= y.charAt(s);
					
					if (a<b) {
						 list.set(i, x);
						 list.set(j, y);
					}
					else if(a == b)
					{
						a = x.charAt(s+1);
						b = y.charAt(s+1);
						if (a<b) {
							 list.set(i, x);
							 list.set(j, y);
						}
					}
				}
			}
		}

		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
 }
}

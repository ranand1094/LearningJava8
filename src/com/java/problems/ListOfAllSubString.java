package com.java.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListOfAllSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Our Company is AltimetrikirtemitlA is a very good Company";
		
		String rev = Arrays.asList(name.split(" ")).stream().reduce("",(a,b)->b.concat(" "+a));
		System.out.println(rev);
		/*
		List<String> lsString = new ArrayList();
		int stringLength = 0;
		int maxLen = 0;
		for (int i = 0; i <= name.length(); i++) {
			for (int j = i + 1; j <= name.length(); j++) {
				String l = name.substring(i, j);
				Optional<String> rev = Arrays.asList(l.split("")).stream().reduce((a,b)->b.concat(a));
				if(l.length() > 1 && rev.get().equals(l))
				{
					stringLength = rev.get().length();
					if(stringLength > maxLen)
					{
						System.out.println(rev.get());
						maxLen = stringLength;

					}
 				}
			}
		}
		lsString.forEach(s -> System.out.println(s));*/
	}
 
}
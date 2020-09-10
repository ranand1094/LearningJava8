package com.java.problems;

import java.util.Arrays;
import java.util.List;

public class CustomSort102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,0,2,1,0,2,1,0,2,1,0,1);
		
		int i = 0;
		int j = i+1;
		int listLen = list.size();
		int temp = 0;
		
		while(i < list.size() && j < list.size())
		{
			if(list.get(i) > list.get(j))
			{
				temp = list.get(i);
				list.set(i,list.get(i));
				list.set(j,temp);
 				i++;
			}
			else if(list.get(i) == list.get(j))
			{
				temp = list.get(i);
				list.set(i,list.get(i));
				list.set(j,temp);
 				i++;
			}
			else
			{
				j++;
			}
			
		}
		
		list.forEach(s->System.out.print(s+" "));
	}

}

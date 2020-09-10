package com.java.threads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadClass implements Runnable
{
	Map<String,String> map = new HashMap<>();
	List<Integer> list = new ArrayList<>();
	//map = Collections.synchronizedMap(map);

	@Override
	public void run() {
		for(int i =0;i<=10;i++)
		{
		 map.put("Name_"+i,"Anand_"+i );	
		 list.add(i);
		 System.out.println(Thread.currentThread().getName()+" - "+i++);
		}	
  	}
}

public class SyncConcurMap {

	public static void main(String[] args) {
		 
		ExecutorService ex = Executors.newFixedThreadPool(100);
		for(int i =0 ;i<=10;i++)
			ex.execute(new ThreadClass());
	}

}

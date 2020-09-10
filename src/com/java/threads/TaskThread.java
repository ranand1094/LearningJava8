package com.java.threads;	

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class TaskThread  {

	
	
	public static void main(String[] args) {
		 MyTask m = new MyTask();

		 Thread th1 = new Thread(new Sync2());
		 Thread th2 = new Thread();
		 
		 for(int i =0;i<5;i++)
		 {
			 Thread th = new Thread(new Sync());

			 th.start();
		 }
		 
		 
		 
	}

}


 class Sync implements Runnable {

	 public MyTask mt = new MyTask();
		private int count = 0;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			 mt.setCount(count++);
			 System.out.println(mt.getCount());

		}
		

}
 

 class Sync2 implements Runnable {

	 public MyTask mt = new MyTask();
		private int count = 0;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			for(int i = 0 ; i < 10 ;i++)
			{
				count = mt.getCount();
				mt.setCount(i+count);

			}
			 System.out.println(mt.getCount());

		}
		

}

 class Sync3 implements Callable{
	 public MyTask mt = new MyTask();

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		int count = 0;

		for(int i = 0 ; i < 10 ;i++)
		{
			count = mt.getCount();
			mt.setCount(i+count);

		}
		 System.out.println(mt.getCount());
		 return mt.getCount();

	}
	 
 }
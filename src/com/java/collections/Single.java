package com.java.collections;


 class Singleton extends Thread
{
	 private static Singleton sinlg;
	 private static int i;
	 
	 public static Singleton getSinlg() {
		return new Singleton();
	}
	public static void setSinlg(Singleton sinlg) {
		Singleton.sinlg = sinlg;
	}
	 
	 
	public void run()
	{
		for(i=0;i<=10;i++)
			 System.out.println("SingleTon "+ i);	
		}
	 
	 
	
}

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton s1 = new Singleton();
		
		Singleton s2 = new Singleton();

		Singleton s3 = new Singleton();

		s1.start();
		s2.start();
		s3.start();
		
		 
	}

}

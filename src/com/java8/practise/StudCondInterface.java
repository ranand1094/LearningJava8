package com.java8.practise;

public interface StudCondInterface {
	 void printWithCond(String x, String params);
	 public default  void method() {
		 System.out.println("Anand");
	}

}

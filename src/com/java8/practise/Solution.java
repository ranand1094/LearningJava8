package com.java8.practise;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Solution{

	public static void main(String[] args) {
		 
		Predicate<Integer> p = b -> b%2==0;
 		functionsFI();
		consumersFI();
		suppliersFI();
		System.out.println(p.test(5));
		
		
	BiPredicate<Integer,Integer> bp = (x,y) -> x<y;
	
	BiPredicate<Integer,Integer> bp1 = (x,y) -> x<y;

	System.out.println(bp.test(2, 3)) ;
		
	BinaryOperator<Integer> binO = (a,b) -> a+b;
	
	
		}

	private static void suppliersFI() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 11;
		
		//supplier
		Supplier<String> s = () -> {
			if(a >= 10)
				return "ten ";
			return "Hi";};
		System.out.println(s.get());
		
		//bisupplier
		

	}

	private static void consumersFI() {
		// TODO Auto-generated method stub
		Consumer<String> c = x -> {
			System.out.println(x);
		};
		
		c.accept("Anand");
		
		BiConsumer<String, String> bic = (a,b) -> {
			System.out.println("Bi Consumer "+a+b);
		};
		
		bic.accept("Anand", "Ramachandran");

	}

	private static void functionsFI() {
		// TODO Auto-generated method stub
		
		Function<Integer,String> f = a -> {
			if(a == 1)
				return "ONE";
			if(a ==2 )
				return "TWO";
			else
				return "Greater";
		};
		
		BiFunction<String,String,String> concat = (string1,string2) -> {
			return string1 +" - "+string2;
		};
		
		System.out.println(f.apply(4));
		System.out.println(concat.apply("Anand", "R"));
	}
	}
	
	
 



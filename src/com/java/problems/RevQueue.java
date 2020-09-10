package com.java.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RevQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(11);
		 
		queue.forEach(s -> System.out.print(s+" "));
		System.out.println("********");
		revQueue(queue).forEach(s -> System.out.print(s+" "));
	}

	public static Queue<Integer> revQueue(Queue<Integer> actQue) {
		Stack<Integer> stack = new Stack<>();
		while (!actQue.isEmpty()) {
			stack.add(actQue.peek());
			actQue.remove();
		}
		while (!stack.isEmpty()) {
			actQue.add(stack.peek());
			stack.pop();
		}
		return actQue;
	}

}

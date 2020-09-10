package com.java.impls;

public class LinkedList {

	Node next;
	Node head;
	Node previous;

	public void printList() {
		Node next = this.head;
		while (next != null) {
			System.out.println(next.data);
			next = next.next;
		}
	}

	public Node add(Object data) {
		Node newNode = new Node(data);
		Node headNode = this.head;

		if (headNode == null) {
			this.head = newNode;
		} else {
			Node nextNode = headNode;
			while (nextNode.next != null) {
				nextNode = nextNode.next;
			}
			nextNode.next = newNode;
		}
		return newNode;
	}

	public Object find(Object data) {
		Object foundData = null;
		Node next = this.head;
		while (next != null) {
			if (next.data == data) {
				foundData = next.data;
				break;
			}
			next = next.next;

		}
		return foundData;
	}

	public Object get(int index) {
		Object foundData = null;
		Node next = this.head;
		int counter = 0;
		int size = this.size();
		while (next != null) {
			if (counter == index) {
				foundData = next.data;
				break;
			}
			counter++;
			next = next.next;

		}
		return foundData;
	}

	// null-> 1 -> 2 -> 3 -> 4 -> 5 -> null

	public void reverseCurrentList() {
		
		LinkedList list = this;
 		Node current = list.head;
		Node next = null;
		Node previous = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		current = previous;
		this.head = null;
		while (current != null) {
			this.add(current.data);
			current = current.next;
 		}

 	}
	
	public LinkedList reverseNewList() {
		
		LinkedList list = this;
		LinkedList reversed = new LinkedList();
		Node current = list.head;
		Node next = null;
		Node previous = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		current = previous;
  		while (current != null) {
			reversed.add(current.data);
			current = current.next;
 		}

		return reversed;
	}

	public int size() {
		Node next = this.head;
		int counter = 0;
		while (next != null) {
			counter++;
			next = next.next;
		}

		return counter;
	}

	public Object getFromLast(int i) {
		Object foundData = null;
		int size = this.size();
		int element = size - i;
		Node next = this.head;
		int counter = 1;
		while (next != null) {

			if (counter == element) {
				foundData = next.data;
				break;
			}
			counter++;
 			next = next.next;
		}

		return foundData;
	}

	public static void main(String[] agrs) {
		LinkedList lists = new LinkedList();
		lists.add(1);
		lists.add(2);
		lists.add(99);
		lists.add(11);
		lists.add(12);
		lists.add("Aravind");
		lists.add("Hello");
		lists.add("Last");
		lists.add("Anand");

		System.out.println("**Actual List**");
		lists.printList();
		System.out.println("***************");

		lists.reverseCurrentList();
		
		System.out.println("**Reversed Current List**");
		lists.printList();
		System.out.println("***************");
		
		 
		

		System.out.println("FOurth from reversed top - "+ lists.get(4));
		System.out.println("Second from reversed last - "+lists.getFromLast(2));

		// lists.printList();

	}
}

class Node {
	Object data;
	Node next;
	Node previous;

	Node(Object d) {
		data = d;
		next = null;
	}

}

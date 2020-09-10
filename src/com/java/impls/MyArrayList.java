package com.java.impls;

import java.util.Arrays;

public class MyArrayList {

	private int size = 0;
	private final int capacity = 10;
	private Object[] array;

	MyArrayList() {
		array = new Object[capacity];
	}

	public void add(Object o) {

		increaseCapacity();
		array[size++] = o;

	}

	public void add(int i, Object o) {
		increaseCapacity();
		System.out.println(array.length);
		System.out.println(i);
		System.arraycopy(this.array, i, this.array, i + 1, this.array.length - 1);
		array[i] = o;
	}

	public void increaseCapacity() {
		if (size == array.length) {
			int newSize = capacity + 1;
			array = Arrays.copyOf(array, newSize);
		}
	}

	public Object get(int i) {
		Object o = array[i];
		return o;
	}

	public void delete(int i) {
		increaseCapacity();
		System.arraycopy(this.array, i, this.array, i + 1, this.array.length - 1);
	}

	public void print() {
		for (int i = 0; i < this.array.length; i++) {
			if (array[i] != null)
				System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		list.add(1, "one");
		list.print();
	}
}

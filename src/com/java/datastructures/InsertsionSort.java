package com.java.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class InsertsionSort {

	public static void main(String[] args) {
		int[] a = { 4, 1, 2, 3, 5, 62, 1, 7, 1, 33, 6, 7 };
		insertionSort(a);
		selectionSort(a);
	}

	private static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int minVal = i;// 7
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					minVal = j;
				}
			}
			int temp = a[minVal];
			a[minVal] = a[i];
			a[i] = temp;
		}
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);

	}

	public static void insertionSort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int current = a[i];// 7
			int j = i - 1;// 1
			while (j > 0 && a[j] > current) {
				a[j + 1] = a[j];// 9,8,8
				j--;// 0

				System.out.println(a[j] + " j - " + j + " i:" + i);
			}
			a[j + 1] = current;
		}
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}

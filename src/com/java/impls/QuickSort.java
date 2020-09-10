package com.java.impls;

public class QuickSort {

	public static int findPart(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int j = findPart(arr, low, high);
			quickSort(arr, low, j - 1);
			quickSort(arr, j + 1, high);
		}
	}

	public static void main(String[] args) {
		int a[] = { 34, 2, 23, 1, 55, 6, 8, 90, 1, 2, 33, 456, 10 };
		quickSort(a, 0, a.length - 1);
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
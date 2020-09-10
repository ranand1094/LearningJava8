package com.java.impls;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSort {

	public void mergeSort(int[] list, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int mid = (startIndex + endIndex) / 2;
			mergeSort(list, startIndex, mid);
			mergeSort(list, mid + 1, endIndex);
			sort(list, endIndex, startIndex, mid);
		}
	}

	private void sort(int[] arr, int endIndex, int startIndex, int mid) {
 		int n1 = mid - startIndex + 1;
		int n2 = endIndex - mid;
  
		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[startIndex + i];
 		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[mid + 1 + j];
 		}

		int i = 0, j = 0, k = startIndex;
		while (i < n1 && j < n2) {
  			if (L[i] > R[j]) {
 				arr[k] = R[j];
 				j++;
			} else if (L[i] <= R[j]) {
 				arr[k] = L[i];
 				i++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			k++;
			j++;
		} 
	}

	public static void main(String[] args) {//

		int a[] = {1,2,1,0,1,2,1,0,2,2,2};
		MergeSort ms = new MergeSort();
		ms.mergeSort(a, 0, a.length - 1);

		IntStream in = Arrays.stream(a);
		in.forEach(s -> System.out.print(s+" "));

	}

}

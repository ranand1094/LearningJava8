package com.java.impls;

import java.util.Arrays;
import java.util.stream.IntStream;

public class paypal1questmergesort {

	public static void main(String[] args) {//
		int a[] = { 1, 2, 3, 9 };
		int b[] = { 4, 5, 7 };
		int m = a.length;
		int n = b.length;
		int c[] = new int[m + n];
		int i = 0, j = 0, k = 0;
		
		while (i < m && j < n) {

			if (a[i] > b[j]) {

				c[k++] = b[j++];
			} else if (a[i] < b[j]) {

				c[k++] = a[i++];
			} else if (a[i] == b[j]) {

				c[k++] = a[i++];
				c[k++] = b[j++];

			}

		}

		while (i < m) {
			c[k++] = a[i++];
		}

		while (j < n) {
			c[k++] = b[j++];
		}

		IntStream ints = Arrays.stream(c);
		ints.forEach(x -> System.out.print(x+" "));
		// ints.forEachOrdered(d->System.out.println(d));

	}

}

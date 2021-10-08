/*
  Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.
 */
package arrays.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayGroups {

	private static void reverseInGroups(ArrayList<Integer> arr, int size, int k) {
		if (k == 1) {
			return;
		} else if (k >= size) {
			reverseArray(arr, 0, size);
		} else {
			for (int i = 0; i < size; i = i + k) {
				if (i + k > size) {
					reverseArray(arr, i, size);
				} else {
					reverseArray(arr, i, i + k);
				}
			}
		}
	}

	private static void reverseArray(ArrayList<Integer> arr, int s, int e) {
		int low = s;
		int high = e - 1;
		while (low < high) {
			int temp = arr.get(low);
			arr.set(low, arr.get(high));
			arr.set(high, temp);
			low++;
			high--;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		reverseInGroups(arr, n, k);
		System.out.println("New Array:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
		sc.close();
	}
}
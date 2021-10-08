/*
  Given an array arr[] sorted in ascending order of size N and an integer K.
  Check if K is present in the array or not.
 */

package searching.problems;

import java.util.Scanner;

public class SearchInSorted {

	private static int searchInSorted(int[] arr, int N, int K) {
		int low = 0;
		int high = N - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == K) {
				return 1;
			} else if (arr[mid] > K) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		System.out.println("Elements:");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Element to Search: ");
		int x = sc.nextInt();
		System.out.println(searchInSorted(arr, n, x));
		sc.close();
	}
}
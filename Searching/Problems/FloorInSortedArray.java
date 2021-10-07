/**
 * Given a sorted array arr[] of size N without duplicates, and given a value x. 
 * Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x. 
 * Find the index of K(0-based indexing).
 */
package Searching.Problems;

import java.util.Scanner;

public class FloorInSortedArray {

	private static int findFloor(long arr[], int n, long x) {
		int low = 0;
		int high = n - 1;
		long ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] > x) {
				high = mid - 1;
			} else {
				ans = mid;
				low = mid + 1;
			}
		}
		return (int) ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		long[] arr = new long[n];
		System.out.println("Elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		System.out.print("Element: ");
		long x = sc.nextLong();
		System.out.println(findFloor(arr, n, x));
		sc.close();
	}
}
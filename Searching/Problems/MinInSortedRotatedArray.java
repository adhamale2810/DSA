/**
 * A sorted array A[ ] with distinct elements is rotated at some unknown point,
 * the task is to find the minimum element in it.
 */

package Searching.Problems;

import java.util.Scanner;

public class MinInSortedRotatedArray {

	private static int findMin(int arr[], int n) {
		int low = 0;
		int high = n - 1;
		int res = Integer.MAX_VALUE;
		while (low <= high) {
			res = Math.min(res, arr[low]);
			res = Math.min(res, arr[high]);
			low++;
			high--;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findMin(arr, n));
		sc.close();
	}
}
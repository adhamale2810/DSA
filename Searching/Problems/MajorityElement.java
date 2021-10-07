/**
 * Given an array A of N elements. Find the majority element in the array. 
 * A majority element in an array A of size N is an element that appears more than N/2 times in the array.
 */
package Searching.Problems;

import java.util.Scanner;

public class MajorityElement {

	private static int majorityElement(int arr[], int n) {
		int res = 0;
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[res]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				res = i;
				count = 1;
			}
		}
		count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[res] == arr[i]) {
				count++;
			}
		}
		if (count > n / 2) {
			return arr[res];
		}
		return -1;
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
		System.out.println(majorityElement(arr, n));
		sc.close();
	}
}
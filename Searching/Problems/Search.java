/**
 * Given an integer array and another integer element. The task is to find if the given element is present 
 * in array or not.
 */
package Searching.Problems;

import java.util.Scanner;

public class Search {

	private static int linearSearch(int[] arr, int n, int x) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Element to Search: ");
		int x = sc.nextInt();
		System.out.println(linearSearch(arr, n, x));
		sc.close();
	}
}
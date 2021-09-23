package Searching;

import java.util.Scanner;

public class IterativeBinarySearch {

	private static int binarySearch(int[] arr, int n, int x) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] > x) {
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
		System.out.println("Elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Element to Search: ");
		int x = sc.nextInt();
		System.out.println(binarySearch(arr, n, x));
		sc.close();
	}
}
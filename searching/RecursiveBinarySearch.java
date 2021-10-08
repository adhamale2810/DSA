package searching;

import java.util.Scanner;

public class RecursiveBinarySearch {

	private static int recursiveBS(int[] arr, int x, int low, int high) {
		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (arr[mid] == x) {
			return mid;
		} else if (arr[mid] > x) {
			return recursiveBS(arr, x, low, mid - 1);
		} else {
			return recursiveBS(arr, x, mid + 1, high);
		}
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
		System.out.println(recursiveBS(arr, x, 0, n - 1));
		sc.close();
	}
}
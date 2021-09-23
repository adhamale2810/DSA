package Searching;

import java.util.Scanner;

public class IndexFirstOccurence {

	private static int find(int[] arr, int n, int x) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > x) {
				high = mid - 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				if (mid == 0 || arr[mid - 1] != arr[mid]) {
					return mid;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

	private static int recursiveFind(int[] arr, int x, int low, int high) {
		if (low > high) {
			return -1;
		} else {
			int mid = (low + high) / 2;
			if (arr[mid] > x) {
				return recursiveFind(arr, x, low, mid - 1);
			} else if (arr[mid] < x) {
				return recursiveFind(arr, x, mid + 1, high);
			} else {
				if (mid == 0 || arr[mid - 1] != arr[mid]) {
					return mid;
				} else {
					return recursiveFind(arr, x, low, mid - 1);
				}
			}
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
		System.out.println(recursiveFind(arr, x, 0, n - 1));
		sc.close();
	}
}
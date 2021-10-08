package searching;

import java.util.Scanner;

public class CountOccurences {

	private static int firstOcc(int[] arr, int n, int x) {
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

	private static int lastOcc(int[] arr, int n, int x) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > x) {
				high = mid - 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				if (mid == n - 1 || arr[mid] != arr[mid + 1]) {
					return mid;
				} else {
					low = mid + 1;
				}
			}
		}
		return -1;
	}

	private static int count(int[] arr, int n, int x) {
		int first = firstOcc(arr, n, x);
		int last = lastOcc(arr, n, x);
		if (first == -1) {
			return 0;
		} else {
			return last - first + 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Element to Search: ");
		int x = sc.nextInt();
		System.out.println(count(arr, n, x));
		sc.close();
	}
}
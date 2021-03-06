package searching;

import java.util.Scanner;

public class SortedRotatedArray {

	private static int search(int[] arr, int n, int x) {
		int low = 0, high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == x) {
				return mid;
			}
			if (arr[mid] > arr[low]) {
				if (arr[mid] > x && x >= arr[low]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (x > arr[mid] && x <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
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
		System.out.println(search(arr, n, x));
		sc.close();
	}
}
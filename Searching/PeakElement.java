package Searching;

import java.util.Scanner;

public class PeakElement {

	private static int peakElement(int[] arr, int n) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if ((mid == n - 1 || arr[mid] >= arr[mid + 1]) && (mid == 0 || arr[mid] >= arr[mid - 1])) {
				return mid;
			} else {
				if ((mid > 0) && (arr[mid] < arr[mid - 1])) {
					high = mid - 1;
				} else {
					low = mid + 1;
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
		System.out.println(peakElement(arr, n));
		sc.close();
	}
}
/*
  An element is called a peak element if its value is not smaller than the
  value of its adjacent elements(if they exists). Given an array arr[] of size
  N, find the index of any one of its peak elements. Note: The generated output
  will always be 1 if the index that you return is correct. Otherwise output
  will be 0.
 */

package searching.problems;

import java.util.Scanner;

public class PeakElement {

	private static int peakElement(int[] arr, int n) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
				return mid;
			} else {
				if (mid > 0 && arr[mid - 1] > arr[mid]) {
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
		int[] arr = new int[n];
		System.out.println("Elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(peakElement(arr, n));
		sc.close();
	}
}
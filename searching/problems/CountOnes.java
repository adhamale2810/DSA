/*
  Given a binary sorted non-increasing array of 1s and 0s. You need to print the count of 1s in the binary array.
 */
package searching.problems;

import java.util.Scanner;

public class CountOnes {

	public static int countOnes(int[] arr, int N) {
		int low = 0;
		int high = N - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == 0) {
				high = mid - 1;
			} else {
				if (mid == N - 1 || arr[mid] != arr[mid + 1]) {
					return mid + 1;
				} else {
					low = mid + 1;
				}
			}
		}
		return 0;
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
		System.out.println(countOnes(arr, n));
		sc.close();
	}
}
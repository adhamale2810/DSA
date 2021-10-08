package arrays;

import java.util.Scanner;

/**
 * Find if any subarray of K size is there whose sum is equal to the given sum
 */

public class SlidingWindow2 {

	private static boolean findWindow(int[] arr, int n, int k, int sum) {
		int curr = 0;
		for (int i = 0; i < k; i++) {
			curr += arr[i];
		}
		for (int i = k; i < n; i++) {
			curr += (arr[i] - arr[i - k]);
			if (curr == sum) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Size of SubArray: ");
		int k = sc.nextInt();
		System.out.print("Sum: ");
		int sum = sc.nextInt();
		System.out.println("Elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findWindow(arr, n, k, sum));
		sc.close();
	}
}
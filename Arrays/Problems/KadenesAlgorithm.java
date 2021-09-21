/**
 * Given an array Arr[] of N integers. Find the contiguous sub-array(containing
 * at least one number) which has the maximum sum and return its sum.
 */

package Arrays.Problems;

import java.util.Scanner;

public class KadenesAlgorithm {

	private static long maxSubarraySum(int arr[], int n) {
		long curr = arr[0];
		long maxSum = arr[0];
		for (int i = 1; i < n; i++) {
			curr = curr + arr[i] > arr[i] ? curr + arr[i] : arr[i];
			maxSum = maxSum > curr ? maxSum : curr;
		}
		return maxSum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxSubarraySum(arr, n));
		sc.close();
	}
}
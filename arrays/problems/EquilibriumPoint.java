/*
  Given an array A of n positive numbers. The task is to find the first
  Equilibium Point in the array. Equilibrium Point in an array is a position
  such that the sum of elements before it is equal to the sum of elements after
  it.
 */

package arrays.problems;

import java.util.Scanner;

public class EquilibriumPoint {

	public static int equilibriumPoint(long[] arr, int n) {
		long total = 0;
		for (int i = 0; i < n; i++) {
			total += arr[i];
		}
		if (total == 0) {
			return 1;
		} else if (arr.length == 1) {
			return 1;
		}
		long sumtilli = arr[0];
		long sumtilliminus1 = 0;
		for (int i = 1; i < n; i++) {
			sumtilli += arr[i];
			sumtilliminus1 += arr[i - 1];
			if (sumtilliminus1 == total - sumtilli) {
				return i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(equilibriumPoint(arr, n));
		sc.close();
	}
}
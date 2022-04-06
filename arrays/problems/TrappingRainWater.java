/*
  Given an array arr[] of N non-negative integers representing the height of
  blocks. If width of each block is 1, compute how much water can be trapped
  between the blocks during the rainy season.
 */

package arrays.problems;

import java.util.Scanner;

public class TrappingRainWater {
	static long trappingWater(int[] arr, int n) {
		int[] lmax = new int[n];
		int[] rmax = new int[n];
		// max from left
		lmax[0] = arr[0];
		for (int i = 1; i < n; i++) {
			lmax[i] = Math.max(lmax[i - 1], arr[i]);
		}
		// max from right
		rmax[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rmax[i] = Math.max(rmax[i + 1], arr[i]);
		}
		// calculate water trapped
		long waterTrapped = 0;
		for (int i = 1; i < n - 1; i++) {
			waterTrapped += ((Math.min(lmax[i], rmax[i])) - arr[i]);
		}
		return waterTrapped;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(trappingWater(arr, n));
		sc.close();
	}
}
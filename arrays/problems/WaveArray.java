/*
  Given a sorted array arr[] of distinct integers. Sort the array into a
  wave-like array and return it In other words, arrange the elements into a
  sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
 */

package arrays.problems;

import java.util.Scanner;

public class WaveArray {

	public static void convertToWave(int[] arr, int n) {
		for (int i = 0; i < n - 1; i = i + 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		convertToWave(arr, n);
		sc.close();
	}
}
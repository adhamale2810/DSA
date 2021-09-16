/**
 * Given an array arr[] of n positive integers. 
 * The task is to find the maximum for every adjacent pairs in the array.
 */
package Arrays.Problems;

import java.util.Scanner;

public class StrongestNeighbour {

	private static void maximumAdjacent(int sizeOfArray, int arr[]) {
		for (int i = 0; i < sizeOfArray - 1; i++) {
			System.out.print((arr[i] > arr[i + 1] ? arr[i] : arr[i + 1]) + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		maximumAdjacent(n, arr);
		sc.close();
	}
}
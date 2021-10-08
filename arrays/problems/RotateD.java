/*
  Given an unsorted array arr[] of size N, rotate it by D elements in the counter-clockwise direction.
 */
package arrays.problems;

import java.util.Scanner;

public class RotateD {

	private static void rotateArr(int[] arr, int d, int n) {
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static void reverse(int[] arr, int s, int e) {
		int low = s;
		int high = e;
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		rotateArr(arr, d, n);
		sc.close();
	}
}
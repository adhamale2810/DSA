/*
  Given a sorted array of positive integers (elements may be repeated) and a
  number x. The task is to find the leftmost index of x in the given array.
 */

package searching.problems;

import java.util.Scanner;

public class LeftIndex {

	private static int leftIndex(int N, int[] arr, int X) {
		int low = 0;
		int high = N - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > X) {
				high = mid - 1;
			} else if (arr[mid] < X) {
				low = mid + 1;
			} else {
				if (mid == 0 || arr[mid - 1] != arr[mid]) {
					return mid;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int N = sc.nextInt();
		int[] arr = new int[N];
		System.out.println("Elements:");
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Element to Search: ");
		int X = sc.nextInt();
		System.out.println(leftIndex(N, arr, X));
		sc.close();
	}
}
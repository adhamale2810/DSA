package Searching;

import java.util.Scanner;

public class CountZeroes {

	private static int count(int[] arr, int n) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == 1) {
				low = mid + 1;
			} else {
				if (mid == 0 || arr[mid - 1] == 1) {
					return (n - mid);
				} else {
					high = mid - 1;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println(count(arr, n));
		sc.close();
	}
}
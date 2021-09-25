package Searching;

import java.util.Scanner;

public class CountOnes {

	private static int countOnes(int[] arr, int n) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == 0) {
				low = mid + 1;
			} else {
				if (mid == 0 || arr[mid - 1] == 0) {
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
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(countOnes(arr, n));
		sc.close();
	}
}
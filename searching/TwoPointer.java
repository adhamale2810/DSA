package searching;

import java.util.Scanner;

public class TwoPointer {

	private static boolean pairSum(int[] arr, int n, int s) {
		int low = 0;
		int high = n - 1;
		while (low < high) {
			if (arr[low] + arr[high] == s) {
				return true;
			} else {
				if (arr[low] + arr[high] > s) {
					high--;
				} else {
					low++;
				}
			}
		}
		return false;
	}

	private static boolean isPair(int[] arr, int low, int high, int s) {
		while (low <= high) {
			if (arr[low] + arr[high] == s) {
				return true;
			} else {
				if (arr[low] + arr[high] > s) {
					high--;
				} else {
					low++;
				}
			}
		}
		return false;
	}

	private static boolean tripletSum(int[] arr, int n, int s) {
		for (int i = 0; i < n; i++) {
			if (isPair(arr, i + 1, n - 1, s - arr[i])) {
				return true;
			}
		}
		return false;
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
		System.out.print("Sum: ");
		int s = sc.nextInt();
		// System.out.println(pairSum(arr, n, s));
		System.out.println(tripletSum(arr, n, s));
		sc.close();
	}
}
package Arrays;

import java.util.Scanner;

public class EquilibriumPoint {

	// Uses O(n) auxiliary space
	private static int[] makeArray(int[] arr, int n) {
		int[] sum = new int[n];
		sum[0] = arr[0];
		for (int i = 1; i < n; i++) {
			sum[i] = sum[i - 1] + arr[i];
		}
		return sum;
	}

	private static int getSum(int[] arr, int l, int r) {
		if (l != 0) {
			return arr[r] - arr[l - 1];
		} else {
			return arr[r];
		}
	}

	private static boolean checkPoint(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				if (getSum(arr, 1, n - 1) == 0) {
					return true;
				}
			} else if (i == n - 1) {
				if (getSum(arr, 0, n - 2) == 0) {
					return true;
				}
			} else {
				if (getSum(arr, 0, i - 1) == getSum(arr, i + 1, n - 1)) {
					return true;
				}
			}
		}
		return false;
	}

	// Uses O(1) auxiliary space
	private static int findPoint(int[] arr, int n) {
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += arr[i];
		}
		int tempSum = 0;
		for (int i = 0; i < n; i++) {
			if (tempSum == total - arr[i]) {
				return i;
			}
			tempSum += arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// System.out.println(checkPoint(makeArray(arr, n), n));
		System.out.println(findPoint(arr, n));
		sc.close();
	}
}
package Arrays;

import java.util.Scanner;

public class PrefixSum_1 {

	private static int[] getArray(int[] arr, int n) {
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Elements: ");
		int n = sc.nextInt();
		System.out.println("Elements:");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Starting Index: ");
		int l = sc.nextInt();
		System.out.print("Ending Index: ");
		int r = sc.nextInt();
		System.out.println(getSum(getArray(arr, n), l, r));
		sc.close();
	}
}
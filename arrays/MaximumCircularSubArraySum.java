package arrays;

import java.util.Scanner;

public class MaximumCircularSubArraySum {

	private static int maxCircularSum(int[] arr, int n) {
		int res = arr[0];
		for (int i = 0; i < n; i++) {
			int curr_max = arr[i];
			int curr_sum = arr[i];
			for (int j = 1; j < n; j++) {
				int index = (i + j) % n;
				curr_sum += arr[index];
				curr_max = Math.max(curr_max, curr_sum);
			}
			res = Math.max(res, curr_max);
		}
		return res;
	}

	private static int maxCircularSumN(int[] arr, int n) {
		int kadeneMax = arr[0];
		int sum = arr[0];
		for (int i = 1; i < n; i++) {
			sum = Math.max((sum + arr[i]), arr[i]);
			kadeneMax = Math.max(kadeneMax, sum);
		}

		int circularMax;
		int minSum = arr[0];
		int kadeneMin = arr[0];
		for (int i = 1; i < n; i++) {
			minSum = Math.min(arr[i], minSum + arr[i]);
			kadeneMin = Math.min(kadeneMin, minSum);
		}
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += arr[i];
		}
		circularMax = total - kadeneMin;
		return Math.max(kadeneMax, circularMax);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxCircularSumN(arr, n));
		sc.close();
	}
}
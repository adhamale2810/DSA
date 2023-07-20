package arrays;

import java.util.Scanner;

public class MaximumSubArraySum {

	private static int sum(int[] arr, int n) {
		int sum = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			for (int j = i + 1; j < n; j++) {
				sum += arr[j];
			}
			max = sum > max ? sum : max;
			sum = 0;
		}
		return max;
	}

	private static int sumN(int[] arr, int n) {
		int sum = arr[0];
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			sum = arr[i] > arr[i] + sum ? arr[i] : arr[i] + sum;
			max = max > sum ? max : sum;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sumN(arr, n));
		sc.close();
	}
}
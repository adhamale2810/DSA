package arrays;

import java.util.Scanner;

public class MaximumDifference {

	private static int maxDiff(int[] arr, int n) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (j < i) {
					break;
				}
				max = max < arr[j] - arr[i] ? arr[j] - arr[i] : max;
			}
		}
		return max;
	}

	private static int myMaxDiff(int[] arr, int n) {
		int max = -1;
		int min = -1;
		int minindex = -1;
		int maxindex = -1;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				max = arr[i];
				min = arr[i];
				minindex = i;
				maxindex = i;
			} else {
				if ((min > arr[i]) && (i < maxindex)) {
					min = arr[i];
					minindex = i;
				}
				if ((max < arr[i]) && (i > minindex)) {
					max = arr[i];
					maxindex = i;
				}
			}
		}
		return max - min;
	}

	private static int efficientMaxDiff(int[] arr, int n) {
		int res = arr[1] - arr[0];
		int minval = arr[0];
		for (int j = 0; j < n; j++) {
			res = res < arr[j] - minval ? arr[j] - minval : res;
			minval = minval > arr[j] ? arr[j] : minval;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// System.out.println(maxDiff(arr, n));
		// System.out.println(myMaxDiff(arr, n));
		System.out.println(efficientMaxDiff(arr, n));
		sc.close();
	}
}
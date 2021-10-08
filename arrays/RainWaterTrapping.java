package arrays;

import java.util.Scanner;

public class RainWaterTrapping {

	private static int getWater(int[] arr, int n) {
		int water = 0;
		int[] lmax = new int[n];
		int[] rmax = new int[n];
		lmax[0] = arr[0];
		rmax[n - 1] = arr[n - 1];
		// pre-processing value of left max
		for (int i = 1; i < n; i++) {
			lmax[i] = arr[i] > lmax[i - 1] ? arr[i] : lmax[i - 1];
		}
		// pre-processing value of right max
		for (int i = n - 2; i >= 0; i--) {
			rmax[i] = arr[i] > rmax[i + 1] ? arr[i] : rmax[i + 1];
		}

		for (int i = 1; i < n - 1; i++) {
			water += (Math.min(lmax[i], rmax[i]) - arr[i]);
		}
		return water;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getWater(arr, n));
		sc.close();
	}
}
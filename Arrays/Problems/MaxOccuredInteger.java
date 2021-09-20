package Arrays.Problems;

import java.util.Scanner;

public class MaxOccuredInteger {

	private static int maxOccured(int[] L, int[] R, int n, int maxx) {
		int[] hash = new int[maxx + 1];
		for (int i = 0; i < n; i++) {
			for (int j = L[i]; j <= R[i]; j++) {
				hash[j]++;
			}
		}
		int max = -1;
		int index = 0;
		for (int i = 0; i <= maxx; i++) {
			if (hash[i] > max) {
				max = hash[i];
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of Array: ");
		int n = sc.nextInt();
		System.out.println("Enter start array:");
		int[] L = new int[n];
		for (int i = 0; i < n; i++) {
			L[i] = sc.nextInt();
		}
		System.out.println("Enter end array:");
		int[] R = new int[n];
		for (int i = 0; i < n; i++) {
			R[i] = sc.nextInt();
		}
		System.out.print("Enter the highest possible value in ranges: ");
		int maxx = sc.nextInt();
		System.out.println(maxOccured(L, R, n, maxx));
		sc.close();
	}
}
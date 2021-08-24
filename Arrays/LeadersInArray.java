package Arrays;

import java.util.Scanner;

public class LeadersInArray {

	private static void leaders(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] <= arr[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(arr[i]);
			}
		}
	}

	private static void efficientLeaders(int[] arr, int n) {
		int curr = arr[n - 1];
		System.out.println(curr);
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > curr) {
				System.out.println(arr[i]);
				curr = arr[i];
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Leaders:");
		efficientLeaders(arr, n);
		sc.close();
	}
}
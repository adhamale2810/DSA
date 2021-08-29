package Arrays;

import java.util.Scanner;

public class MajorityElement {

	private static int majorityElement(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > n / 2) {
				return i;
			}
		}
		return -1;
	}

	private static int majorityElementN(int[] arr, int n) {
		int count = 1;
		int index = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[index]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				index = i;
				count = 1;
			}
		}
		count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == arr[index]) {
				count++;
			}
			if (count > n / 2) {
				return arr[index];
			}
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
		System.out.println(majorityElementN(arr, n));
		sc.close();
	}
}
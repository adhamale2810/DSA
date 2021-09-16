package Arrays;

import java.util.Scanner;

public class FrequenciesSortedArray {

	private static void frequency(int[] arr, int n) {
		int count = 1;
		int i = 1;
		while (i < n) {
			while (i < n && arr[i] == arr[i - 1]) {
				count++;
				i++;
			}
			System.out.println(arr[i - 1] + " " + count);
			i++;
			count = 1;
		}
		if (n == 1 || arr[n - 1] != arr[n - 2]) {
			System.out.println(arr[n - 1] + " " + 1);
		}
	}

	private static void myFrequency(int[] arr, int n) {
		int curr = arr[0];
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (curr == arr[i]) {
				count++;
			}
			if (curr != arr[i]) {
				System.out.println(curr + " " + count);
				curr = arr[i];
				count = 1;
			}
			if (i == n - 1) {
				System.out.println(curr + " " + count);
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
		myFrequency(arr, n);
		sc.close();
	}
}
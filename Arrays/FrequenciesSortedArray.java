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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		frequency(arr, n);
		sc.close();
	}
}
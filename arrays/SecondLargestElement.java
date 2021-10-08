package arrays;

import java.util.Scanner;

public class SecondLargestElement {

	public static int secondLargest(int[] arr) {
		int max = -1;
		int secondMax = -1;
		for (int i = 0; i < arr.length; i++) {
			max = arr[i] > max ? arr[i] : max;
			if (i == 0) {
				secondMax = arr[i];
			}
			if ((arr[i] > secondMax) && (arr[i] < max)) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(secondLargest(arr));
		sc.close();
	}
}
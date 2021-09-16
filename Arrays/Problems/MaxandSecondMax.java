/**
 * Given an array arr[] of size N of positive integers which may have duplicates. 
 * The task is to find the maximum and second maximum from the array, and both of them should be distinct, 
 * so If no second max exists, then the second max will be -1.
 */
package Arrays.Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxandSecondMax {

	public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
		int max = -1;
		int secondMax = -1;
		for (int i = 0; i < sizeOfArray; i++) {
			max = max < arr[i] ? arr[i] : max;
		}
		for (int i = 0; i < sizeOfArray; i++) {
			if (arr[i] > secondMax && arr[i] != max && arr[i] < max) {
				secondMax = arr[i];
			}
		}
		ArrayList<Integer> ar = new ArrayList<>(); // result arraylist declaration
		ar.add(max);
		ar.add(secondMax);
		return ar;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> ar = largestAndSecondLargest(n, arr);
		System.out.println("Max: " + ar.get(0));
		System.out.println("Second Max: " + ar.get(1));
		sc.close();
	}
}
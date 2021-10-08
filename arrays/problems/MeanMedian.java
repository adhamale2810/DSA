/*
  Given an array a[ ] of size N. The task is to find the median and mean of the array elements.
  Mean is average of the numbers and median is the element which is smaller than half of the elements and
  greater than remaining half.  If there are odd elements, the median is simply the middle element in the
  sorted array. If there are even elements, then the median is floor of average of two middle numbers in
  the sorted array. If mean is floating point number, then we need to print floor of it.
  Note: To find the median, you might need to sort the array. Since sorting is covered in later tracks,
  we have already provided the sort function to you in the code.
 */
package arrays.problems;

import java.util.Scanner;
import java.util.Arrays;

public class MeanMedian {
	public static int median(int[] A, int N) {
		Arrays.sort(A);
		if (N % 2 == 0) {
			return (A[(N / 2) - 1] + A[(N / 2)]) / 2;
		} else {
			return A[N / 2];
		}
	}

	public static int mean(int[] A, int N) {
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += A[i];
		}
		return sum / N;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Median: " + median(arr, n));
		System.out.println("Mean: " + mean(arr, n));
		sc.close();
	}
}
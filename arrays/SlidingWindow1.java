package arrays;

/*
  Find maximum sum of subarray of K consecutive elements
 */
import java.util.Scanner;

public class SlidingWindow1 {

	private static int windowSlide(int[] arr, int n, int k) {
		int curr = 0;
		for (int i = 0; i < k; i++) {
			curr += arr[i];
		}
		int max = 0;
		for (int i = k; i < n; i++) {
			curr += (arr[i] - arr[i - k]);
			max = Math.max(max, curr);
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int k = sc.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(windowSlide(arr, n, k));
		sc.close();
	}
}
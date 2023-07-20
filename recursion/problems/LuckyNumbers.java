/*
  Lucky numbers are subset of integers. Rather than going into much theory, let
  us see the process of arriving at lucky numbers,
  Take the set of integers 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
  First, delete every second number, we get following reduced set.
  1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
  Now, delete every third number, we get 1, 3, 7, 9, 13, 15, 19,….….
  Continue this process indefinitely…… Any number that does NOT get deleted due to above process is called “lucky”.
 */

package recursion.problems;

import java.util.Scanner;

public class LuckyNumbers {

	public static int counter = 2;

	private static boolean isLucky(int n) {
		if (counter > n) {
			return true;
		}
		if (n % counter == 0) {
			return false;
		}
		n = n - (n / counter);
		counter++;
		return isLucky(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isLucky(sc.nextInt()));
		sc.close();
	}
}
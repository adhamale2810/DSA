/*
  The tower of Hanoi is a famous puzzle where we have three rods and N disks.
  The objective of the puzzle is to move the entire stack to another rod. You
  are given the number of discs N. Initially, these discs are in the rod 1. You
  need to print all the steps of discs movement so that all the discs reach the
  3rd rod. Also, you need to find the total moves. Note: The discs are arranged
  such that the top disc is numbered 1 and the bottom-most disc is numbered N.
  Also, all the discs have different sizes and a bigger disc cannot be put on
  the top of a smaller disc. Refer the provided link to get a better clarity
  about the puzzle.
 */
package recursion.problems;

import java.util.Scanner;

public class Hanoi {

	private static long toh(int N, int from, int to, int aux) {
		if (N == 1) {
			System.out.println("move disk 1 from rod " + from + " to rod " + to);
			return (long) Math.pow(2, N) - 1;
		}
		toh(N - 1, from, aux, to);
		System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
		toh(N - 1, aux, to, from);
		return (long) Math.pow(2, N) - 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(toh(sc.nextInt(), 1, 3, 2));
		sc.close();
	}
}

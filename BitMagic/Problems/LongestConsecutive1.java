package BitMagic.Problems;

import java.util.Scanner;

public class LongestConsecutive1 {

	private static int longest(int n) {
		int count = 0;
		while (n != 0) {
			n = (n & n << 1);
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(longest(sc.nextInt()));
		sc.close();
	}
}
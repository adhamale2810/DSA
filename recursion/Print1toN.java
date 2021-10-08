package recursion;

import java.util.Scanner;

public class Print1toN {

	private static void print1toN(int n) {
		if (n == 0) {
			return;
		}
		print1toN(n - 1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		print1toN(sc.nextInt());
		sc.close();
	}
}
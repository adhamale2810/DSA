package recursion;

import java.util.*;

public class PrintNto1 {

	private static void printNto1(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printNto1(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printNto1(sc.nextInt());
		sc.close();
	}
}
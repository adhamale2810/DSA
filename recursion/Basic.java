package recursion;

import java.util.Scanner;

public class Basic {

	private static void fun(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		fun(n - 1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		fun(sc.nextInt());
		sc.close();
	}
}
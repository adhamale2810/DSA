package Recursion;

import java.util.Scanner;

public class Basic2 {

	private static void fun(int n) {
		if (n == 0) {
			return;
		}
		fun(n - 1);
		System.out.println(n);
		fun(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		fun(sc.nextInt());
		sc.close();
	}
}
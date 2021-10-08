/*
  Given a quadratic equation in the form ax2 + bx + c. Find its roots.
  Note: Return the maximum root followed by the minimum root.
 */

package mathematics.problems;

import java.util.*;

public class QuadriaticEquationRoots {
	public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
		ArrayList<Integer> roots = new ArrayList<Integer>(2);
		double D = (b * b) - (4 * a * c);
		if (D < 0) {
			roots.add(-1);
		} else if (D == 0) {
			double root = Math.floor(((-b + Math.sqrt(D))) / (2 * a));
			roots.add((int) root);
			roots.add((int) root);
		} else {
			int root1 = (int) Math.floor((-b + Math.sqrt(D)) / (2 * a));
			int root2 = (int) Math.floor((-b - Math.sqrt(D)) / (2 * a));
			if (root1 > root2) {
				roots.add(root1);
				roots.add(root2);
			} else {
				roots.add(root2);
				roots.add(root1);
			}
		}
		return roots;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> roots = quadraticRoots(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println(roots);
		sc.close();
	}
}
package Lecture7;

import java.util.Scanner;

public class LastIndex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int c = 1;
		Pattern(i, c, n);

	}

	public static void Pattern(int i, int c, int n) {
		if (i > n) {
			return;
		}
		if (i <= n) {
			if (c <= i) {
				System.out.print("* ");
				Pattern(i, c + 1, n);
			return;
			}

		}

		System.out.println();
		c = 1;
		Pattern(i + 1, c, n);
	}

}

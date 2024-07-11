package java0711;

import java.util.Scanner;

public class Q6_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("별찍기");

		int n, w;
		do {
			System.out.print("n값: ");
			n = sc.nextInt();
		} while (n <= 0);
		do {
			System.out.print("w값: ");
			w = sc.nextInt();
		} while (w <= 0 || w > n);

		for (int i = 0; i < n / w; i++) {
			System.out.println("*".repeat(w));
		}
		int rest = n % w;
		if (rest != 0) {
			System.out.println("*".repeat(rest));
		}
	}
}

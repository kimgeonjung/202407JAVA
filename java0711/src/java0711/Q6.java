package java0711;

import java.util.Scanner;

/**
 * *을 n개 출력하되 w개마다 줄을 바꿔서 출력
 */
public class Q6 {
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

		for (int i = 0; i < n; i++) {
			System.out.print("*");
			if (i % w == w - 1) {
				System.out.println();
			}
		}
	}
}

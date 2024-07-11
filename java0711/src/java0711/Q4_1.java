package java0711;

import java.util.Scanner;

public class Q4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 n까지의 합");

		int sum = 0;
		System.out.print("숫자: ");
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			System.out.print(i + "+");
			sum += i;
		}

		System.out.print(n + "=");
		sum += n;
		System.out.println(sum);

	}
}

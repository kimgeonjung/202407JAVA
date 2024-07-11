package java0711;

import java.util.Scanner;

/**
 * for문으로 1부터 n까지의 합 출력
 */
public class Q2 {
	public static int getNum(String msg, Scanner scan) {
		System.out.print(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		
		System.out.println("숫자 n까지의 합");
		
		do {
			n = getNum("n: ", sc);
		} while (n <= 0);
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.printf("1부터 %d까지의 합은 %d", n, sum);
	}
}

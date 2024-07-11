package java0711;

import java.util.Scanner;

/**
 * 3개의 정수 값을 입력받아 중앙값을 구하고 출력 
 */
public class Q1 {
	public static int getNum(String msg, Scanner scan) {
		System.out.print(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}

	public static int med(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a)) {
			//b가 a이상, c가 a이하 또는 b가 a이하, c가 a이상
			return a;
		} else if ((a > b && c < b) || (a < b && c > b)) {
//	위에서 걸러진거니까 b가 a미만, c가 b미만 또는 a가 b미만, c가 b초과	
			return b;
		}
		return c;

	}

	/*
	 * if (a >= b) { // else= a는 b보다 작음 if (b >= c) { return b; } else if (a <= c) {
	 * return a; } else { return c; } } else if (a > c) { return a; } else if (b >
	 * c) { return c; } else { return b; } }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수의 중앙값을 구하시오");
		int a = getNum("숫자1: ", sc);
		int b = getNum("숫자2: ", sc);
		int c = getNum("숫자3: ", sc);

		System.out.println(med(a, b, c));
	}
}

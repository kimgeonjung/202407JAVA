package java0709;
/**
 * 정수의 값을 입력 받고 입력받은 값이 양의 정수면 그냥 출력 음의 정수면 양의 정수로 변환 후 출력
 */

import java.util.Scanner;

public class Prob6 {
	public static int getNum(String msg, Scanner scan) {
		System.out.print(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = getNum("정수 입력: ", sc);

		if (num < 0) {
			num = -num;
		}
		System.out.println(num);
	}
}

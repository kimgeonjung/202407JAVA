package java0709;
/**
 * 100점 만점의 학점을 입력받아서 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 60 미만이면 F를
 * 출력 입력 받는 점수는 0~100 사이의 값만 넣어야 함
 */

import java.util.Scanner;

public class Prob5 {
	public static int getNum(String msg, Scanner scan) {
		System.out.print(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = getNum("학점을 입력하세요: ", sc);

		if (grade > 100 || grade < 0) {
			System.out.println("100~0 사이의 값을 넣어주세요");
		} else {
			if (grade >= 90) {
				System.out.println("A");
			} else if (grade >= 80) {
				System.out.println("B");
			} else if (grade >= 70) {
				System.out.println("C");
			} else if (grade >= 60) {
				System.out.println("D");
			} else if (grade < 60) {
				System.out.println("F");
			}
		}
	}
}

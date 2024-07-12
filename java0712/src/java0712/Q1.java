package java0712;

import java.util.Scanner;

/**
 * 2차원 배열을 이용하여 국어점수와 수학점수를 입력받아서 학생별 평균을 출려하는 프로그램을 작성하시오 
 * double scores[][] =
 * new double[num][3];
 */
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("학생 수 입력: ");
		int num = Integer.parseInt(sc.nextLine());
		double scores[][] = new double[num][3];
		int n;

		for (int i = 0; i < scores.length; i++) {
			n = i + 1;
			System.out.println(n + "번 학생");

			System.out.print("국어 점수 입력: ");
			scores[i][0] = Double.parseDouble(sc.nextLine());

			System.out.print("수학 점수 입력: ");
			scores[i][1] = Double.parseDouble(sc.nextLine());
			scores[i][2] = (scores[i][0] + scores[i][1]) / 2;
		}

		System.out.println("\t국어\t수학\t평균");
		System.out.println("==============================");
		for (int i = 0; i < scores.length; i++) {
			n = i + 1;
			System.out.print(n + "번 학생:");
			System.out.printf("\t%3.2f\t%3.2f\t%3.2f\t\n", scores[i][0], scores[i][1], scores[i][2]);
		}
	}
}
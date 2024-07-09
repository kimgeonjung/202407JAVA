package java0709;
/**
 * 메소드를 사용해서 사과의 갯수와 친구의 수를 입력받아 남는 사과의 개수를 구하는 코드
 */

import java.util.Scanner;

public class Prob2 {
	public static int getCount(String msg, Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();
		return Integer.parseInt(input);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int apple = getCount("사과 개수 입력: ", scan);
		int people = getCount("친구 명수 입력: ", scan);
		int remainder = apple % (people+1); //+1은 나 자신
		System.out.println("남은 사과 개수: " + remainder);
	}
}
package java0709;
/**
 * 숫자 두 개를 입력받아 더 큰 숫자를 출력. 단, 같으면 0 
 */
import java.util.Scanner;

public class Prob3 {
	public static int getNum(String msg, Scanner scan) {
		System.out.print(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = getNum("숫자 1 입력: ", sc); 
		int y = getNum("숫자 2 입력: ", sc);
		
		if (x > y) {
			System.out.println(x);
		} else if (x < y) {
			System.out.println(y);
		} else {
			System.out.println(0);
		}
	}
}

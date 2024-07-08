package java0708;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print(">>");
		String str = scanner.nextLine();

		System.out.println(str);
	}
}

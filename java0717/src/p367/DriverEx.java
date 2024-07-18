package p367;

import java.util.Scanner;

public class DriverEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("차량 선택(1. 버스 | 2. 택시): ");
		int num = sc.nextInt();

		Driver dr = new Driver();
		Vehicle v = null;
		
		switch (num) {
		case 1: v = new Bus();
			break;
		case 2: v = new Taxi();
			break;
		default:
			System.out.println("다시선택");
		}

		dr.drive(v);
	}
}

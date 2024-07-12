package java0712;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("배열 크기 입력: ");
		int num=Integer.parseInt(sc.nextLine());
		int arr[]=new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print(i+"번째 값: ");
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		
		for(int n:arr) {
			System.out.println(n);
		}

	}

}

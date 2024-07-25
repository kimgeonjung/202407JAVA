package java0725;

import java.util.Arrays;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] array = { 1, 1, 4, 5, 7, 8, 11, 12, 17, 21, 24 };
//		int[] array = { 3, 1, 13, 2, 8, 5, 1 };
		int found = Arrays.binarySearch(array, 8);

		System.out.println(found);
	}
}

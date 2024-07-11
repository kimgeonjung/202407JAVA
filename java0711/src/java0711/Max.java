package java0711;

public class Max {

	public static void main(String[] args) {
		int a[] = { 1, 32, 10, 2, 8 };
		int max = a[0];
System.out.println(max);
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println(max);

	}

}

package java0710;

public class Ex1 {
	public static void main(String[] args) {
		byte b1 = -65;
		char c1 = (char) b1;
		System.out.println(c1);

		int x = 200;
		byte y = (byte) x;
		System.out.println(y);

		double d1 = 3.14;
		int z = (int) d1;
		System.out.println(z);

		byte b2 = 10;
		byte b3 = 20;
		byte b4 = (byte) (b2 + b3);
		int s1 = b2 + b3;
		System.out.println(s1);
		System.out.println(b4);

		float res1 = 1.5f + 2.3f;
		double res2 = 1.5 + 2.3;

		int x1 = 1;
		int x2 = 3;
		double res3 = (double) x1 / x2;
		int res4 = x1 / x2; // 몫을 계산함
		System.out.println(res3);
		System.out.println(res4);

		double s2 = Double.parseDouble("100") + 3;
		System.out.println(s2);
		String s3 = 3 + "100";
		System.out.println(s3);

		String str1 = 10+"";
		String str2 = String.valueOf(10);
	}
}

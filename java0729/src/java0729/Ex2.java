package java0729;

public class Ex2 {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		int sum = 0;
		for (int i = 0; i < 100000000; i++) {
			sum+=i;
		}
		long time2 = System.nanoTime();
		System.out.println("1~100000000까지의 합: "+sum);
		System.out.println(time2-time1+"나노초 소요");
	}	
}

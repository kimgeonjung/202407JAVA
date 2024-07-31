package java0731;

import java.util.Arrays;
import java.util.List;

public class Ex6 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동","신용권","김자바","신용권","신인철");
		
		names.stream().limit(2)
		.forEach(n->System.out.println(n));
		System.out.println();
		
		// 중복 없이 전체 출력
		names.stream().distinct()	// distinct 중복 제거
		.forEach(n->System.out.println(n));
		System.out.println();
		
		// 신으로 시작하는 이름들 출력
		names.stream().filter(n->n.startsWith("신"))	
		.forEach(n->System.out.println(n));
		System.out.println();
		
		// 신으로 시작하는 이름 출력하는데 중복 제거
		names.stream().distinct().filter(n->n.startsWith("신"))
		.forEach(n->System.out.println(n));

	}
}

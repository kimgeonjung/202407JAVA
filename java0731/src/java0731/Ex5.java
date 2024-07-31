package java0731;

import java.util.Arrays;
import java.util.List;

public class Ex5 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍씨", Member.MALE, 30),
				new Member("김씨", Member.FEMALE, 20),
				new Member("박씨", Member.MALE, 45),
				new Member("최씨", Member.FEMALE, 27)
				);
		
		// 전체 평균 나이
		double allAvg = list.stream().mapToInt(Member::getAge).average().orElse(0);
		System.out.println(allAvg);
		
		// 남자 평균 나이
		double maleAvg = list.stream()
				.filter(x->x.getSex() == Member.MALE)	// 남자 필터링
				.mapToInt(Member::getAge).average().orElse(0);
		System.out.println(maleAvg);
		
	}
}

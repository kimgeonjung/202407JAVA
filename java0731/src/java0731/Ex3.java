package java0731;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ex3 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍씨", 90), 
				new Student("강씨", 92), 
				new Student("김씨", 88)
				);
		int sum = list.stream().mapToInt(s -> s.getScore()).sum();
		System.out.println(sum);
		sum = list.stream().mapToInt(Student::getScore).sum();	// 메소드 참조
		System.out.println(sum);
		
		OptionalDouble avg = list.stream().mapToDouble(Student::getScore).average();
		System.out.println(avg);
		double avg1 = list.stream().mapToDouble(Student::getScore).average().getAsDouble();
		System.out.println(avg1);


	}
}

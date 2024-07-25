package java0725;

import java.util.Arrays;
import java.util.Comparator;

public class StudentEx {
	public static void main(String[] args) {
		Student[] students = {
			new Student("홍길동", 61),
			new Student("최길동", 72),
			new Student("박길동", 94),
			new Student("이길동", 86),
			new Student("김길동", 50),
		};
		
		Comparator<Student> c = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o2.getScore(), o1.getScore());
			}
		};
		
		Arrays.sort(students, c);
		
		for(Student st : students) {
			System.out.println(st);
		}
	}
}

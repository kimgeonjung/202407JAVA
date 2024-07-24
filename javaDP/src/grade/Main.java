package grade;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		StudentGroup group = new StudentGroup(4);
		group.appendStudent(new Student("김김김", "191919", 95));
		group.appendStudent(new Student("나나나", "202020", 85));
		group.appendStudent(new Student("박박박", "212121", 75));
		group.appendStudent(new Student("이이이", "222222", 100));

		// 명시적 Iterator 사용방법
		Iterator<Student> it = group.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println(student);
		}
		System.out.println();

		// 확장 for문 사용방법
		for (Student student : group) {
			System.out.println(student);
		}
		System.out.println();
	}
}

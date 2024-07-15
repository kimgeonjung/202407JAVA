package dp2;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course("java");
		Course c2 = new Course("C/C++");
		Student s1 = new Student("민수");
		Student s2 = new Student("길동");
		
		Transcript t1 = new Transcript(c1, s1, "2024년 2학기", "A");  // 자바 민수
		Transcript t2 = new Transcript(c1, s2, "2024년 2학기", "B+"); // 자바 길동
		Transcript t3 = new Transcript(c2, s1, "2024년 2학기", "A+"); // C/C++ 민수

		s1.addTranscript(t1); // 민수 자바 성적 등록
		s2.addTranscript(t2); // 길동 자바 성적 등록
		s1.addTranscript(t3); // 민수 C/C++ 성적 등록
		
		c1.addTranscript(t1); // 자바 수강자 성적
		c1.addTranscript(t2); // 자바 수강자 성적
		
		c2.addTranscript(t3); // C/C++ 수강자 성적
		
//		System.out.println(s1);
		
		System.out.println("민수");
		for(Transcript tran:s1.getTranscript()) {
			System.out.print(tran.getCourses().getName()+": ");
			System.out.println(tran.getGrade());
		}
		System.out.println("----------------------------------");
		System.out.println("자바");
		for(Transcript tran:c1.getTranscript()) {
			System.out.println(tran.getStudents().getName());
			System.out.println(tran.getGrade());
		}
	}

}

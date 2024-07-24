package grade;

import java.util.Iterator;

import iterator.Book;

public class StudentGroup implements Iterable<Student>{
	private Student[] students;
	private int last = 0;
	
	@Override
	public Iterator<Student> iterator() {
		return new StudentIterator(this);
	}
	
	// 생성자 
	public StudentGroup(int maxsize) { 
		this.students = new Student[maxsize];
	}
	
	// 해당 인덱스의 학생을 리턴
	public Student getStudentAt(int index) { 
		return students[index];
	}
	
	// 학생을 추가
	public void appendStudent(Student student) { 
		this.students[last] = student;
		last++;
	}
	
	// 학생들의 총 명수
	public int getLength() {  
		return last;
	}	
}

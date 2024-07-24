package grade;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StudentIterator implements Iterator<Student> {
	private StudentGroup group;
	private int index;
	
	public StudentIterator(StudentGroup group) {
		this.group = group;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(index < group.getLength()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Student next() {
		if(!hasNext()) {
			throw new NoSuchElementException();
		}
		Student student = group.getStudentAt(index);
		index++;
		return student;
	}

}

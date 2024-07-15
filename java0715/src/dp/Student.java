package dp;

import java.util.Vector;

public class Student {
	private Professor advisor;
	private String name;
	private Vector<Course> courses;
	
	public Student() {}

	public Student(String name) {
		this.name = name;
		this.courses = new Vector<Course>();
	}

	// 추가
	public void registerCourse(Course course) {
		courses.add(course);
	}
	
	// 삭제
	public void dropCourse(Course course) {
		if (courses.contains(course)) {
			courses.remove(course);
		}
	}
	
	
	public Professor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vector<Course> getCourses() {
		return courses;
	}

	public void setCourses(Vector<Course> courses) {
		this.courses = courses;
	}


	public void advise(String msg) {
		System.out.println(msg);
	}

	@Override
	public String toString() {
		return "Student [advisor=" + advisor + ", name=" + name + ", courses=" + courses + "]";
	}
	
}

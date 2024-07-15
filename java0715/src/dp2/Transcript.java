package dp2;

public class Transcript {
	private Course courses;
	private Student students;
	private String date;
	private String grade;
	

	public Transcript() {
	}
	public Transcript(Course courses, Student students, String date, String grade) {
		this.courses = courses;
		this.students = students;
		this.date = date;
		this.grade = grade;
	}
	
	public Course getCourses() {
		return courses;
	}
	public void setCourses(Course courses) {
		this.courses = courses;
	}
	public Student getStudents() {
		return students;
	}
	public void setStudents(Student students) {
		this.students = students;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Transcript [courses=" + courses + ", students=" + students + ", date=" + date + ", grade=" + grade
				+ "]";
	}
	
	
}

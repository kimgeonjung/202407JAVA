package grade;

public class Student {
	private String name;
	private String hakbun;
	private double java;
	
	public Student(String name, String hakbun, double java) {
		this.name = name;
		this.hakbun = hakbun;
		this.java = java;
	}

	public String getName() {
		return name;
	}

	public String getHakbun() {
		return hakbun;
	}

	public double getJava() {
		return java;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", hakbun=" + hakbun + ", java=" + java + "]";
	}
}

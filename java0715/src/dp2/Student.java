package dp2;

import java.util.Vector;

public class Student {
	private Vector<Transcript> transcripts;
	private String name;
	
	public Student() {}
	public Student(String name) {
		this.name = name;
		this.transcripts = new Vector<Transcript>();
	}

	public Vector<Transcript> getTranscript() {
		return transcripts;
	}
	public void setTranscript(Vector<Transcript> transcript) {
		this.transcripts = transcript;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	@Override
	public String toString() {
		return "Student [transcripts=" + transcripts + ", name=" + name + "]";
	}
	
	
}

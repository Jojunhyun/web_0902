package com.UML;

public class Student {
	
	String name;
	Transcript transcript;
	
	public Student(String student) {
		this.name = student;
	}
	
	public void addTranscript(Transcript transcript) {
		this.transcript.transcripts.add(transcript);
	}
	
	public String getName() {
		return name;
	}

}

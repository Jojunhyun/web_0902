package com.UML;

public class Course {
	
	String name;
	Transcript trssrt;
	
	public Course(String course) {
		this.name = course;
	}
	
	public void addTranscript(Transcript transcript) {
		   trssrt.transcripts.add(transcript);
	}
	
	public String getName() {
		return name;
	}
	
}

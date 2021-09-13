package com.UML;

import java.util.Vector;

public class Transcript {
	
	String grade;
	String date;
	Student student;
	Course course;
	
	Vector<Transcript> transcripts;
	
	public Transcript(Student student, Course course) {
		student.addTranscript(new Transcript(student, course));
		course.addTranscript(new Transcript(student, course));
	}
	
	public Student getStudent() {
		return null;
	}
	
	public Course getCourse() {
		return null;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getGrade() {
		return grade;
	}
	
}

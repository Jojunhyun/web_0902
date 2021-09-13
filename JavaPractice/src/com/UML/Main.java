package com.UML;

public class Main {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동");
		Student s2 = new Student("홍길자");
		
		Course se = new Course("Software Engineering");
		Course designPattern = new Course("Design Pattern");
		
		Transcript t1 = new Transcript(s1, se);
		Transcript t2 = new Transcript(s1, designPattern);
		Transcript t3 = new Transcript(s2, designPattern);
		
		
		
	}

}

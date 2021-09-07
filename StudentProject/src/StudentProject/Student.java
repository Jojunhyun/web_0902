package StudentProject;

import java.util.ArrayList;

public class Student {
	
	ArrayList<Student> students = new ArrayList<Student>();
	
	String name;
	int age;
	String studentNum;
	String major;
	
	
	public Student(String name, int age, String studentNum, String major) {
		this.name = name;
		this.age = age;
		this.studentNum = studentNum;
		this.major = major;
	}
	
	public void addstudent(Student student) {
		students.add(student);
	}	
	
	
	public void alter(Student student) {
		students.set(0, student);
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	

}

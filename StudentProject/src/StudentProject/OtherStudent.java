package StudentProject;

import java.util.ArrayList;

public class OtherStudent {
	
	ArrayList<OtherStudent> otherStudents = new ArrayList<OtherStudent>();
	
	String name;
	int age;
	String studentNum;
	String major;
	

	public OtherStudent(String name, int age, String studentNum, String major) {
		this.name = name;
		this.age = age;
		this.studentNum = studentNum;
		this.major = major;
	}
	
	public void other(OtherStudent otherStudent) {
		otherStudents.add(otherStudent);
	}

}

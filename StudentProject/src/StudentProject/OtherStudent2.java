package StudentProject;

import java.util.ArrayList;

public class OtherStudent2 extends Student {
	
	public OtherStudent2(String name, int age, String studentNum, String major) {
		super(name, age, studentNum, major);
		super.students = new ArrayList<Student>();
	}
	

	public void other(Student student) {
		students.add(student);
	}

}

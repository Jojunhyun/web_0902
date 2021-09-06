package StudentProject;

public class StudentManage {
	
	public static void main(String[] args) {
		
		Student students = new Student("", 0, "", "");
		Student student;
		
		student = new Student("임영웅", 34, "20201234", "자바 웹프로그래밍");
		students.addstudent(student);
		System.out.println( student.name + student.age + student.studentNum + student.major + " 학생정보입력!!!");
		
		
		student = new Student("영탁", 39, "20201235", "컴퓨터 공학과");
		students.addstudent(student);
		System.out.println( student.name + student.age + student.studentNum + student.major + " 학생정보입력!!!");
		
		
		student = new Student("정동원", 22, "20201236", "정보보안");
		students.addstudent(student);
		System.out.println( student.name + student.age + student.studentNum + student.major + " 학생정보입력!!!");
		
		
		System.out.println(students.students.get(0).name);
		
		
		
		
	}

}

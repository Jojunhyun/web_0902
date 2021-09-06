package StudentProject;

public class Studentmanage2 {
	
	

	public static void main(String[] args) {
		
		Student student = new Student("", 0, "", "");
		
		 
		student.addstudent(new Student("임영웅", 34, "20201234", "자바 웹프로그래밍"));
		System.out.println( student.students.get(0).name + " 학생정보입력!!!");
		
		
		
		student.addstudent(new Student("영탁", 39, "20201235", "컴퓨터 공학과"));
		System.out.println( student.name + student.age + student.studentNum + student.major + " 학생정보입력!!!");
		
		
		student.addstudent(new Student("정동원", 22, "20201236", "정보보안"));
		System.out.println( student.name + student.age + student.studentNum + student.major + " 학생정보입력!!!");
		
		
		System.out.println(student.students.get(0).name);
		
		
		
		
	}

}

package StudentProject;

public class StudentManage {

	public static void main(String[] args) {
		
		Student student = new Student("", 0, "", "");
		OtherStudent otherStudent = new OtherStudent("", 0, "", "");
		
		 
		student.addstudent(new Student("임영웅", 34, "20201234", "자바 웹프로그래밍"));
		System.out.println( student.students.get(0).name + student.students.get(0).age + student.students.get(0).studentNum
				+ student.students.get(0).major + " 학생정보입력!!!");
		
		
		
		student.addstudent(new Student("영탁", 39, "20201235", "컴퓨터 공학과"));
		System.out.println( student.students.get(1).name + student.students.get(1).age + student.students.get(1).studentNum
				+ student.students.get(1).major + " 학생정보입력!!!");
		
		
		student.addstudent(new Student("정동원", 22, "20201236", "정보보안"));
		System.out.println( student.students.get(2).name + student.students.get(2).age + student.students.get(2).studentNum
				+ student.students.get(2).major + " 학생정보입력!!!");
		
		student.alter(new Student("이찬원", 26, "20201237", "드론 전문가 과정"));
		System.out.println(student.students.get(0).name + "학생정보 수정완료 !!!");
		
		otherStudent.other(new OtherStudent("이찬원", 26, "20201237", "드론 전문과 과정"));
		System.out.println(otherStudent.otherStudents.get(0).name + "휴학생 정보입력!!!");
		
		
		
	}

}

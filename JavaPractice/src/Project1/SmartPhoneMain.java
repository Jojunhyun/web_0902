package Project1;

import java.util.Scanner;

public class SmartPhoneMain {
	
	public static void main(String[] args) {

		SmartPhone phone = new SmartPhone();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("# 데이터 2개를 입력합니다.");
		
		for(int i = 0; i<2; i++) {
			phone.save(phone.input());
		}
		
		while(true) {
			
			phone.printMenu();	
			String no1 = scanner.next();
			
			if(no1.equals("1")) {
				phone.save(phone.input());
			} 
			else if(no1.equals("2")) {
				phone.printAll();
			}
			else if(no1.equals("3")) {
				System.out.print("검색하고 싶은 이름 입력 : "); 	 
				if(phone.search(scanner.next())) {
					System.out.println("일치하는 연락처가 없습니다.");
				}
			}
			else if(no1.equals("4")) {
				phone.printAll();
				System.out.print("삭제하고 싶은 이름 입력 : ");	
				phone.delete(scanner.next());
			} 
			else if(no1.equals("5")) {
				phone.printAll();
				System.out.print("수정하고 싶은 이름 입력 : ");		String name = scanner.next();
				phone.alter(phone.input(), name);
			} 
			else if(no1.equals("6")) {
				System.out.print(" 사용을 종료합니다. ");
				break;
			} 
			else {
				System.out.println("알 수 없는 번호입니다.");
			}
			
		}
		
	}

}
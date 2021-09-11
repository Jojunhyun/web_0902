package Project1;

import java.util.Scanner;

public class SmartPhoneMain {
	
	public static void main(String[] args) {

		SmartPhone phone = new SmartPhone();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("# 데이터 2개를 입력합니다.");
		
		
			phone.save(phone.inputCompany());
			phone.save(phone.inputCustomer());
		
		while(true) {
			
			phone.printMenu();	
			String no1 = scanner.next();
			
			if(no1.equals("1")) {
				phone.save(phone.inputCompany());
			} 

			else if(no1.equals("2")) {
				phone.save(phone.inputCustomer());
			} 
			
			else if(no1.equals("3")) {
				phone.printAll();
			}
			
			else if(no1.equals("4")) {
				System.out.print("검색하고 싶은 이름 입력 : "); 	 
				if(phone.search(scanner.next())) {
					System.out.println("일치하는 연락처가 없습니다.");
				}
			}
			
			else if(no1.equals("5")) {
				phone.printAll();
				System.out.print("삭제하고 싶은 이름 입력 : ");	
				if(phone.delete(scanner.next())) {
					System.out.println("");
					System.out.println("일치하는 이름이 없습니다.");
				}
			} 
			
			else if(no1.equals("6")) {
				phone.printAll();
				System.out.print("수정하고 싶은 이름 입력 : ");	
				if(phone.alter(scanner.next())) {
					System.out.println("");
					System.out.println("일치하는 이름이 없습니다.");
				}
			} 
			
			else if(no1.equals("7")) {
				System.out.print(" 사용을 종료합니다. ");
				break;
			} 
			
			else {
				System.out.println("알 수 없는 번호입니다.");
			}
			
		}
		
	}

}

package CompanyProject;

import java.util.Scanner;

public class SmartPhoneMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		SmartPhone phone = new SmartPhone();
		
		
		phone.saveCompany(phone.input());
		
		phone.saveCustomer(phone.input());
		
		while(true) {
			
			
			phone.printMenu();
			int no1 = scanner.nextInt();
			if(no1 == 1) {
				phone.saveCompany(phone.input());
			}
			
			else if(no1 == 2) {
				phone.saveCustomer(phone.input());
			}
			
			else if( no1 == 3 ) {
				
				phone.allprint();
				
			}
			else if( no1 == 4 ) {
				System.out.println("검색할 이름 : ");
				if(phone.search(scanner.next())) {
					System.out.println("검색 실패");
				}
					
				
				
			}
			
			else if( no1 == 5 ) {
				System.out.println("삭제할 이름 : ");
				if(phone.delete(scanner.next())) {
					System.out.println("삭제 실패");
				}
			}
			else if( no1 == 6 ) {
				
				phone.allprint();
				System.out.println("수정할 번호 입력 : ");		int no2 = scanner.nextInt();
				if(no2>0 && no2<=phone.c) {
					if(phone.contact[no2-1] instanceof CompanyContact)
						phone.alterCampany(phone.input(), no2-1);
					else 
						phone.alterCustomer(phone.input(), no2-1);
					
				}
				else {
					System.out.println("올바르지 않은 번호입니다.");
				}
				
			}
			else if( no1 == 7 ) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("알 수 없는 번호 입니다.");
				
			}
			
		}
	
		
	}
	
	
	

}

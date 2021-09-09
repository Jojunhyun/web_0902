package SmartphoneProject;

import java.util.Scanner;

public class SmartPhoneMain {
	
	
	static Scanner scanner = new Scanner(System.in);
	static SmartPhone phone = new SmartPhone();
	
	
	public static Contact input() {
		
		System.out.print("이름 : ");			String name = scanner.next();
		System.out.print("전화번호 : ");		String pnumber = scanner.next();
		System.out.print("이메일 : ");			String email = scanner.next();	
		System.out.print("주소 : ");			String adress = scanner.next();
		System.out.print("생일 : ");			String birth = scanner.next();
		System.out.print("그룹 : ");			String group = scanner.next();
		Contact contact = new Contact(name , pnumber, email, adress, birth, group);
		return contact;
		
		}
	
	
	public static void main(String[] args) {
		
		
		phone.save(input());
		
	
		phone.save(input());
		
		while(true) {
			
			
			System.out.println("contact-------------------------------------");
			System.out.println(">> 1.연락처 등록"); 
			System.out.println(">> 2.모든 연락처 출력");
			System.out.println(">> 3.연락처 검색");
			System.out.println(">> 4.연락처 삭제");
			System.out.println(">> 5.연락처 수정");
			System.out.println(">> 6.프로그램 종료");
			System.out.println("--------------------------------------------");
			int no1 = scanner.nextInt();
			if(no1 == 1) {
				phone.save(input());
			}
			else if( no1 == 2 ) {
				
				phone.allprint();
				
			}
			else if( no1 == 3 ) {
				System.out.println("검색할 이름 : ");
				if(phone.search(scanner.next())) {
					System.out.println("검색 실패");
				}
					
				
				
			}
			
			else if( no1 == 4 ) {
				System.out.println("삭제할 이름 : ");
				if(phone.delete(scanner.next())) {
					System.out.println("삭제 실패");
				}
			}
			else if( no1 == 5 ) {
				
				phone.allprint();
				System.out.println("수정할 번호 입력 : ");		int no2 = scanner.nextInt();
				if(no2>0 && no2<=phone.c) {
					phone.alter(input(), no2-1);
				}
				else {
					System.out.println("올바르지 않은 번호입니다.");
				}
				
			}
			else if( no1 == 6 ) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("알 수 없는 번호 입니다.");
				
			}
			
		}
		
		
	}
	
	
	

}

package SmartphoneProject;

import java.util.Scanner;


public class SmartPhoneMain {
	
	public static void main(String[] args) {
		
		
		int c = 0;
		
		Scanner scanner = new Scanner(System.in);
		SmartPhone phone = new SmartPhone();
		
		while(true) {
			
			
			System.out.println("-------------------------------------");
			System.out.println("1연락처 등록 2.연락처 수정"); int no1 = scanner.nextInt();
			
				if(no1 == 1) {
					System.out.print("이름 : ");			String name = scanner.next();
					System.out.print("번호 : ");		String pnumber = scanner.next();
					System.out.print("메일 : ");		String email = scanner.next();
					System.out.print("주소 : ");			String adress = scanner.next();
					System.out.print("생일 : ");			String birth = scanner.next();
					System.out.print("그룹 : ");			String group = scanner.next();
					phone.save(name , pnumber, email, adress, birth, group);
					
				
					
					
				}
				else if( no1 == 2 ) {
					
					
					System.out.println();
					
				}
				else {
					System.out.println("알 수 없는 번호 입니다..");
					return;
				}
			
		}
		
		
	}
	

}

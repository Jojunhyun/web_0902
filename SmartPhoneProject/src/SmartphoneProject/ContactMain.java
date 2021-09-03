package SmartphoneProject;

import java.util.Scanner;


public class ContactMain {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
			
		Contact contact = new Contact();
					
					System.out.print("이름 : ");			String name = scanner.next();
					System.out.print("번호 : ");			String pnumber = scanner.next();
					System.out.print("메일 : ");			String email = scanner.next();
					System.out.print("주소 : ");			String adress = scanner.next();
					System.out.print("생일 : ");			String birth = scanner.next();
					System.out.print("그룹 : ");			String group = scanner.next();
					
					contact.setName(name);
					contact.setPnumber(pnumber);
					contact.setEmail(email);
					contact.setAdress(adress);
					contact.setBirth(birth);
					contact.setGroup(group);
					
					System.out.println("-------------------------------------");
					System.out.println("연락처 수정완료");
					System.out.println("-------------------------------------");
					contact.setGroup("가족");
					contact.print();
					
		
	}
	

}

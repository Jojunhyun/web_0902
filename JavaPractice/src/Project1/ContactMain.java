package Project1;

import java.util.Scanner;

public class ContactMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 : " );		String name = scanner.nextLine();
		System.out.print("전화번호 : " );	String pnumber = scanner.nextLine();
		System.out.print("이메일 : " );	String email = scanner.nextLine();
		System.out.print("주소 : " );		String adress = scanner.nextLine();
		System.out.print("생일 : " );		String birth = scanner.nextLine();
		System.out.print("그룹 : " );		String group = scanner.nextLine();
		
		Contact contact = new Contact(name, pnumber, email, adress, birth, group);
		
		contact.print();
		
		System.out.println("그룹 정보 변경");
		System.out.println("---------------------------------");
		
		contact.setGroup("가족");
		contact.print();
		
		
	}

}

package Project1;

import java.util.Scanner;

public class SmartPhone {
	
	Contact[] contacts;
	int c = 0;
	Scanner in;
	
	public SmartPhone() {
		contacts = new Contact[5];
		in = new Scanner(System.in);
	}
	
	public Contact input() {
		
		System.out.print("이름 : " );		String name = in.nextLine();
		System.out.print("전화번호 : " );	String pnumber = in.nextLine();
		System.out.print("이메일 : " );	String email = in.nextLine();
		System.out.print("주소 : " );		String adress = in.nextLine();
		System.out.print("생일 : " );		String birth = in.nextLine();
		System.out.print("그룹 : " );		String group = in.nextLine();
		
		Contact contact = new Contact(name, pnumber, email, adress, birth, group);
		return contact;
		
	}
	
	public void save(Contact contact) {
		contacts[c] = contact;
		System.out.println(">>> 데이터가 저장되었습니다. (" + (c+1) + ")" );
		c++;
	}
	
	public void printMenu() {
		System.out.println("Contact-------------------------");
		System.out.println(">> 1. 연락처 등록");
		System.out.println(">> 2. 모든 연락처 출력");
		System.out.println(">> 3. 연락처 검색");
		System.out.println(">> 4. 연락처 삭제");
		System.out.println(">> 5. 연락처 수정");
		System.out.println(">> 6. 프로그램 종료");
		System.out.println("--------------------------------");
	}
	
	public boolean search(String name) {
		boolean check = true;
		for(int i = 0; i < c; i++) {
			if(contacts[i].getName().contentEquals(name)) {
				contacts[i].print();
				check = false;
			} 
		}
		return check;
	}
	
	public void alter(Contact contact, String string) {
			for(int i = 0; i < c; i++) {
				if(contacts[i].getName().equals(string)){
					contacts[i] = contact;					
				}
				else {
					System.out.println("존재하지 않는 이름입니다.");
				}
			}
		}
	
	
	public boolean delete(String string) {
		boolean check = true;
		for(int i = 0; i < c; i++) {
			if(contacts[i].getName().equals(string)) {
				for(int j = i; j < c; j++) {
					if(j == c-1) {
						contacts[c] = new Contact();
						check = false;
						c--;
						break;
					}
					contacts[j] = contacts[j+1];
				}
				System.out.println("삭제가 완료되었습니다.");
			}
		}
		return check;
	}
	
	public void printAll() {
		for(int i = 0; i < c; i++) {
			System.out.println("("+(i+1)+")");
			contacts[i].print();
		}
	}

}

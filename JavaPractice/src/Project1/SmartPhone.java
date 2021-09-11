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
	
	public CompanyContact inputCompany() {
		
		System.out.print("이름 : " );		String name = in.nextLine();
		System.out.print("전화번호 : " );	String pnumber = in.nextLine();
		System.out.print("이메일 : " );	String email = in.nextLine();
		System.out.print("주소 : " );		String adress = in.nextLine();
		System.out.print("생일 : " );		String birth = in.nextLine();
		System.out.print("그룹 : " );		String group = in.nextLine();
		System.out.print("회사이름 : " );	String companyName = in.nextLine();
		System.out.print("부서이름 : " );	String deportmant = in.nextLine();
		System.out.print("직급 : " );		String rank = in.nextLine();
		
		CompanyContact companyContact = new CompanyContact(name, pnumber, email, adress, birth, group, companyName, deportmant, rank);
		return companyContact;
		
	}
	
	public CustomerContact inputCustomer() {
		
		System.out.print("이름 : " );		String name = in.nextLine();
		System.out.print("전화번호 : " );	String pnumber = in.nextLine();
		System.out.print("이메일 : " );	String email = in.nextLine();
		System.out.print("주소 : " );		String adress = in.nextLine();
		System.out.print("생일 : " );		String birth = in.nextLine();
		System.out.print("그룹 : " );		String group = in.nextLine();
		System.out.print("거래처이름 : " );	String customerName = in.nextLine();
		System.out.print("거래품목 : " );	String item = in.nextLine();
		System.out.print("직급 : " );		String rank = in.nextLine();
		
		CustomerContact customerContact = new CustomerContact(name, pnumber, email, adress, birth, group, customerName, item, rank);
		return customerContact;
		
	}
	
	public void save(Contact contact) {
		contacts[c] = contact;
		System.out.println(">>> 데이터가 저장되었습니다. (" + (c+1) + ")" );
		c++;
	}
	
	public void printMenu() {
		System.out.println();
		System.out.println("Contact-------------------------");
		System.out.println(">> 1. 연락처 등록(회사)");
		System.out.println(">> 2. 연락처 등록(거래처)");
		System.out.println(">> 3. 모든 연락처 출력");
		System.out.println(">> 4. 연락처 검색");
		System.out.println(">> 5. 연락처 삭제");
		System.out.println(">> 6. 연락처 수정");
		System.out.println(">> 7. 프로그램 종료");
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
	
	public void alter(String string) {
			for(int i = 0; i < c; i++) {
				if(contacts[i].getName().equals(string)){
					if(contacts[i] instanceof CompanyContact) {
						contacts[i] = inputCompany();
					}
					else if(contacts[i] instanceof CustomerContact) {
						contacts[i] = inputCustomer();
					}
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
			System.out.println();
			System.out.println("---------------------------------");
			contacts[i].print();
			System.out.println("---------------------------------");
		}
	}
	
}


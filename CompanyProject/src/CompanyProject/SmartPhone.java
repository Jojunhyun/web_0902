package CompanyProject;

import java.util.Scanner;

public class SmartPhone {
	
	Contact[] contact;
	int c = 0;
	Scanner in;
	
	public SmartPhone() {
		this.contact = new Contact[10];
		in = new Scanner(System.in);
	}
	

	public Contact input() {
		
		System.out.print("이름 : ");			String name = in.next();
		System.out.print("전화번호 : ");		String pnumber = in.next();
		System.out.print("이메일 : ");			String email = in.next();	
		System.out.print("주소 : ");			String adress = in.next();
		System.out.print("생일 : ");			String birth = in.next();
		System.out.print("그룹 : ");			String group = in.next();
		
		return new Contact(name , pnumber, email, adress, birth, group);
		
	}
	
	public void saveCompany(Contact contact) {
		System.out.print("회사이름 : ");		String companyName = in.next();
		System.out.print("부서 : ");			String department = in.next();
		System.out.print("직급 : ");			String rank = in.next();
		
		this.contact[c] = new CompanyContact(contact , companyName, department, rank);
		System.out.println(">>> 데이터가 저장되었습니다 (" + (c+1) + ")");
		c++;
	}
	
	public void saveCustomer(Contact contact) {
		System.out.print("회사이름 : ");		String customerName = in.next();
		System.out.print("부서 : ");			String item = in.next();
		System.out.print("직급 : ");			String rank = in.next();
		
		this.contact[c] = new CustomerContact(contact, customerName, item, rank);
		System.out.println(">>> 데이터가 저장되었습니다 (" + (c+1) + ")");
		c++;
	}
	
	public void printMenu() {
		
		System.out.println("contact-------------------------------------");
		System.out.println(">> 1.연락처 등록(회사)");
		System.out.println(">> 2.연락처 등록(거래처)"); 
		System.out.println(">> 3.모든 연락처 출력");
		System.out.println(">> 4.연락처 검색");
		System.out.println(">> 5.연락처 삭제");
		System.out.println(">> 6.연락처 수정");
		System.out.println(">> 7.프로그램 종료");
		System.out.println("--------------------------------------------");
		
	}
	

	public void alterCampany(Contact contact , int num) {
		System.out.print("회사이름 : ");		String companyName = in.next();
		System.out.print("부서 : ");			String department = in.next();
		System.out.print("직급 : ");			String rank = in.next();
		
		this.contact[num] = new CompanyContact(contact , companyName, department, rank);
		System.out.println(">>> 데이터가 수정되었습니다 (" + (num+1) + ")");
	}
	
	public void alterCustomer(Contact contact , int num) {
		System.out.print("회사이름 : ");		String customerName = in.next();
		System.out.print("부서 : ");			String item = in.next();
		System.out.print("직급 : ");			String rank = in.next();
		
		this.contact[num] = new CustomerContact(contact, customerName, item, rank);
		System.out.println(">>> 데이터가 수정되었습니다 (" + (num+1) + ")");
	}
	
	public boolean delete(String name) {
		boolean check = true;
		for ( int i = 0; i < c ; i++ ) {
			if(contact[i].getName().equals(name) ) {
				for( int j = i; j < c ; j++ ) {					
					if (j == c-1) {
						contact[c] = new Contact();
						check = false;
						c--;
						break;
					}
					contact[j] = contact[j+1];
				}	
			}
		}
		return check;
	}
	
	public boolean search(String name) {
		boolean check = true;
		for( int i = 0; i < c; i++) {
			if(contact[i].getName().contentEquals(name)) {				
				contact[i].print();
				check = false;
			}
		}
		return check;
	}
	
	public void allprint() {
		
		for ( int i = 0; i < c ; i++ ) {
			System.out.println(i+1);
			contact[i].print();			
			
		}
		
	}


	
}

package com.smartphoneproject02;

import java.util.Scanner;

public class SmartPhone {
	Contact[] contacts;
	int countOfContact = 0;
	Scanner in;
	
	public SmartPhone() {
		this.contacts = new Contact[10];
		in = new Scanner(System.in);
	}
	
	public Contact inputContactData(int type) {
		
		System.out.println("이름 입력 : ");	
		String name = in.nextLine();
		System.out.println("전화번호 입력 : ");	
		String pnomber = in.nextLine();
		System.out.println("이메일 입력 : ");	
		String email = in.nextLine();
		System.out.println("주소 입력 : ");	
		String address = in.nextLine();
		System.out.println("생일 입력 : ");	
		String birth = in.nextLine();
		System.out.println("그룹 입력 : ");	
		String group = in.nextLine();
		
		Contact contact = null;
		
		if(type == 1) {
			
			System.out.println("회사이름 입력 : ");
			String company = in.nextLine();
			System.out.println("부서 입력 : ");
			String depart = in.nextLine();
			System.out.println("직급 입력 : ");
			String job = in.nextLine();
			
			contact = new CompanyContact(name, pnomber, email, address, birth, group, company, depart, job);
			
		}
			
		else if(type == 2) {
			
			System.out.println("거래처이름 입력 : ");
			String company = in.nextLine();
			System.out.println("거래품목 입력 : ");
			String product = in.nextLine();
			System.out.println("직급 입력 : ");
			String job = in.nextLine();
			
			contact = new CustomerContact(name, pnomber, email, address, birth, group, company, product, job);
	
		}
		return contact;
	}
	
	public void addContact(Contact contact) {
		contacts[countOfContact] = contact;
		countOfContact++;
		System.out.println("연락처 추가 완료 되었습니다.");
	}
	
	public void printContact(Contact contact) {
		contact.printInfo();
	}
	
	public void printAllCotact() {
		for(int i = 0; i < countOfContact; i++) {
			contacts[i].printInfo();
		}
	}
	
	public Contact searchContact(String name) {
		for(int i = 0; i < countOfContact; i++) {
			Contact contact = contacts[i];
			if(contact.getName().contentEquals(name)) {
				return contact;
			}
		}
		System.out.println("검색결과가 없습니다.");
		return null;
	}
	
	public void deleteContact(String name) {
		for(int i = 0; i < countOfContact; i++) {
			if(contacts[i].getName().contentEquals(name)) {
				for(int j = i; j < countOfContact; j++) {
					contacts[j] = contacts[j+1];
				}
				countOfContact--;
				return;
			}
		}
		System.out.println("존재하지않는 연락처입니다.");
	}
	
	public void editContact(String name) {
		for(int i = 0; i < countOfContact; i++) {
			
		}
		System.out.println("존재하지않는 연락처입니다.");
	}
	
	
}

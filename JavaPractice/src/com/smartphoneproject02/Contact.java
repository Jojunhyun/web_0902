package com.smartphoneproject02;

public class Contact {
	
	private String name;
	private String pnomber;
	private String email;
	private String address;
	private String birth;
	private String group;
	
	public Contact(String name, String pnomber, String email, String address, String birth, String group) {
		this.name = name;
		this.pnomber = pnomber;
		this.email = email;
		this.address = address;
		this.birth = birth;
		this.group = group;
	}
	
	public Contact() {
		
	}

	public void printInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.pnomber);
		System.out.println("이메일 : " + this.email);
		System.out.println("주소 : " + this.address);
		System.out.println("생일 : " + this.birth);
		System.out.println("그룹 : " + this.group);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPnomber() {
		return pnomber;
	}

	public void setPnomber(String pnomber) {
		this.pnomber = pnomber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	
	

}

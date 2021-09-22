package com.smartphoneproject02;

public class CompanyContact extends Contact {
	
	private String company;
	private String depart;
	private String job;
	
	public CompanyContact(String name, String pnomber, String email, String address, String birth, String group,
			String company, String depart, String job) {
		super(name, pnomber, email, address, birth, group);
		this.company = company;
		this.depart = depart;
		this.job = job;
	}
	
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("회사이름 : " + this.company);
		System.out.println("부서 : " + this.depart);
		System.out.println("직급 : " + this.job);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
	
}


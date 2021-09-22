package com.smartphoneproject02;

public class CustomerContact extends Contact {
	
	private String company;
	private String product;
	private String job;
	
	
	public CustomerContact(String name, String pnomber, String email, String address, String birth, String group,
			String company, String product, String job) {
		super(name, pnomber, email, address, birth, group);
		this.company = company;
		this.product = product;
		this.job = job;
	}
	
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("거래처이름 : " + this.company);
		System.out.println("거래품목 : " + this.product);
		System.out.println("직급 : " + this.job);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
		
	

}

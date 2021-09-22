package SmartPhoneProject01;

public class CompanyContact extends Contact {
	
	private String company;
	private String depart;
	private String job;
	
	
	public CompanyContact(String name, String pnomber, String email, String address, String birthday, String group) {
		super(name, pnomber, email, address, birthday, group);
	}


	public CompanyContact(String name, String pnomber, String email, String address, String birthday, String group,
			String company, String depart, String job) {
		super(name, pnomber, email, address, birthday, group);
		this.company = company;
		this.depart = depart;
		this.job = job;
	}
	
	@Override
	public void printinfo() {
		super.printinfo();
		System.out.println("회사이름 : " + this.company);
		System.out.println("부서이름 : " + this.depart);
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

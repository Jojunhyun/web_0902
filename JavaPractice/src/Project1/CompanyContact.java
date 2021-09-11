package Project1;

public class CompanyContact extends Contact{
	
	private String companyName;
	private String department;
	private String rank;
	
	public CompanyContact() {
		
	}
	
	public CompanyContact(String name, String pnumber, String email, String adress, String birth, String group,
			String companyName, String department, String rank) {
		super(name, pnumber, email, adress, birth, group);
		this.companyName = companyName;
		this.department = department;
		this.rank = rank;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("회사이름 : " + this.companyName);
		System.out.println("부서이름 : " + this.department);
		System.out.println("직급 : " + this.rank);
	}
	


	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
	

}

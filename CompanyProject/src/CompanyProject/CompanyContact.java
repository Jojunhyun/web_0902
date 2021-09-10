package CompanyProject;

public class CompanyContact extends Contact {
	
	private String companyName;
	private String department;
	private String rank;
	
	@Override
	public void print() {
		super.print();
		System.out.println("회사이름 : " + this.companyName);
		System.out.println("부서 : " + this.department);
		System.out.println("직급 : " + this.rank);
		System.out.println("-------------------------------------");	
	}
	
	public CompanyContact(Contact contact, String companyName, String department, String rank) {
		super(contact.getName(), contact.getPnumber(), contact.getEmail(), contact.getAdress(), contact.getBirth(), contact.getGroup());
		this.companyName = companyName;
		this.department = department;
		this.rank = rank;
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

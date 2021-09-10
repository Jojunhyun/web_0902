package CompanyProject;

public class CustomerContact extends Contact{
	
	private String customerName;
	private String item;
	private String rank;
	
	@Override
	public void print() {
		super.print();
		System.out.println("거래처 이름 : " + this.customerName);
		System.out.println("거래품목 : " + this.item);
		System.out.println("직급 : " + this.rank);
	}
	
	
	public CustomerContact(Contact contact, String customerName, String item, String rank) {
		super(contact.getName(), contact.getPnumber(), contact.getEmail(), contact.getAdress(), contact.getBirth(), contact.getGroup());
		this.customerName = customerName;
		this.item = item;
		this.rank = rank;
	}


	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
	
}

package Project1;

public class CustomerContact extends Contact {
	
	private String customerName;
	private String item;
	private String rank;
	
	public CustomerContact() {
		
	}
	
	public CustomerContact(String name, String pnumber, String email, String adress, 
			String birth, String group, String customerName, String item, String rank) {
		super(name, pnumber, email, adress, birth, group);
		this.customerName = customerName;
		this.item = item;
		this.rank = rank;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("거래처 이름 : " + this.customerName);
		System.out.println("거래품목 : " + this.item);
		System.out.println("직급 : " + this.rank);
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

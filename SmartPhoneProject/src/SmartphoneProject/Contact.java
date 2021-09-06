package SmartphoneProject;

public class Contact {
	
	
	
	String name;
	String pnumber;
	String email;
	String adress;
	String birth;
	String group;
	
	
	public void print() {
		
		System.out.println(" 이름 : " + this.name );			
		System.out.println(" 번호 : " + this.pnumber );		
		System.out.println(" 메일 : " + this.email );		
		System.out.println(" 주소 : " + this.adress );			
		System.out.println(" 생일 : " + this.birth );			
		System.out.println(" 그룹 : " + this.group );	
		System.out.println("-------------------------------------");
		
	}
	
	
	public Contact(String name, String pnumber, String email, String adress, String birth, String group) {
		super();
		this.name = name;
		this.pnumber = pnumber;
		this.email = email;
		this.adress = adress;
		this.birth = birth;
		this.group = group;
	}
	
	
	public Contact() {
        super();
        this.name = "";
        this.pnumber = "";
        this.email = "";
        this.adress = "";
        this.birth = "";
        this.group = "";
    }
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPnumber() {
		return pnumber;
	}
	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
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

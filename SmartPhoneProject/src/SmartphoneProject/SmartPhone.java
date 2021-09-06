package SmartphoneProject;

public class SmartPhone {
	
	Contact[] contact = new Contact[5];
	int c = 0;
	
	public void save(String name, String pnumber, String email, String adress, String birth, String group) {
		
		contact[c].setName(name);
		contact[c].setPnumber(pnumber);
		contact[c].setEmail(email);
		contact[c].setAdress(adress);
		contact[c].setBirth(birth);
		contact[c].setGroup(group);
		c++;
	}

	public void alter(String name, String pnumber, String email, String adress, String birth, String group) {
		
	}
	
	public void delete(String name) {
		
		
		for ( int i = 0; i < c ; i++ ) {
			
			if(contact[i].getName().equals(name) ) {
				for( int j = i; j < c ; j++ ) {
					contact[j] = contact[j+1];
					if (j == c-1) {
						contact[c] = new Contact();
					}
				}
			c--;
			}
		}	
		
		
		
		
	}
	
	public void print(String name, String pnumber, String email, String adress, String birth, String group) {
		
		for ( int i = 0; i < c ; i++ ) {
			
			System.out.println(" 이름 : " + contact[i].getName() );			
			System.out.println(" 번호 : " + contact[i].getPnumber() );		
			System.out.println(" 메일 : " + contact[i].getEmail() );		
			System.out.println(" 주소 : " + contact[i].getAdress() );			
			System.out.println(" 생일 : " + contact[i].getBirth() );			
			System.out.println(" 그룹 : " + contact[i].getGroup() );	
			System.out.println("-------------------------------------");
		}
		
	}
	
}

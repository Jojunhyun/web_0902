package SmartphoneProject;

public class SmartPhone {
	
	Contact[] contact = new Contact[5];
	int c = 0;
	
	public void save(Contact tempcontact) {
		contact[c] = tempcontact ;
		System.out.println(">>> 데이터가 저장되었습니다  ("+(c+1)+")");
		c++;
	}

	public void alter(Contact contact , int num) {
		this.contact[num] = contact;
		System.out.println(">>> 데이터가 수정되었습니다  ("+(num+1)+")");
	}
	
	public boolean delete(String name) {
		boolean check = true;
		for ( int i = 0; i < c ; i++ ) {
			if(contact[i].getName().equals(name) ) {
				for( int j = i; j < c ; j++ ) {					
					if (j == c-1) {
						contact[c] = new Contact();
						check = false;
						c--;
						break;
					}
					contact[j] = contact[j+1];
				}	
			}
		}
		return check;
	}
	
	public boolean search(String name) {
		boolean check = true;
		for( int i = 0; i < c; i++) {
			if(contact[i].getName().contentEquals(name)) {				
				contact[i].print();
				check = false;
			}
		}
		return check;
	}
	
	public void allprint() {
		
		for ( int i = 0; i < c ; i++ ) {
			System.out.println(i+1);
			contact[i].print();			
			
		}
		
	}
	
}

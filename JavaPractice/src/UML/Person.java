package UML;

import java.util.Vector;

public class Person {
	
	private Vector<Phone> phones;
	
	private Phone homePhones;
	
	private Phone officePhone;
	
	public Vector<Phone> getPhones() {
		return phones;
	}
	
	public void addPhone(Phone phone) {
		phones.add(phone);
	}
	
	public Phone getHomePhones() {
		return homePhones;
	}
	
	public void setHomePhones(Phone homePhones) {
		this.homePhones = homePhones;
	}
	
	public Phone getOfficePhone() {
		return officePhone;
	}
	
	public void setOfficePhone(Phone officePhone) {
		this.officePhone = officePhone;
	}
	
	
	
}
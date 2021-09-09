package Abstract;

public class Dog extends Animal {
	
	public Dog() {
		this.kild = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}

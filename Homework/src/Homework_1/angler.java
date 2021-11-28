package Homework_1;

public class angler {
	int a;
	int  b;
	
	
	public void up() {
		a--;
	}
	public void left() {
		b--;
	}
	public void right() {
		b++;
	}
	public void down() {
		a++;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
}

package Polymorphism_2;

public class ChildExample {
	
	public static void main(String[] args) {
		
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 * parent.field2 = "data2"; //불가능
		 * parent.method3();		//불가능
		 */
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
		
		child.field1 = "data1";
		child.method1();
		child.method2();
		
	}

}

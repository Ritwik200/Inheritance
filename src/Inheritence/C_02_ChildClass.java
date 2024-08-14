package Inheritence;

public class C_02_ChildClass extends C_01_BaseClass{
	
	public void mul() {
		System.out.println("Multiplication is 250");
	}
	public void div() {
		System.out.println("Division is 100");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_02_ChildClass ob = new C_02_ChildClass();
		
		ob.add();
		ob.subs();
		ob.mul();
		ob.div();
		System.out.println("===================");
		C_01_BaseClass ob1 = new C_01_BaseClass();
		
		ob1.add();
		ob1.subs();

	}

}

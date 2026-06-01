package multipleinheritance.Interface;

public class ChildClass implements FirstinterfaceClass, SecondInterfaceClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		obj.firstMethod();
		obj.secondMethod();
		obj.childMethod();
	}
	public void childMethod() {
		System.out.println("From Child Class");
	}

	@Override
	public void secondMethod() {
		// TODO Auto-generated method stub
		System.out.println("From Second Class");
		
	}

	@Override
	public void firstMethod() {
		// TODO Auto-generated method stub
		System.out.println("From Frist Class");
		
	}

}

package superKeyWordInheritance;

public class ChildClass extends ParentClass {
	
	int x = 5;
	public void displayMsg() {
		System.out.println("Message from Child Class Method");
		super.displayMsg();
	}
	public ChildClass() {
		super();
		System.out.println("Message from Child Class Contructor");
		
	}
	public void printX() {
		System.out.println("Child x :" +x);
		System.out.println("Parent x :" +super.x);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		obj.printX();
		obj.displayMsg();
		
	}

}

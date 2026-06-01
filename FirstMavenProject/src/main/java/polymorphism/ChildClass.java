package polymorphism;

public class ChildClass extends ParentClass {
	public void msgDisplay() {
		System.out.println("Have a great Day");
		super.msgDisplay();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChildClass obj = new ChildClass();
		//obj.msgDisplay();
		ParentClass obj1 = new ChildClass();
		obj1.msgDisplay();
		
		
		
	}

}

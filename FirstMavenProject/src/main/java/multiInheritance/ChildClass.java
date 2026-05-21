package multiInheritance;

public class ChildClass  extends ParentClass{
	
	public void msg1() {
		System.out.println("Have a good Day");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		obj.welcomeMsg();
		obj.todayMsg();
		obj.msg1();

	}

}

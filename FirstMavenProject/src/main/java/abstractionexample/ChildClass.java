package abstractionexample;

public class ChildClass extends AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		obj.msgDisp();
		obj.dispMsg();
		obj.sampleMethod();
		

	}

	@Override
	public void dispMsg() {
		// TODO Auto-generated method stub
		System.out.println("Overrided Method");
	}
	
	public void sampleMethod() {
		System.out.println("Normal method from Child");
	}

}

package abstractionexample;

public class InterfaceChildClass implements InterfaceAbstract{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceChildClass obj = new InterfaceChildClass();
		obj.childClassMsg();
		obj.displayMsg();

	}

	@Override
	public void displayMsg() {
		System.out.println("Msg from Overrride method");
		// TODO Auto-generated method stub
		
	}
	
	public void childClassMsg() {
		System.out.println("Msg from ChildClass");
	}

}

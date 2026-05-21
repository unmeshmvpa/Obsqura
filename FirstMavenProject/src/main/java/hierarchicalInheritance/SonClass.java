package hierarchicalInheritance;

public class SonClass extends ParentClass {
	public void sonMsg() {
		System.out.println("Msg from Son");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	SonClass obj = new SonClass();
	obj.msgParent();
	obj.sonMsg();

	}

}

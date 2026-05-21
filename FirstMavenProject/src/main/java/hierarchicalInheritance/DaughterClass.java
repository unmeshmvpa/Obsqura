package hierarchicalInheritance;

public class DaughterClass extends ParentClass {
	public void daughterMsg() {
		System.out.println("Msg from Daughter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaughterClass obj = new DaughterClass();
		obj.msgParent();
		obj.daughterMsg();

	}

}

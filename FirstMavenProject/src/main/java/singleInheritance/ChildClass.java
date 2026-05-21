package singleInheritance;

public class ChildClass  extends ParentClass{
	
	public void sumNos( int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj1 = new ChildClass();
		obj1.sumNos(5, 6);
		obj1.disp();
		

	}

}

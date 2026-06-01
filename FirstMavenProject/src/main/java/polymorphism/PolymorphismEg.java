package polymorphism;

public class PolymorphismEg {
	
	public void displayMsg() {
		System.out.println("Hello Wiorld");
	}
	public void displayMsg(int x,int y) {
		System.out.println(x+y);
	}

	public void displayMsg(String nam) {
		System.out.println(nam);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismEg obj = new PolymorphismEg();
		obj.displayMsg();
		obj.displayMsg(5, 6);
		obj.displayMsg("Unmesh");

	}

}

package aggregation;

public class StudentClass {
int p,q;
SchoolClass obj;
	public StudentClass(int p, int q, SchoolClass obj){
		this.p= p;
		this.q=q;
		this.obj = obj;
		
	}
	public void dispValues() {
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(p);
		System.out.println(q);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SchoolClass obj1 = new SchoolClass();
		obj1.dispSum(10, 20);
		StudentClass obj = new StudentClass(30,40,obj1);
		obj.dispValues();
	}

	
}

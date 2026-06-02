package excdeptionHandling;

public class ExcdeptionHandlingEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try {
	 int x ;
	 
	 x = 2/0;
	 System.out.println(x);
	 
 }
/* catch(ArithmeticException e) {
	 System.out.println("---------");
	 System.out.println(e);
	 
 }*/
 finally {
	 System.out.println("Msg from finally block");
 }
 
	}

}

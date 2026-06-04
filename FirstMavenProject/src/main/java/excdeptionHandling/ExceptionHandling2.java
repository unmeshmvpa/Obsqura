package excdeptionHandling;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[] = new int[3];
			arr[3] = 5;
	       int x = 3/0;
			
		}
	/*	catch(ArrayIndexOutOfBoundsException arrEx) {
			System.out.println("Invalid Array Index");
		}*/
		catch(ArithmeticException aEx) {
			System.out.println("Arithmetic Exception");
		}

		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}

package excdeptionHandling;

public class ThrowEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
		if (age>=18) {
			System.out.println("Eligible for voting");
				}
		else {
			throw new ArithmeticException("Invalid age");
		}

	}

}

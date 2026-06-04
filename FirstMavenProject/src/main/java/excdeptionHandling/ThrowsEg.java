package excdeptionHandling;

public class ThrowsEg {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age = 17;
		if (age>=18) {
			System.out.println("Eligible");
		}
		else {
			throw new VotingException("Not eligible");
		}

	}
	

}

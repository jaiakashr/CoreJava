package Day14;

public class InSufficientBalance extends Exception {
	double amount;
	
	public InSufficientBalance(double amt){
		amount = amt;
	}

}

package interfaceinjava;

public class Axis implements ReserveBank {

	public static void main(String[] args) {

	}

	public void rateOfInterestOfHomeLoan() {
		System.out.println("Axis rate of interest of home loan = " + 8.5);

	}

	@Override
	public void rateOfInterestOfCarLoan() {

		System.out.println("Axis rate of interest of car loan = " + 8.0);

	}

	@Override
	public void rateOfInterestOfFD(int duration) {

		System.out.println("Axis rate of interest of FD for duration " + duration + " days = " + 5.9);

	}

	public void personalLonaInterestRate() {
		System.out.println("Axis personal loan interest rate = " + 10);
	}

	@Override
	public void transactionCharges() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void currencyRateConversion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sampleMethod() {
		// TODO Auto-generated method stub
		
	}

}

package interfaceinjava;

public class SBI implements ReserveBank {

	public static void main(String[] args) {

//		ReserveBank obb = new ReserveBank();

		ReserveBank oo = new SBI();
		oo.rateOfInterestOfCarLoan();
		oo.rateOfInterestOfFD(66);
//		ReserveBank.sampleMethod();
//		ReserveBank.sampleDefaultMethod();
		oo.sampleDefaultMethod();
		oo.sampleMethod();
		

		SBI obj = new SBI();
//		obj.ab = 88;
		System.out.println(ReserveBank.ab);
		System.out.println(obj.ab);
		obj.rateOfInterestOfFD(56);

	}

	public void rateOfInterestOfHomeLoan() {
		System.out.println("SBI rate of interest of home loan = " + 7.5);

	}

	@Override
	public void rateOfInterestOfCarLoan() {

		System.out.println("SBI rate of interest of car loan = " + 7.0);

	}

	@Override
	public void rateOfInterestOfFD(int duration) {

		System.out.println("SBI rate of interest of FD for duration " + duration + " days = " + 5.6);

	}
	
	public void mortgageLoan()
	{
		System.out.println("SBI mortgage loan = " + 6.6);
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

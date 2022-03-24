package interfaceinjava;

public class Kotak extends Axis {
	
	public static void main(String[] args) {
		
		Kotak obj = new Kotak();
		obj.educationalLoan();
	
		
		
		ReserveBank rk = new Kotak();
		rk.rateOfInterestOfFD(55);
		rk.rateOfInterestOfCarLoan();
		
		Axis ak = new Kotak();
		ak.personalLonaInterestRate();
		ak.rateOfInterestOfHomeLoan();
		
		
	}
	
	public void educationalLoan()
	{
		System.out.println("Kotak educational loan = " + 4.4);
	}

}

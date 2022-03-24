 package interfaceinjava;

public interface ReserveBank extends IndianGovernour , WorldBank{

	public static final int ab = 46;

	abstract void rateOfInterestOfHomeLoan();

	public abstract void rateOfInterestOfCarLoan();

	public void rateOfInterestOfFD(int duration);
	
	/*
	 * public static void sampleMethod() {
	 * System.out.println("Possible in above java 1.8 version "); }
	 */
	
	public default void sampleDefaultMethod()
	{
		System.out.println("Sample default method");
	}

}

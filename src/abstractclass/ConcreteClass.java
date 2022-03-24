package abstractclass;

public class ConcreteClass extends ABClass{

	public static void main(String[] args) {
		
		AA ac = new ConcreteClass();
		ac.aASampleMethod();
		
		ABClass oo = new ConcreteClass();
		oo.addition();
		
		
		ConcreteClass obj = new ConcreteClass();
		obj.addition();
		obj.substraction();
		System.out.println(obj.ab);
		
	}

	@Override
	public void addition() {
		
		int c = ab + 67;
		System.out.println(c);
		System.out.println("implementation provided by concrete class");
		
	}
	
	public void division()
	{
		System.out.println("this is division method");
	}

	@Override
	public void aASampleMethod() {
		// TODO Auto-generated method stub
		System.out.println("implementation provided by concrete class");
		
	}

	@Override
	public void interfaceMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateOfInterestOfHomeLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateOfInterestOfCarLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateOfInterestOfFD(int duration) {
		// TODO Auto-generated method stub
		
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

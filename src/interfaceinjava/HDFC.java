package interfaceinjava;

public class HDFC implements IndianGovernour, WorldBank{
	
	public static void main(String[] args) {
		HDFC obj = new HDFC();
		obj.sampleMethod();
		
		IndianGovernour ih = new HDFC();
		ih.sampleMethod();
		
		WorldBank wh = new HDFC();
		wh.sampleMethod();
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
		System.out.println("Implementaion provided by HDFC");
		
	}

}

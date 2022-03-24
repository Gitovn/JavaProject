package finalkeyword;

public class AAFinalKeyword  {
	// if this class extends FinalClass then it gives error & tell to remove final modifier from FinalClass
	// so right now i removed it ( means Final modifier class cant extended by any classess)

	public static void main(String[] args) {
		
	//	FinalClass obj = new AAFinalKeyword();
//		obj.nonStaticMethod();

	}
	

//	public final void nonStaticMethod()
//	{
//		System.out.println("from final class");
//	}
	
	public final void nonStaticMethod11()
	{
		System.out.println("from aaafinal class");
	}
	
	
//	public static  void staticMethod()
//	{
//		System.out.println("from implemented final class");
//	}
	
	public static final void staticMethod11()
	{
		System.out.println("from final class");
	}

}

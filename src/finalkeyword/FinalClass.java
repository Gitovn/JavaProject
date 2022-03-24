package finalkeyword;

public final class FinalClass {
	
	final int abcd;
	final static int stpqrs = 94;
	
	public FinalClass()
	{
		this.abcd = 0;
//		abcd = 49;
	
	}
	
	public FinalClass(int a)
	{
		abcd = a;
	}
	

	public static void main(String[] args) {
		
		FinalClass obj = new FinalClass();
		FinalClass objj = new FinalClass(45);
//		obj.abcd =44;
//		FinalClass.stpqrs = 44;
//		obj.stpqrs = 99;
		
		System.out.println(obj.abcd);
	

	}
	
	public final void nonStaticMethod()
	{
		final int a = 44;
		System.out.println(a);
		System.out.println("from final class");
	}
	
	public  void nonStaticMethod11()
	{
		System.out.println("from final class");
	}
	
	public static final void staticMethod()
	{
		final int a = 44;
		System.out.println(a);
		System.out.println("from final class");
	}
	
	public static  void staticMethod11()
	{
		System.out.println("from final class");
	}

}

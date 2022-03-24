package thiskeyword;

public class MethodCall {
	
	int a ;
	
	public static void main(String[] args) {
		
		MethodCall obj = new MethodCall();
		MethodCall obj2 = new MethodCall();
		obj.a = 44;
		obj.sample1();
		obj2.sample2();
		
	}
	
	public void sample1()
	{
		System.out.println("Inside sample1");
		this.sample2();
		this.stMethod();
	}
	
	public void sample2()
	{
		System.out.println("Inside sample2");
		System.out.println(this.a);
		
	}
	
	public static void stMethod()
	{
		System.out.println("Inside static method");
//		this.sample2();
	}

}

package polymorphism;

public class MethodOverloading {
	
	int a;
	int b;

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.additon();
		obj.additon(22, 45.2f);
		obj.additon("HI", "Hello");
		
	}
	
	public void additon()
	{
		int c = a + b;
		System.out.println("addition is = " + c);
	}
	
	public void additon(int a, int b)
	{
		int c = a + b;
		System.out.println("addition is = " + c);
	}
	
	public void additon(int a, int b, int c)
	{
		int d = a + b + c;
		System.out.println("addition is = " + d);
	}
	

	public void additon(float a, int b)
	{
		float c = a + b;
		System.out.println("addition is = " + c);
	}
	

	public void additon(int a, float b)
	{
		float c = a + b;
		System.out.println("addition is = " + c);
	}
	

	public void additon(String a, String b)
	{
		String c = a + b;
		System.out.println("addition is = " + c);
	}
	
	public static void substraction(int a , int b)
	{
		int c = a - b;
		System.out.println("Substraction is = " + c);
	}
	
	public static void substraction(float a , int b, int d)
	{
		float c = a - b - d;
		System.out.println("Substraction is = " + c);
	}

}

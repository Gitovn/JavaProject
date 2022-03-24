package abstractclass;

public abstract class ABClass extends AA{
	
	int ab = 43;
	static int abcd = 98 ;
	
	public ABClass()
	{
		System.out.println("Inside abstract class constructor");
	}
	
	

	public static void main(String[] args) {
		
//		ABClass obj = new ABClass();
	

	}
	
	public  abstract void addition();
	
	public void substraction()
	{
		int c = 12 - 4;
		System.out.println(c);
	}
	
	public static void sampleStatic()
	{
		System.out.println("static method from abstract class");
	}
}

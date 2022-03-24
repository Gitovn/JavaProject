package superkeyword;

public class C extends B {

	int cc = 44;
	static int stC = 33;
 
	public C() {
		this('c');
		System.out.println("Inside C constructor");
	}
	
	public C(char b)
	{
		super();
		System.out.println("Inside C parameterized constructor");
	}

	
	
	public void ABC()
	{
		System.out.println("Method from C");
	}
	
	public static void m()
	{
		System.out.println("M from C");
	}
	
	public static void main(String[] args) {
		 C obj = new C();
		 obj.methodFromC();
		 obj.sampleFromC();

	}
	

	public void methodFromC() {
		System.out.println("Method From C");
		System.out.println(super.aa);
		System.out.println(super.bb);
		System.out.println(super.pqrs);
		System.out.println(super.stA);
		System.out.println(super.stB);
		System.out.println(this.aa);
	}
	

	public void sampleFromC() {
		System.out.println("Method From C");
		super.ABC();
		super.methodFromA();
		super.methodFromB();
		super.staticMethodFromA();
		super.staticMethodFromB();
		super.m();
		
	
	}


	public static void staticMethodFromC() {
		System.out.println("Static method from C");

	}

}

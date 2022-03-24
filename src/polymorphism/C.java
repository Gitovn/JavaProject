package polymorphism;

public class C extends B {

	int aa = 44;
	static int stC = 33;

	public C() {
		System.out.println("Inside C constructor");
	}

	public static void main(String[] args) {

		B ab = new C();
	
		 

	}
	
	public void ABC()
	{
		System.out.println("Method from C");
	}
	
	public void m()
	{
		System.out.println("M from C");
	}
	

	public void methodFromC() {
		System.out.println("Method From C");
	}

	public static void staticMethodFromC() {
		System.out.println("Static method from C");

	}

}

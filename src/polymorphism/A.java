package polymorphism;

public class A {

	int aa = 22;
	static int stA = 33;

	public A() {
		System.out.println("Inside A constructor");
	}

	public static void main(String[] args) {

	}
	
	public void ABC()
	{
		System.out.println("Method from A");
	}
	
	public void m()
	{
		System.out.println("M from A");
	}

	public void methodFromA() {
		System.out.println("Method From A");
	}

	public static void staticMethodFromA() {
		System.out.println("Static method from A");

	}

}

package polymorphism;

public class B extends A {

	int aa = 33;
	static int stB = 33;

	public B() {
		System.out.println("Inside B constructor");
	}

	public static void main(String[] args) {

	}
	
	public void ABC()
	{
		System.out.println("Method from B");
	}
	
	public void m()
	{
		System.out.println("M from B");
	}

	public void methodFromB() {
		System.out.println("Method From B");
	}

	public static void staticMethodFromB() {
		System.out.println("Static method from B");

	}

}

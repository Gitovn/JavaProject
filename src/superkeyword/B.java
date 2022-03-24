package superkeyword;

public class B extends A {

	int bb = 33;
	static int stB = 33;

	public B() {
		this("Hi");
		System.out.println("Inside B constructor");
	}
	
	public B(String f) {
		super(3);
		System.out.println("Inside B parameterized constructor");
	}

	public static void main(String[] args) {

	}
	
	public void ABC()
	{
		System.out.println("Method from B");
	}
	
	public static void m()
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

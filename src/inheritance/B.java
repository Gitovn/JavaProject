package inheritance;

public class B extends A {

	int bb = 33;
	static int stB = 33;

	public static void main(String[] args) {

		B ob = new B();

	}

	public void methodFromB() {
		System.out.println("Method From B");
	}

	public static void staticMethodFromB() {
		System.out.println("Static method from B");

	}

}

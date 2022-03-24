package inheritance;

public class C extends A {

	int cc = 44;
	static int stC = 33;

	public static void main(String[] args) {

		C oc = new C();

	}

	public void methodFromC() {
		System.out.println("Method From C");
	}

	public static void staticMethodFromC() {
		System.out.println("Static method from C");

	}

}

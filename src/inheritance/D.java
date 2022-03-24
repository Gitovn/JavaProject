package inheritance;

public class D extends B {

	int dd = 55;
	static int stD = 44;

	public static void main(String[] args) {

		D od = new D();

	}

	public void methodFromD() {
		System.out.println("Method From D");
	}

	public static void staticMethodFromD() {
		System.out.println("Static method from D");

	}

}

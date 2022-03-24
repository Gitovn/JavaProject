package method.with.parameter;

public class ParameterizedClass {
	int sam;

	public static void main(String[] args) {

		addition(23, 45.2f);
		substraction(2, 60);
		ParameterizedClass obj = new ParameterizedClass();
		obj.multiplication(25.6f, 41);
		obj.sam = 12;
		obj.division(obj.sam, 50);
		obj.division(10, 13);

	}

	public static void addition(int a, float b) {

		float c = a + b;
		System.out.println(c);
	}

	public static void substraction(int sam, int d) {
		float e = d - sam;
		System.out.println(e);
	}

	public void multiplication(float c, int d) {

		float f = d * c;
		int g = (int) f;
		System.out.println(g);
	}

	public void division(int c, int d) {
		float g = d / c;
		System.out.println(g);
	}

}

package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// Arithmetic Operators +, -, *, /, %

		int a = 65;
		int b = 30;
		float x = 45.30f;
		float y = 2.30f;
		float p = a;
		float q = b;

		// for calculating Simple Interest
		int Principal = 1000;
		int Rate = 5;
		int Time = 3;

		int SI = (Principal * Rate * Time) / 100;
		System.out.println(SI);

		// for percentage = result we get is reminder
		float h = x % y;
		System.out.println(h);

		int g = 10 % 3;
		System.out.println(g);

		// for division = we get quotient as result

		float r = p / q;
		System.out.println(r);

		float kk = 55 / 23.1f;
		System.out.println(kk);

		float k = a / b;
		System.out.println(k);

		float zz = y / b;
		System.out.println(zz);

		float z = x / y;
		System.out.println(z);

		// to get float result in integer value casting is used

		int pqr = (int) z;
		System.out.println(pqr);

		int f = a / b;
		System.out.println(f);

		// for multiplication

		int e = a * b;
		int ee = 3 * 5;
		System.out.println(e);
		System.out.println(ee);

		// for subtraction

		int d = a - b;
		System.out.println(d);

		// for addition

		int c = a + b;
		int cc = 54 + 86;
		int ccc = a + 54;
		System.out.println(cc);
		System.out.println(c);
		System.out.println(ccc);

		// for string datatype it will do concatination

		String data = "Hi" + "Hello" + 34 + 55;
		System.out.println(data);

		System.out.println(a + b);
		System.out.println(a + b + data);
		System.out.println(data + a + b);
		System.out.println(data + (a + b));

		String str = "" + a + b;
		System.out.println(str);

	}

}

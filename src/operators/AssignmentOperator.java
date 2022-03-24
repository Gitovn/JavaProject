package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		// Assignment Operator =, +=, -=, *=, /=, %=, <<=, >>=

		int a = 7;
		int b = 5;

		a += b; // a= a+b
		System.out.println(a);

		a -= b; // a= a-b
		System.out.println(a);

		a *= b; // a= a*b
		System.out.println(a);

		a /= b; // a=a/b
		System.out.println(a);

		a %= b; // a= a%b
		System.out.println(a);

		a <<= b; // a=a<<=5 // a=a*2^5
		System.out.println(a);

		b >>= a; // b=b>>=a // b=b/2^7
		System.out.println(a);

	}

}

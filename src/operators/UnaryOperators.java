package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		// Unary Operator exp++, exp--, ++exp, --exp, ~, !
		
		int a = 4;
		int b = 6;
		
		boolean flag = false;
		boolean flag1 = !flag;
		System.out.println(flag1);
		
		boolean j= !(a>b);
		System.out.println(j);
		
		int i = ~a;
		System.out.println(i);
		
		int g = --a-++b-++a+--b;
		System.out.println(g);
		
		int f = --a;
		System.out.println(f);
		System.out.println(a);
		
		int e = ++a;
		System.out.println(e);
		System.out.println(a);
		
		int d = a--;
		System.out.println(d);
		System.out.println(a);
		
		
		int c = a++;
		System.out.println(c);
		System.out.println(a);
	}

}

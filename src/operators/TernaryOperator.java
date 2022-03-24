package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// Ternary operator  ? :
		
		int age = 23;
		boolean flag = false;
		int b = 98;
		
		int a = flag ? 34 : 77;
		System.out.println(a);
		
		int c = b<34 ? 34 : 77;
		System.out.println(c);
		
		int d = flag && b>40 ? 34 : 100;
		System.out.println(d);
		
		String str = age>=18 ? "You can vote" : "You can not vote";
		System.out.println(str);
		
		char ch = age<=23 ? 'Y' : 'N';
		System.out.println(ch);

	}

}

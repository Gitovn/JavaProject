package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		// Logical Operator && , || 
		
		int a = 4;
		int b = 5;
		int c = 57;
		boolean flag1 = true;
		boolean flag2 = false;
		
		boolean flag3 = flag1 && flag2;
		System.out.println(flag3);
		
		boolean flag4 = flag1 || flag2;
		System.out.println(flag4);
		
		boolean flag5 = (a>b) && flag1;
		System.out.println(flag5);
		
		boolean flag6 = (a>b) && c<70 && flag2;
		System.out.println(flag6);
		
		boolean flag7 = (a>b) && c<70 || flag2;
		System.out.println(flag7);
		
		boolean flag8 = (a>b) || c<70 && flag1;
		System.out.println(flag8);
		
		boolean flag9 = (c<b) && flag1 || a<b;
		System.out.println(flag9);

		
	}

}

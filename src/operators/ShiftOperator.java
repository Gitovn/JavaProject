package operators;

public class ShiftOperator {

	public static void main(String[] args) {
		// Shift Operator <<, >>
		
		int a = 4; // 0000 0000 0000 0000 0000 0000 0000 0100
		int b = 5; // 0000 0000 0000 0000 0000 0000 0000 0101
		
		int c = a<<3;	// 0 0000 0000 0000 0000 0000 0000 0100000
		System.out.println(c);
		
		int d = b>>2;  // 00 0000 0000 0000 0000 0000 0000 010100
		System.out.println(d);
		
		int e = a<<40;	// 0000 0000 0000 0000 0000 0000 0000 0100
		System.out.println(e);
		

	}

}

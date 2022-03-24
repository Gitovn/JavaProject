package wrapperclasses;

public class WrapClass {
	
	public static void main(String[] args) {
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		String str = "456";
	
		boolean btt = new Boolean(false);
		System.out.println(btt);
		
		float ft = new Float(str);
		System.out.println(ft);
		
		byte af = 34;
		
		Byte btobj = new Byte(af);
		System.out.println(btobj);
		
		Byte btob = new Byte((byte)33);
		System.out.println(btob);
		
		byte bt = Byte.parseByte(str);
		System.out.println(bt);
	
		Integer abcd = 89;
		System.out.println(abcd);
		
		
		System.out.println("ways to convert string value into integer ");
		
		
		int gh = Integer.valueOf(str);
		int dd = Integer.parseInt(str);
		
		Integer val = new Integer("456");
		
		int cvd = val;
		int z = val.valueOf(str);
		
		System.out.println(cvd);
		System.out.println(z);
		
		System.out.println("---------------------------------------------------------- ");
		
//		int d = 90;
//		Integer a = new Integer(53);
//		
//		a = 56;
//		System.out.println(a);
//		
//		int c = a.intValue();
//		System.out.println(c);
//		
//		a = a.valueOf(d);
//		System.out.println(a.intValue());
		
	}

}

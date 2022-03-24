package method.with.parameter;

import classobject.ArithmeticOperations;

public class ParameterM {
	public static void main(String[] args) {
		ParameterM oo = new ParameterM();
		int z = 56;

		ArithmeticOperations arthobj = new ArithmeticOperations();
		arthobj.a = 34.56f;
		arthobj.b = 23.65f;
		char ch[] = { 'A', 'Z' };
		String dataarr[] = { "KTCTC", "Welcome", "Hello" };
		oo.sampleMethod2(ch, dataarr);
		oo.sampleMethod3(ch[1], dataarr[2]);

		oo.sampleMethod(z, 22, arthobj);

		/*
		 * arthobj.addition(); new ArithmeticOperations(); new
		 * ArithmeticOperations().addition(); new ArithmeticOperations().a=34;
		 */

	}

	public void sampleMethod(int a, int b, ArithmeticOperations obj) {

		int c = a + b;
		System.out.println("addition is " + c);
		obj.addition();
	}

	public void sampleMethod2(char chararr[], String strarr[]) {
		System.out.println(chararr[0]);

		System.out.println(strarr[1]);

	}

	public void sampleMethod3(char c, String s) {
		System.out.println(c);
		System.out.println(s);

	}
}

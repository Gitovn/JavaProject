package thiskeyword;

public class MethodReturn {

	int pqr;

	public MethodReturn methodReturnThis() {
		this.pqr = 78;
		return this;
	}

	public static void main(String[] args) {

		MethodReturn obj = new MethodReturn();
		MethodReturn oo = obj.methodReturnThis();
		System.out.println(oo.pqr);

	}

}

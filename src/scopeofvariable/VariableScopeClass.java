package scopeofvariable;

public class VariableScopeClass {

	int a;
	static int pqr = 88;

	public static void main(String[] args) {
//		System.out.println(z);

	}

	public void sampleMethod1(float rt) {
		int z = 45;
		System.out.println(z);
		System.out.println(rt);
		System.out.println(pqr);
		System.out.println(a);
		for (; true;) {
			int forvariable = 34;
			System.out.println(forvariable);
			if (true) {
				float ifvariable = 34.5f;
				System.out.println(ifvariable);
			}
//			System.out.println(ifvariable);
		}
//		System.out.println(forvariable);

	}

}

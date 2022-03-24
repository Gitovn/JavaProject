package variable.types;

public class LocalVariableTypeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(a);
		LocalVariableTypeClass obj = new LocalVariableTypeClass();
		// obj.a=55;
		// LocalVariableTypeClass a = 33;
		// LocalVariableTypeClass c = 33.4f;
		obj.nonStaticSimpleMethod();

	}

	public void nonStaticSimpleMethod() {

		LocalVariableTypeClass obj2 = new LocalVariableTypeClass();
		int a = 34;
		System.out.println(a);

		// System.out.println(c);

	}

	public static void staticSimpleMethod() {

		LocalVariableTypeClass obj3 = new LocalVariableTypeClass();
		float c = 56.34f;
		System.out.println(c);
		// System.out.println(a);
	}

}

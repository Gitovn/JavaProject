package variable.types;

public class InstanceVariableTypeClass {

	int abcd;
	String name;

	public static void main(String[] args) {

		// System.out.println(abcd);
		InstanceVariableTypeClass obj = new InstanceVariableTypeClass();
		// obj.staticSimpleMethod();
		staticSimpleMethod();
		// obj.nonStaticSimpleMethod();
		InstanceVariableTypeClass.staticSimpleMethod();
		// InstanceVariableTypeClass2.nonStaticSimpleMethod();
		staticSimpleMethod();
	}

	public void nonStaticSimpleMethod() {

		System.out.println(name);
		int a = 34;
		System.out.println(a);
		System.out.println(abcd);

	}

	public static void staticSimpleMethod() {

		InstanceVariableTypeClass obj3 = new InstanceVariableTypeClass();
		obj3.abcd = 44;
		System.out.println(obj3.abcd);
		float c = 56.34f;
		System.out.println(c);
		obj3.nonStaticSimpleMethod();
	}
}

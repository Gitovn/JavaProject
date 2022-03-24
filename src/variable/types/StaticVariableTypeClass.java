package variable.types;

public class StaticVariableTypeClass {

	int abcd;
	String name = "abhi";
	static boolean flag = true;

	public static void main(String[] args) {

		System.out.println("KTCTC");
		StaticVariableTypeClass obj1 = new StaticVariableTypeClass();
		StaticVariableTypeClass obj2 = new StaticVariableTypeClass();
		System.out.println(flag);
		obj1.flag = false;
		System.out.println(obj2.flag);
		System.out.println(StaticVariableTypeClass.flag);
		StaticVariableTypeClass.flag = true;
		System.out.println(obj1.flag);
		obj2.flag = false;
		System.out.println(flag);
		staticSimpleMethod();
		obj1.nonStaticSimpleMethod();

	}

	public void nonStaticSimpleMethod() {

		int a = 34;
		System.out.println(a);
		System.out.println(abcd);
		System.out.println(flag);
		System.out.println(StaticVariableTypeClass.flag);
		staticSimpleMethod();

	}

	public static void staticSimpleMethod() {

		StaticVariableTypeClass obj3 = new StaticVariableTypeClass();
		obj3.abcd = 44;
		System.out.println(obj3.abcd);
		float c = 56.34f;
		System.out.println(c);
		obj3.nonStaticSimpleMethod();
	}
}

package accessmodifierA;

public class AccessModify {

	public int publicVariable = 89;
	private int privateVariable = 99;
	int defaultVariable = 45;
	protected int protectedVariable = 499;

	public AccessModify() {
		System.out.println("public constructor");
	}

	AccessModify(int a) {
		System.out.println("default constructor");
	}

	private AccessModify(String b) {
		System.out.println("private constructor");
	}

	protected AccessModify(float c) {
		System.out.println("protected constructor");
	}

	public static void main(String[] args) {

		AccessModify obj2 = new AccessModify(23);
		AccessModify obj3 = new AccessModify(89.4f);
		AccessModify obj4 = new AccessModify("private");

		AccessModify obj = new AccessModify();

		System.out.println(obj.publicVariable);
		System.out.println(obj.privateVariable);
		System.out.println(obj.defaultVariable);
		System.out.println(obj.protectedVariable);

		obj.publicMethod();
		obj.privateMethod();
		obj.defaultMethod();
		obj.protectedMethod();
		
//		=========================================================================================

		obj.staticPublicMethod();
		obj.staticProtectedMethod();
		obj.staticPrivateMethod();
		obj.staticDefaultMethod();

		AccessModify.staticPublicMethod();
		AccessModify.staticProtectedMethod();
		AccessModify.staticPrivateMethod();
		AccessModify.staticDefaultMethod();

	}

	public void publicMethod() {
		System.out.println("Public method");
	}

	private void privateMethod() {
		System.out.println("Private method");
	}

	void defaultMethod() {
		System.out.println("Default method");
	}

	protected void protectedMethod() {
		System.out.println("Protected method");
	}

//	======================================================================================

	public static void staticPublicMethod() {
		System.out.println("static Public method");
	}

	private static void staticPrivateMethod() {
		System.out.println("static Private method");
	}

	static void staticDefaultMethod() {
		System.out.println("static Default method");
	}

	protected static void staticProtectedMethod() {
		System.out.println("static Protected method");
	}

}

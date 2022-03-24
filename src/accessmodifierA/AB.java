package accessmodifierA;

public class AB {

	public static void main(String[] args) {

		AccessModify obj2 = new AccessModify(23);
		AccessModify obj3 = new AccessModify(89.4f);
//		AccessModify obj4 = new AccessModify("private");

		AccessModify obj = new AccessModify();

		System.out.println(obj.publicVariable);
//		System.out.println(obj.privateVariable);
		System.out.println(obj.defaultVariable);
		System.out.println(obj.protectedVariable);

		obj.publicMethod();
//		obj.privateMethod();
		obj.defaultMethod();
		obj.protectedMethod();
		
//		=========================================================================================

		obj.staticPublicMethod();
		obj.staticProtectedMethod();
//		obj.staticPrivateMethod();
		obj.staticDefaultMethod();

		AccessModify.staticPublicMethod();
		AccessModify.staticProtectedMethod();
//		AccessModify.staticPrivateMethod();
		AccessModify.staticDefaultMethod();

	}

}

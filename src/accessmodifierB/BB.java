package accessmodifierB;

import accessmodifierA.AccessModify;

public class BB extends AccessModify {

	public static void main(String[] args) {

//		AccessModify obj2 = new AccessModify(23);
//		AccessModify obj3 = new AccessModify(89.4f);
//		AccessModify obj4 = new AccessModify("private");

		BB ob = new BB();

		System.out.println(ob.publicVariable);
//		System.out.println(ob.privateVariable);
//		System.out.println(ob.defaultVariable);
		System.out.println(ob.protectedVariable);

		ob.publicMethod();
//		ob.privateMethod();
//		ob.defaultMethod();
		ob.protectedMethod();
		
//		=========================================================================================

		ob.staticPublicMethod();
		ob.staticProtectedMethod();
//		ob.staticPrivateMethod();
//		ob.staticDefaultMethod();

		AccessModify.staticPublicMethod();
		AccessModify.staticProtectedMethod();
//		AccessModify.staticPrivateMethod();
//		AccessModify.staticDefaultMethod();

	}

}

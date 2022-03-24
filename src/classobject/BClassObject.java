package classobject;

public class BClassObject {

	public static void main(String[] args) {
		ArithmeticOperations obj = new ArithmeticOperations();
		ArithmeticOperations obj1 = obj;

		obj.a = 33.4f;
		obj.b = 45.5f;
		System.out.println(obj1.a);
		obj1.a = 55.55f;
		System.out.println(obj.b);
		obj.addition();

		ArithmeticOperations.multiplication();
		ArithmeticOperations.z = 99;

	}

}

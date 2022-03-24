package data.type;

public class DataType1 {

	public static void main(String[] args) {

		System.out.println("Welcome to KTCTC");
		DataType1.smMethod();
		System.out.println("This is Manual Testing");
		DataType1.smMethod();

	}

	public static void smMethod() {

		System.out.println("I am inside of smMethod");
		System.out.println("This is Method 1");
		System.out.println("This is Method 2");
		DataType1.simpleMethod();

	}

	public static void simpleMethod() {

		System.out.println("I am inside of simpleMethod");
		System.out.println("This is Java Classes");

	}

	public void nonStaticMethod() {

		System.out.println("This is non Static Method");
		DataType1.simpleMethod();
	}

}

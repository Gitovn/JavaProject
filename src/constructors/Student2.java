package constructors;

public class Student2 {
	int rollNo;
	String stName;

	public Student2(int a, String name) {
		rollNo = a;
		stName = name;
		System.out.println("Inside parameterized constructor");
	}

	public Student2() {
		System.out.println("Inside default constructor");
	}

	public Student2(int a, String name, float f) {
		rollNo = a;
		stName = name;
		System.out.println("Inside parameterized constructor");
	}

	public Student2(float f, String name, int a) {
		rollNo = a;
		stName = name;
		System.out.println("Inside parameterized constructor");
	}

}

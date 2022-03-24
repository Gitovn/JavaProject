package thiskeyword;

public class Const {

	int ab;

	public Const() {
		this(23, 44);
		System.out.println("Default constructor");
	}

	public Const(int a, int b) {
		
		System.out.println("2 Parameterized constructor");
	}

	public Const(int ab) {
		this();
		this.ab = ab;
		System.out.println("parameterized constructor");
//		this(22);
	}

	public static void main(String[] args) {

		Const obj = new Const(33);

	}

	public void sampleMethod() {

	}

}

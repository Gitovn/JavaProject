package thiskeyword;

public class InstanceVariable {

	int ab;
	String name;
	static int abcd;

	public InstanceVariable() {
		System.out.println("Default");
	}

	public InstanceVariable(int ab, String name) {
	this.ab = ab;
	this.name = name;


	}

	public static void main(String[] args) {

		InstanceVariable obj = new InstanceVariable();
		InstanceVariable obj1 = new InstanceVariable(34, "suraj");

		obj.ab = 78;
		obj.name = "abhi";
		obj.sampleMethod();
		obj1.sampleMethod();

	}

	public void sampleMethod() {
		int ab = 465;
		System.out.println(ab);
		System.out.println(this.ab);
		System.out.println(this.name);
		System.out.println(this.abcd);
	}
	
	public static void sampleMethod1() {
		int ab = 465;
		System.out.println(ab);
//		System.out.println(this.ab);
//		System.out.println(this.name);
//		System.out.println(this.abcd);
	}

}

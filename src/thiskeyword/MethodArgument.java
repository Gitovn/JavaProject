package thiskeyword;

public class MethodArgument {

	int ab;
	String name;

	public static void main(String[] args) {

		MethodArgument obj = new MethodArgument();
		obj.ab = 39;
		obj.name = "Priya";
		obj.sample2();
	}

	public void sample(MethodArgument oo) {
		System.out.println(oo.name);
	}

	public void sample2() {
		System.out.println(this.ab);
		sample(this);
	}

}

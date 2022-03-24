package thiskeyword;

public class ConstArgCall {

	int abcd;

	public ConstArgCall() {
		AB object = new AB(this);

	}

	public static void main(String[] args) {

		ConstArgCall obj = new ConstArgCall();
		System.out.println(obj.abcd);

	}

	public void display() {
		System.out.println("value = " + abcd);
	}

}

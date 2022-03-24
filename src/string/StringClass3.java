package string;

public class StringClass3 {

	public static void main(String[] args) {

		String data = "Welcome To KTCTC";
		String data2 = "Showing 11-20 of 3685 records";

		String x = "t";				 		// immutable
		String y = "t";
		x.concat(y);

		data = data.concat(data2);			 // mutable
		System.out.println(data);

		data = data.toLowerCase();
		System.out.println(data);

	}

}

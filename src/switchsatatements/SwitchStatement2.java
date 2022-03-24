package switchsatatements;

public class SwitchStatement2 {

	public static void main(String[] args) {
		System.out.println("Before switch");

		String data = "History";

		switch (data) {
		case "Maths":
			System.out.println("Book price is 200");
			break;
		case "TOM":
			System.out.println("Book price is 400");
			break;
		case "Science":
			System.out.println("Book price is 250");
			break;
		case "History":
			System.out.println("Book price is 60");
			break;
		default:
			System.out.println("Book is not available");
			break;
		}
		
		System.out.println("After switch");
	}
	

/**
 * below method is created to see we can include switch statements inside of if statements 
 *
 */
	public static void sampleMethod() {
		int a = 3;
		String data = "History";
		if (a>0) {
			
			switch (data) {
			case "Maths":
				System.out.println("Book price is 200");
				break;
			case "TOM":
				System.out.println("Book price is 400");
				break;
			case "Science":
				System.out.println("Book price is 250");
				break;
			case "History":
				System.out.println("Book price is 60");
				break;
			default:
				System.out.println("Book is not available");
				break;
			}
			
		}
		
	}
}

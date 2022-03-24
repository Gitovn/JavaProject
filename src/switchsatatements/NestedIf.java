package switchsatatements;

public class NestedIf {

	public static void main(String[] args) {
		System.out.println("Before switch");
		String data = "TOM";
		String year = "2nd";

		switch (data) {
		case "Maths":
			System.out.println("You have selected Maths book ......");
			printPriceOfBookAccordingToYear(year);
			break;

		case "TOM":
			System.out.println("You have selected TOM book ......");
			printPriceOfBookAccordingToYear(year);
			break;

		case "Science":
			System.out.println("You have selected Science book ......");
			printPriceOfBookAccordingToYear(year);
			break;

		default:
			System.out.println("Book is not available");
			break;
		}

		System.out.println("After switch");
	}

	public static void printPriceOfBookAccordingToYear(String year) {

		switch (year) {
		case "1st":
			System.out.println("Book price is 150");
			break;
		case "2nd":
			System.out.println("Book price is 250");
			break;
		case "3rd":
			System.out.println("Book price is 400");
			break;
		default:
			System.out.println("Subject is not available");
			break;
		}
	}

}

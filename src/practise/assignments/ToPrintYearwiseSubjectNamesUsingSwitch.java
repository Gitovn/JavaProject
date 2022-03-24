package practise.assignments;

public class ToPrintYearwiseSubjectNamesUsingSwitch {

	public static void main(String[] args) {

		String year = "Forth";
		int yearCode = 04;

		switch (year) {
		case "First":
			System.out.println("You are in 1st year and your subjects are :");

			switch (yearCode) {
			case 01:
				System.out.println("1st semester : \n Maths-1 \n Physics \n BME \n BEE \n AM");

			case 012:
				System.out.println("2nd semester : \n Maths-2 \n Chemistry \n BCE \n Graphics \n BE&CP");
			}

			break;

		case "Second":
			System.out.println("You are in 2nd year and your subjects are :");

			switch (yearCode) {
			case 02:
				System.out.println("1st semester : \n Maths-3 \n AME \n AT \n MTP \n Drawing \n C++");

			case 022:
				System.out.println("2nd semester : \n TOM \n MP \n FM \n NM \n EET \n CAMD");
			}

			break;

		case "Third":
			System.out.println("You are in 3rd year and your subjects are :");

			switch (yearCode) {
			case 03:
				System.out.println("1st semester : \n TOM 2 \n Metallurgy \n HMT \n MD 1 \n FM&FP \n ACP 1");

			case 032:
				System.out.println("2nd semester : \n M&MM \n ICE \n CAD/CAM \n MD 2 \n TE \n ACP 2");
			}

			break;

		default:
			System.out.println("You are in 4th year and your subjects are :");

			switch (yearCode) {
			case 04:
				System.out.println("1st semester : \n ACE \n OR \n R&AC \n IT \n PW 1 \n AE");

			case 042:
				System.out.println("2nd semester : \n I&QM \n IE \n PW 2 \n GP \n Mechatronics");
			}

			break;
		}

	}

}

package exceptions;

public class SampleExc {

	public static void main(String[] args) {

		int z = sampleMethod();

	}

	public static int sampleMethod() {
		try {
			return 2;

		} catch (Exception e) {

			return 5;
		} finally {
			return 8;
		}
	}

}

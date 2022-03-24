package wrapperclasses;

public class WrapClass2 {

	public static void main(String[] args) {

		Character chh = 'r';
		Character ch = new Character('t');

		boolean f = Character.isLetter(ch);
		boolean f2 = Character.isDigit(ch);
		boolean f3 = Character.isLowerCase(ch);
		boolean f4 = Character.isUpperCase(ch);

		System.out.println(f);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);

		char array[] = { 'a', 'B', '2', '3', '$', '@', '!', 'g', 'K', 'i' };
		int lowerCount = 0;
		int upperCount = 0;
		int digitCount = 0;
		int specialCount = 0;

		for (char chr : array) {
			if (Character.isLowerCase(chr))
				lowerCount++;

			else if (Character.isUpperCase(chr))
				upperCount++;

			else if (Character.isDigit(chr))
				digitCount++;

			else
				lowerCount++;

		}

		System.out.println("Numeber of lowercase letters =" + lowerCount);
		System.out.println("Numeber of uppercase letters =" + upperCount);
		System.out.println("Numeber of digits =" + digitCount);
		System.out.println("Numeber of special characters =" + specialCount);

	}

}

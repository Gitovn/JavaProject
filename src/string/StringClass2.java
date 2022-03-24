package string;

public class StringClass2 {

	public static void main(String[] args) {
		// charAt(), length(),endsWith(" "),startsWith(),replace(),trim(),split("
		// "),subString(),contains(),equals(),
		// concate(),equalsIgnoreCase(String another),toLowerCase(),toUpperCase()

		String data = "Welcome To KTCTC";
		String data2 = "Welcome to KTCTC";
		String data1 = "        Welcome To KTCTC        ";
		String data4 = "Showing 11-20 of 3685 records";
		String data5 = "       Welcome      To    KTCTC.  which has number 45 records       ";

		// tochararray

		char[] abc = data.toCharArray();
		System.out.println(abc);

		// touppercase

		String sst = data.toUpperCase();
		System.out.println(sst);

		// tolowercase

		String stt = data.toLowerCase();
		System.out.println(stt);

		// equalsIgnoreCase

		boolean ff = data.equals(data2);
		System.out.println(ff);

		boolean bt = data.equalsIgnoreCase(data2);
		System.out.println(bt);

		// concate

		String st = data.concat(data4);
		System.out.println(st);

		// substring

		String ps = data.substring(3, 12);
		System.out.println(ps);

		String sp = data.substring(2);
		System.out.println(sp);

		// split special case

		System.out.println(Integer.parseInt(data5.trim().split("has")[1].split(" ")[2]));

		System.out.println(Integer.parseInt(data4.split(" ")[3]));

		// orrrrrrrrrrrrrrrrrrrrrrrrrrrrr

		System.out.println(Integer.parseInt(data4.split("of")[1].split(" ")[1]));

		// oooooooooooooooorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
		String ra[] = data4.split("of");
		String raa = ra[1];
		String ra2[] = raa.split(" ");
		System.out.println(ra2[1]);

		int ab = Integer.parseInt(ra2[1]);
		System.out.println(ab);

		// split
		String ar[] = data.split("To");
		System.out.println(ar[0]);
		
		String ar1[] = data.split(" ");
		System.out.println(ar1[2]);
		
		String ar2[] = data2.split(" ");
		System.out.println(ar2[1]);

		for (String each : ar) {
			System.out.print(each);
		}

		// trim
		String ss = data1.trim();
		System.out.println(ss);

		// replace
		String sl2 = data.replace("To", "too");
		System.out.println(sl2);

		String sl = data.replace('o', '3');
		System.out.println(sl);

		// Startswith
		boolean fl = data.startsWith(" Welcome  ");
		System.out.println(fl);

		// endsWith
		boolean f = data.endsWith("   To KTCTC");
		System.out.println(f);

		boolean f1 = data.endsWith(" KTCTC");
		System.out.println(f1);

		boolean f2 = data.endsWith("ktctc");
		System.out.println(f2);

		boolean f3 = data.endsWith("KTCTC");
		System.out.println(f3);

		// length
		int leng = data.length();
		System.out.println(leng);

		// charAt
		char ch = data.charAt(5);
		System.out.println(ch);

		for (int i = 0; i < data.length(); i++) {
			System.out.println(data.charAt(i));
		}

		System.out.println("-----------------------------------------------------------------");

		for (int i = data.length() - 1; i >= 0; i--) {
			System.out.println(data.charAt(i));
		}

	}

}

package forloop;

import java.sql.Array;
import java.util.Arrays;

public class ForEachTwoDimensionalLoop {

	public static void main(String[] args) {
		int arr[] = { 23, 45, 67, 89 };

		int marr[][] = { { 23, 44 }, { 11, 37 }, { 34535, 45646 }, { 42345, 55555 } };
		int marr1[][] = { { 23, 44 }, { 11, 37 }, { 34535654, 45646 }, { 42345, 55555 } };
		int thirdarr[][] = new int[marr.length][marr1[1].length];
		System.out.println(marr[3][1]);
		int a[] = marr[3];
		System.out.println(a[0]);
		Arrays.sort(marr1[2]);
		boolean fl = Arrays.equals(marr[2], marr1[2]);
		System.out.println(fl);

	}

}

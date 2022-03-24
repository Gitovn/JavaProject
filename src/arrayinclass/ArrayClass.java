package arrayinclass;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {

		int a = 89;
		int b = 89;
		int arr[] = { 23, 45, 67, 89 }; // 1st way to creating array
		int arr2[] = { 43, 25, 67, 89 };
		int arr3[] = arr;

		Arrays.sort(arr2);

		boolean ads = Arrays.equals(arr, arr2);
		System.out.println(ads);

		arr3[3] = 561;
		System.out.println(arr[3]);

		System.out.println(arr[1]);
		arr[1] = 489;
		System.out.println(arr[1]);

		int arr1[] = new int[4]; // 2nd way of creating array
		arr1[0] = 23;
		arr1[1] = 45;
		arr1[2] = 67;
		arr1[3] = 89;

		System.out.println(arr1[3]);

		int lng = arr.length;
		System.out.println(lng);

		boolean fl = arr == arr3;
		System.out.println(fl);

		boolean check = arr2 == arr;
		System.out.println(check);

		boolean abc = a == b;
		System.out.println(abc);

	}

}

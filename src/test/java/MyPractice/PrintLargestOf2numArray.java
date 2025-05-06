package MyPractice;

import java.util.Arrays;

public class PrintLargestOf2numArray {

	public static void main(String[] args) {
		int a[]= {5,7,8,4,9};
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		System.out.println(a[a.length-1]+" "+a[a.length-2]);

	}

}

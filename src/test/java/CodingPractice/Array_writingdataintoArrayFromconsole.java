package CodingPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Array_writingdataintoArrayFromconsole {

	public static void main(String[] args) {
		
		int a[]= new int[4];
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter value of an array at the index: "+i);
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
      sc.close();
	}

}

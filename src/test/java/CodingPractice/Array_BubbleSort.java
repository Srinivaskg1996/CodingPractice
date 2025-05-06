package CodingPractice;

import java.util.Arrays;

public class Array_BubbleSort {

	public static void main(String[] args) {
		
		int a[]= {5,3,2,4,1};
		
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	

}

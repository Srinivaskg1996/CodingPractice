package CodingPractice;

public class Array_MaxAndMinNumber {

	public static void main(String[] args) {
		
		int a[]= {10,40,20,100,50};
		int max=a[0];
		
		//max
		for(int x:a)
		{
			if(max<x)
				max=x;
		}
		System.out.println(max);
		
		//min
		int min=a[0];
		
		for(int x:a)
		{
			if(min>x)
				min=x;
		}
		System.out.println(min);
		
	}

}

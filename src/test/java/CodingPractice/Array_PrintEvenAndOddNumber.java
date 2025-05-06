package CodingPractice;

public class Array_PrintEvenAndOddNumber {

	public static void main(String[] args) {
		
		int a[]= {1,4,5,6,78,8};
		
	/*	for(int x:a)
		{
			
				System.out.println("Even numbers" +x);	
			
		}
		System.out.println("Odd numbers: ");
		for(int x:a)
		{
		 if(x%2!=0)
			System.out.print(x+",");
		}
System.out.println();
	} */
		
		System.out.println("Even Numbers are");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}

	}}

package CodingPractice;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		//int a=10;
		//int b=5;
		//int c=20;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		System.out.println("enter the value of c");
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is largest of all"+a);
		}
		if(b>a && b>c)
		{
			System.out.println("b is largest of all"+b);
		}
		else
		{
			System.out.println("c is largest of all : "+c);
		}

    //Using ternary operator
		
		int largest1=a>b?a:b;
		int largest =c>largest1?c:largest1;
				
		
			System.out.println(largest);
		
	}
 
  
}

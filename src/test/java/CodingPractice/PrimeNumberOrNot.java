package CodingPractice;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		int num=sc.nextInt();
		int count=0;
		
		if(num>1)
		{
			for(int i=1; i<=num;i++)
			{
				if(num%i==0)
					count++;	
				
			}
			System.out.println(count);
			if(count==2)
			{
				System.out.println("Number is a prime");
			}
			else
			{
				System.out.println("Number is not a prime");
			}
		}
		else
		{
			System.out.println("Number is not a prime");
		}
	}

}

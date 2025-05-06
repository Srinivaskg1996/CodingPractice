package MyPractice;

import java.util.Scanner;

public class NumberIsPerfect {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int PerfectNumber=0;
		
		//A perfect number is a sum of the devision number should equals 6--> 1+2+3, 28-->1+2+4+7+14
		
		for(int i=1; i<num;i++)
		{
			if(num%i==0)
			{
				PerfectNumber=PerfectNumber+i;
			}
							
		}
		System.out.println(PerfectNumber);
		
		if(num==PerfectNumber)
		{
		System.out.println("Number is perfect");
		}
		else
		{
			System.out.println("Number is not perfect");
		}
		
	}

}

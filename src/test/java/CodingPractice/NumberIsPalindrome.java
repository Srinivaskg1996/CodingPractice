package CodingPractice;

import java.util.Scanner;

public class NumberIsPalindrome {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("entera value");
		int input=sc.nextInt();
		int original=input;
		int rev=0;
		
		while(input!=0)
		{
			rev=rev*10+input%10;
			input=input/10;
		}

		if(original==rev)
		{
			System.out.println(rev+"given number is palindrome");
		}
		else
		{
			System.out.println(rev+"given number is not a palindrome");
		}
		sc.close();
	}


}

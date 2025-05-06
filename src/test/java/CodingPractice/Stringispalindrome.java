package CodingPractice;

import java.util.Scanner;

public class Stringispalindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string value");
		String ip=sc.next();
		String original=ip;
		String rev="";
		
		
		for(int i=ip.length()-1;i>=0;i--)
		{
			rev=rev+ip.charAt(i);
		}
		
  if(original.equalsIgnoreCase(rev))
  {
	  System.out.println(rev+"  given string is palindrome");
  }
  else
  {
	  System.out.println(rev+"  given string is not a palindrome");
  }
  sc.close();
	}

}

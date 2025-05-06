package MyPractice;

import java.util.Scanner;

public class StringOddNumberPringAndReverse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String s= sc.nextLine();
		
		String rev="";
		String odd="";
		
		//replacing all white spaces
		String s2=s.replaceAll("[\\s]", "");
		System.out.println(s2);
		
		
		//Reversing the String
		for(int i=s2.length()-1;i>=0;i--)
		{
			rev=rev+s2.charAt(i);
					
		}
		System.out.println(rev);
		
		//Printing only odd number
		for(int i=0; i<=rev.length()-1;i++)
		{
			if(i%2==0)
				
				 odd=odd+rev.charAt(i);
		}
		System.out.println("odd number in String: "+odd);
		
		sc.close();

	}

}

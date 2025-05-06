package MyPractice;

import java.util.Arrays;
import java.util.Scanner;

public class StringIsAnagramOfAnotherString {

	public static void main(String[] args) {
		// both String should have same length and all the letter in the String should be same
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String1");
		String str1= sc.nextLine();
		System.out.println("Enter String2");
		String str2= sc.nextLine();
		//String str1 = "listen";
        //String str2 = "silent";
        
        if(str1.length()==str2.length())
        {
        	String s1[]=str1.split("");
        	String s2[]=str2.split("");
        	
        	Arrays.sort(s1);
        	Arrays.sort(s2);
        	
        	
        	
        	if(Arrays.equals(s1, s2))
        	{
        		System.out.println("String is Anagram and value is :"+Arrays.toString(s1)+" "+Arrays.toString(s2));
        	}
        	else
        	{
        		System.out.println("String is not Anagram and value is : "+Arrays.toString(s1)+" "+Arrays.toString(s2));
    	    }
        
        }
        else
    	{
    		System.out.println("String is not Anagram");
    	}
        		
	}

}

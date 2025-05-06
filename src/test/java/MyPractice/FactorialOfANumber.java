package MyPractice;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {

 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the number");
 int num= sc.nextInt();
 long FN=1;
 
 for(int i=1; i<=num; i++)
 {
	 FN=FN*i;
 }
 
 System.out.println(FN);
 
 
 
 

	}

}

package CodingPractice;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int a=8;
		long factorial=1;
		
	/*	for(int i=1; i<=a;i++)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);*/
		
		for(int i=a; i>0; i--)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
	}
	
	

}

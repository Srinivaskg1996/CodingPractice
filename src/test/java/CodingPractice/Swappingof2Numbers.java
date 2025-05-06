package CodingPractice;

public class Swappingof2Numbers {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		//by using third variable
		/*int t=a;
			a=b;
			b=t;*/

			
			
		//By using +and - without third variable
			
			/*a=a+b;
			b=a-b;
			a=a-b;*/
			
		//by using multi and divide
		//this will work only if a and b are non zero
		/*	a=a*b;
			b=a/b;
			a=a/b;*/
			
		//in a single line
			b=a+b-(a=b);
			
			
			System.out.println("Value of a and b after swapping  "+a+"  "+b);
	}

}

package CodingPractice;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		long a= 12345678987l;
		int count=0;
		
		while(a>0)
		{
			a=a/10;
			count++;
		}
		
		System.out.println(count);
	}

}

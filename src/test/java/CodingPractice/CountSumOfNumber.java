package CodingPractice;

public class CountSumOfNumber {

	public static void main(String[] args) {
		
		int a= 12345;
		int sum=0;
		
		while(a>0)
		{
			int b=a%10;
			sum=sum+b;
			// sum=sum+a%10;
			a=a/10;
		}
		System.out.println(sum);

	}

}

package MyPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
	int a=0, b=1, sum=0;
	
	for(int i=0; i<=10; i++)
	{
		
		sum=a+b;
		System.out.print(sum+" ");
		
		if(sum>=10)
			break;
		
		a=b;
		b=sum;
		
		
	}
	 System.out.println();
	}

}

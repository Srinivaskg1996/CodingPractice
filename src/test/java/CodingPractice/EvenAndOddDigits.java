package CodingPractice;

public class EvenAndOddDigits {

	public static void main(String[] args) {
		
		int a= 123456;
		int evenNum=0;
		int oddNum=0;
		
		while(a>0)
		{
			int b=a%10;
			if(b%2==0)
			{
				evenNum++;
			}
			else
			{
				oddNum++;
			}
			
			a=a/10;
		}
		System.out.println(evenNum);
		System.out.println(oddNum);

	}

}

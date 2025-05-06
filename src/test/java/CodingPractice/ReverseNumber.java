package CodingPractice;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=1234;
		
		//using algorithm
		/*int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10; // rev%10 will give the value of last digit in the input 1234 in that 4 will return
			num=num/10; //it will remove last digits 123. next time loop will take num as 123....
			
		}*/
		
		//Using String buffer
		/* StringBuffer sb=new StringBuffer(String.valueOf(num)); // converting int into string and passing value
		StringBuffer rev=sb.reverse();*/
		
		
		//Using String builder
		StringBuilder sb= new StringBuilder();
		sb.append(num);
		StringBuilder rev=sb.reverse();
		
		
		System.out.println(rev);
	}

}

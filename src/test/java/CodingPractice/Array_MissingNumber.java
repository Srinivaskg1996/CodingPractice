package CodingPractice;

public class Array_MissingNumber {

	public static void main(String[] args) {
		
		// no duplicate should be there
		// can be in unsorted way
		// should be in range
		
		//first find out some of the number of given array the sum of the number of range then do subtraction you will get missing element
		int a[]= {1,2,4,5};
		int sum1=0;
		
		for(int x:a)
		{
			sum1=sum1+x;
		}
		System.out.println(sum1);
		
		int sum2=0;
		
		for(int i=1; i<=5; i++)
		{
			sum2=sum2+i;
		}
		System.out.println(sum2);
		
		int missingNum= sum2-sum1;
		
		System.out.println(missingNum);
	}

}

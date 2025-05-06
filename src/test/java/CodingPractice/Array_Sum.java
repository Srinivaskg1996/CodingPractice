package CodingPractice;

public class Array_Sum {

	public static void main(String[] args) {
		int a[]= {2,4,6,7,8};
		
		int sum=0;
		
		/*	for(int x:a)
		{
			sum=sum+x;
		}
		System.out.println(sum); */
		
		
		//By using normal forloop
		
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}

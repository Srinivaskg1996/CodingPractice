package CodingPractice;

public class Array_LinearSearch_FindElement {

	public static void main(String[] args) {
		
		int a[]= {0,40,30,20,50};
		
		int serach=20;
		
		boolean b= false;
		for(int x:a)
		{
			if(x==serach)
				System.out.println("Element found");
			   b= true;
				break;
		}

		if(b==false)
			System.out.println("Element not found");
	}

}

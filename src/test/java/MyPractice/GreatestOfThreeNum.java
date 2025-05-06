package MyPractice;

public class GreatestOfThreeNum {

	public static void main(String[] args) {
		int a=10,b=50,c=20;
		
		if(a>b &&a>c)
		{
			System.out.println("A is larger and value of a is: "+a);
		}
		else if(b>a &&b>c)
		{
			System.out.println("b is larger and value of a is: "+b);
		}
		else 
		{
			System.out.println("c is larger and value of a is: "+c);
		}
	}

}

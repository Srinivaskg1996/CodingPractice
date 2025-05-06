package MyPractice;

public class SwappingNumWithoutThirdVariable {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("Value of a"+a +"and value of b"+b);
		a=a+b;
		b=a-b;
		a=a-b;
				
				System.out.println("Value of a: "+a +" and value of b: "+b);
		
	}

}

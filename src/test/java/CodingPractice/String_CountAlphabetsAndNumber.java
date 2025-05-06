package CodingPractice;

public class String_CountAlphabetsAndNumber {

	public static void main(String[] args) {
		
		String s="JAVA12345Test";
		int alpha=0;
		int digits=0;
		
		for(int i=0; i<=s.length()-1;i++)
		{
			char c= s.charAt(i);
			
			if(Character.isDigit(c))
				digits++;
			else
				alpha++;
			
		}
System.out.println(digits);
System.out.println(alpha);
	}

}

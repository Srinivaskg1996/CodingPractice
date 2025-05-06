package CodingPractice;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="srinivas";
		String rev="";
		
	/*	for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
System.out.println(rev);*/
		
		
		//By using char array
	    char a[]= s.toCharArray();
	    
	    for(int i=a.length-1;i>=0 ;i-- )
	    {
	    	rev=rev+a[i];
	    }
	    System.out.println(rev);
	    
	    //By using String buffer
	    
	    StringBuffer sb= new StringBuffer(s);
	   System.out.println(sb.reverse());
	    
	    
	    
	}

}


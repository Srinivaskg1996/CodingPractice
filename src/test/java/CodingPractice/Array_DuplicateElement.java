package CodingPractice;

import java.util.HashSet;

public class Array_DuplicateElement {

	public static void main(String[] args) {
		
		String s[]= {"Srini", "vas", "Srini", "Gowda", "Gowda", "Gowda", "Gowda"};
		
		/*boolean b=false;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++) // j value giving as i=1 because we need to compare next value with i 
			{
				if(s[i]==s[j])
				{
					System.out.println("Duplicate element found : "+s[i]);
					 b=true;
				}
				
			}
			
		}
		
		if(b==false)
		{
			System.out.println("Duplicate not found");
		}*/
		
		
		//Using Hashset
		
		HashSet<String> hs= new HashSet<>();
		
		boolean m=false;
		for(String x:s)
		{
			if(hs.add(x)==false)
			{
				System.out.println("Duplicate element id found : "+ x);
				m=true;
			}
		}
		if(m==false)
			System.out.println("Duplicate element is not found");

	}

}

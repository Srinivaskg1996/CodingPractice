package CodingPractice;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GeneratingRandomNumbers {

	public static void main(String[] args) {
		
		//By using random class
		
		Random rd= new Random();
				//;
				
				System.out.println(rd.nextInt(10));
				
				
		System.out.println(rd.nextLong(10));
		System.out.println(rd.nextDouble(10));
		
		
		//My using Math class---it will give only decimal
		
		System.out.println(Math.random());
		
		//By using Apache commans utils ---- need to add the file in the libraries 
		
		String s= RandomStringUtils.randomAlphabetic(10);
		String b= RandomStringUtils.randomNumeric(10);
		String c= RandomStringUtils.randomAlphanumeric(10);
		
		System.out.println(s);
		System.out.println(b);
		System.out.println(c);
		

	}

}

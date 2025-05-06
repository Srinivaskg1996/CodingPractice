package MyPractice;

import java.util.Random;
import java.util.stream.IntStream;

import org.apache.commons.lang3.RandomStringUtils;

public class RandonNumber {

	public static void main(String[] args) {
		
		Random rd= new Random();
		
	
		System.out.println(rd.nextInt(100));
		
		double d=Math.random();
		System.out.println(d);
		
		String s1=RandomStringUtils.randomNumeric(10);
		String s2=RandomStringUtils.randomNumeric(10);
		
		System.out.println("Value od s1: "+s1);
		System.out.println("Value od s2: "+s2);
		
		long i1=Long.parseLong(s1);
		long i2=Long.parseLong(s2);
		
		System.out.println("Value od i1: "+i1);
		System.out.println("Value od i2: "+i2);
		
		long sum=i1+i2;
		System.out.println("sum of: "+sum);
		
		

	}

}

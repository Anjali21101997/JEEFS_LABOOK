package com.cg.LAB3;
/**
 * Write a Java program that reads a line of integers and 
 * then displays each integer and the sum of all integers
 *
 */

import java.util.StringTokenizer;


public class Exercise1 {

public int getSumString(String input) 
{
	if(input.isEmpty())
	{
		return 0;
	}
	else if(input.length()>0)
	{
		int sum=0;
		StringTokenizer s1=new StringTokenizer(input," ");
		while(s1.hasMoreTokens())
		{
			String store=s1.nextToken();
			sum=sum+Integer.parseInt(store);
			
			
		}
		return sum;
		
	}
	
	else 
	{
		int result=Integer.parseInt(input);
		return result;
	}
		
		
}

}
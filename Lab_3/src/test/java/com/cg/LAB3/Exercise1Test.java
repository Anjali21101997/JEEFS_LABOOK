package com.cg.LAB3;
/**
 * Write a Java program that reads a line of integers and 
 * then displays each integer and the sum of all integers
 */


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Exercise1Test {
	Exercise1 sumString;
	@Before
	public void setup()
	{
		sumString=new Exercise1();
	}
	 @Test
	    public void testgetSumString_GivenEmptyString_ShouldReturnAs0Integer()
	    {
	    	String input="";
	    	int result=sumString.getSumString(input);
	        assertEquals(0,result);    
	    }
	    @Test
	    public void testCalculate_GivenOneString_ShouldReturnAsInteger()
	    {
	    	String input="1";
	    	int result=sumString.getSumString(input);
	        assertEquals(1,result);    
	    }
	    @Test
	    public void testCalculate_GivenSumString_ShouldReturnAsInteger()
	    {
	    	String input="1 2";
	    	int result=sumString.getSumString(input);
	    	assertEquals(3,result);
	
	    }

}

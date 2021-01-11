package com.cg.LAB3;
/**
 * Create a method that accepts a String and checks if it is a positive string.
 *  A string is considered a positive string, if on moving from left to right 
 *  each character in the String comes after the previous characters in the Alphabetical order.
 *  For Example: ANT is a positive String (Since T comes after N and N comes after A). 
 *  The method should return true if the entered string is positive.
 */


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Exercise7Test {
	private Exercise7 positive_str;
	@Before
	public void setup()
	{
		positive_str=new Exercise7();
	}
	
@Test
public void testCalculate_GivenEmptyString_ShouldReturn0() {
	String value="";
	boolean result=positive_str.getCheckString(value);
	assertEquals(true,result);
	
}
@Test
public void testCalculate_Given1String_shouldReturnValue()
{
	String value="ast";
	boolean result=positive_str.getCheckString(value);
	assertEquals(true,result);
}
}



package com.cg.LAB3;
/**
 * Create a method that accepts a String and checks if it is a positive string.
 *  A string is considered a positive string, if on moving from left to right 
 *  each character in the String comes after the previous characters in the Alphabetical order.
 *   For Example: ANT is a positive String (Since T comes after N and N comes after A). 
 *   The method should return true if the entered string is positive.
 */

public class Exercise7{

	public boolean getCheckString(String value) {
	if(value.isEmpty())
	{
		return true;
	}
	else
	{
		char[] character_store=value.toCharArray();
		for(int i=0;i<character_store.length-1;i++)
		{
			if(character_store[i]>character_store[i+1])
			{
				return false;
			}
		}
		return true;
	}
	
}

}

package com.cg.LAB2;
/**
 * Create a method that accepts an array of string objects
 * and sort in alphabetic order.If there are n elements then 
 * right half should be lower case and left half will be uppercase.
 *
 */

import java.util.Arrays;

public class SortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getSortedStrings(String[] input) {
		int len=input.length;
		if(len==0)
		{
			return null;
		}
		else if(len==1)
		{
			input[0]=input[0].toUpperCase();
			return input[0];
		}
		else if(len%2==0)
		{
			for(int i=0;i<len/2;i++)
			{
				input[i]=input[i].toUpperCase();
			}
			for(int i=len/2;i<len;i++)
			{
				input[i]=input[i].toLowerCase();
			}
		}
		else
		{
			for(int i=0;i<=len/2;i++)
			{
				input[i]=input[i].toUpperCase();
			}
			for(int i=len/2+1;i<len;i++)
			{
				input[i]=input[i].toLowerCase();
			}
		}
		String str=Arrays.toString(input);
		
		return str;
	}

}

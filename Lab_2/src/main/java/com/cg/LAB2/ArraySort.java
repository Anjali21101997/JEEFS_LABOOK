package com.cg.LAB2;
/**
 * Reverse the numbers in the array then sort the array
 *
 */
import java.util.Arrays;


public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] getSorted(int[] newNumbers){
		
				if(isEmpty(newNumbers))
				{
					return newNumbers;
				}
				
				else
				{
					String[] string_store=new String[newNumbers.length];
					for(int i=0;i<newNumbers.length;i++)
					{
						string_store[i]=Integer.toString(newNumbers[i]);
						string_store[i]=new StringBuilder(string_store[i]).reverse().toString();
						newNumbers[i]=Integer.parseInt(string_store[i]);
						
					}
					Arrays.sort(newNumbers);
					return newNumbers;
					
					
				}
				
			}

private boolean isEmpty(int[] newNumbers) 
{
	if(newNumbers.length==0)
				{
					return true;
				}
				return false;
				
			}
}


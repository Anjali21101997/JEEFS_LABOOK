package com.cg.LAB2;
/**
 * Find the second smallest number in the array
 *
 */
public class SecondSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getSecondSmallest(int[] newNumber) {
		int len=newNumber.length;
		if(len==0)
		{
			return 0;
		}
		else if(len==1)
		{
			return newNumber[0];
		}
		else 
		{
			int temp;
			for(int i=0;i<len;i++)
			{
				for(int j=i+1;j<len;j++)
				{
					if(newNumber[i]>newNumber[j])
					{
						temp=newNumber[i];
						newNumber[i]=newNumber[j];
						newNumber[j]=temp;
					}
				}
			}
			
			return newNumber[1];
		}
		
	}
}
	



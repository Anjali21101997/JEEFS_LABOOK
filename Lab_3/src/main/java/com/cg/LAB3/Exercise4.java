package com.cg.LAB3;
/**
 *Create a method that accepts a number and modifies it such that the each of the digit in 
 *the newly formed number is equal to the difference between two consecutive digits in the original number.
 * The digit in the units place can be left as it is. 
 */
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int output=modifyNumber(number);
		System.out.println(output);
}

	private static int modifyNumber(int number) {
		String str=String.valueOf(number);
		char[] ch=str.toCharArray();
		int[] arr1=new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			arr1[i]=Integer.parseInt(String.valueOf(ch[i]));
		}
		int len=arr1.length;
		int num=arr1[0];
		for(int i=0;i<len-1;i++)
		{
			arr1[i]=Math.abs(arr1[i]-arr1[i+1]);
				
		}
		arr1[len-1]=Math.abs(arr1[len-1]-num);
		StringBuilder sb=new StringBuilder();
		for(int n: arr1)
		{
			sb.append(n);
		}
		int result=Integer.parseInt(sb.toString());
		return result;
	}

}

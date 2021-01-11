package com.cg.LAB3;
/**
 *Create a method which accepts a String and 
 *replaces all the consonants in the String
 * with the next alphabet
 */

import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input=sc.nextLine();
		String result=alterString(input);
		System.out.println(result);
		}

	private static String alterString(String input) {
		char[] ch=input.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(isConsonant(ch[i]))
			{
				ch[i]=(char) (ch[i]+1);
			}
			else
			{
				ch[i]=ch[i];
			}
				
		}
		return String.valueOf(ch);
		

}

	private static boolean isConsonant(char ch) {
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
		  return false;
		}
		return true;
	}
}

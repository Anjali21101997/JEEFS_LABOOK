package com.cg.LAB3;
/**
 *Create a class containing a method to create the mirror image of a String. 
 *The method should return the two Strings separated with a pipe(|) 
 */

import java.util.Scanner;


public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the string: ");
		String input=sc.nextLine();
		System.out.println(input+"|"+getImage(input));
}

	private static String getImage(String input) {
		StringBuffer result= new StringBuffer(input);
		result.reverse();
		return result.toString();
	}

}

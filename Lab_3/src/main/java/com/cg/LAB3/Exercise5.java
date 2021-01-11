package com.cg.LAB3;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Exercise5 {

	public static void main(String[] args) {
		File file = new File("C:\Users\Anjali\Desktop");
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line;  int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
        int paragraphCount = 1; 
        int whitespaceCount = 0; 
        while((line = reader.readLine()) != null) 
        { 
            if(line.equals("")) 
            { 
                paragraphCount++; 
            } else { 
                characterCount += line.length();  
                String[] wordList = line.split("\\s+"); 
                countWord += wordList.length; 
                whitespaceCount += countWord -1; 

	}
            String[] sentenceList = line.split("[!?.:]+"); 
            
            sentenceCount += sentenceList.length; 
        } 
    System.out.println("Total word count = " + countWord); 
    System.out.println("Total number of sentences = " + sentenceCount); 
    System.out.println("Total number of characters = " + characterCount); 
    System.out.println("Number of paragraphs = " + paragraphCount); 
    System.out.println("Total number of whitespaces = " + whitespaceCount); 

}
}

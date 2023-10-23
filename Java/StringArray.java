//Blake Raphael
//StringArray.java
//To perform various tasks on strings in an array

import java.util.*;

public class StringArray{
	
	public static void main(String [] args){
		
		//creating and initializing variables for the loops and array to use
		int numStrings;
		int i = 0;
		int longString = 0;
		int shortString = 0;
		int firstString = 0;
		String tempStr;
		
		//creating the array stringArray
		String [] stringArray;
		
		//creating a new scanner to read in user input
		Scanner reader = new Scanner(System.in);
		
		//prompting the user to input the amount of strings to input
		System.out.print("How many strings would you like to enter? ");
		numStrings = reader.nextInt();
		reader.nextLine();
		
		//setting the stringArray length to the number of strings the user wants to enter
		stringArray = new String[numStrings];
		
		//prompting the user to enter the strings
		System.out.println("Please enter your strings: ");
		
		//for loop that takes the user input and puts them into the array
		for (i = 0; i < stringArray.length; i++){
			
			//outputting which string is currently being taken
			System.out.println("String " + (i + 1));
			stringArray[i] = reader.nextLine();
			
		}
		
		//for loop that compares the strings and gives the location of the string that comes first in alphabetical order
		for (i = 0; i < stringArray.length - 1; i++){
			
			if(stringArray[i].compareToIgnoreCase(stringArray[i+1]) <= -1){
				
				//giving the location of the string that comes first in alphabetical order
				firstString = i;
			
			}				
		}
		
		//for loop that compares the lengths of the strings and gives the location of the shortest one
		for (i = 0; i < stringArray.length - 1; i++){
			
			if(stringArray[i].length() < stringArray[i+1].length()){
				
				shortString = i;
			
			}				
		}
		
		//for loop that compares the lengths of the strings and gives the location of the longest one
		for (i = 0; i < stringArray.length - 1; i++){
			
			if(stringArray[i].length() > stringArray[i+1].length()){
				
				longString = i;
			
			}
				
				
		}
		
		//outputting meaningfully the strings and their locations of the longest, shortest, and first in alphabetical order	respectively
		System.out.println("The longest string is: " + stringArray[longString] + " at index position: " + longString);
		
		System.out.println("The shortest string is: " + stringArray[shortString] + " at index position: " + shortString);
		
		System.out.println("The string that comes first in alphabetical order is: " + stringArray[firstString] + " at index position: " + firstString);
		
	}
}
//Blake Raphael
//CharCount.java
//The purpose of this program is to

import java.util.*;

public class CharCount{
	
	public static void main(String [] args){
		
		//declaring variables to be used in sorting and conting 
		char holder;
		String userInput;
		boolean repeat = false;
		
		//creating the character ArrayList and number of counts ArrayList
		ArrayList <Character> charOccur = new ArrayList <Character> ();
		ArrayList <Integer> numOccur = new ArrayList <Integer> ();
		
		//creating a scanner
		Scanner reader = new Scanner(System.in);
		
		//prompting the user for a sentence, word, or paragraph and reading into a string variable
		System.out.print("Please enter a sentence, word, or paragraph: \n");
		userInput = reader.nextLine();
		
		//forcing the string to lower case
		userInput.toLowerCase();
		
		//filling the number of occurances with the length of the user input
		for (int i = 0; i < userInput.length(); i++){
			
			numOccur.add(i, 1);
			
		}
		
		//using a for loop to put the individual characters of the input string into an ArrayList then sorting them
		for (int i = 0; i < userInput.length(); i++){
		
			charOccur.add(new Character(userInput.charAt(i)));
			
			//using a bubble sort to check each element against the next to sort the chars in alphabetical order	
			for(int j = 0; j < charOccur.size(); j++){
				
				if(charOccur.get(j) > charOccur.get(i)){
					
					holder = charOccur.get(i);
					charOccur.set(i, charOccur.get(j));
					charOccur.set(j, holder);
					
				}

			}
			
		}
		
		//using another loop to check for repeats and remove the duplicates
		for(int i = 0; i < charOccur.size(); i++){
			
			//removing duplicates and adding to the occurance count
			if(i != charOccur.size() - 1 && charOccur.get(i).equals(charOccur.get(i + 1))){
					
				charOccur.remove(i + 1);
				numOccur.set(i, numOccur.get(i).intValue() + 1);
				i--;
					
			}
		}
		
		//outputting all the characters and their counts in a meaningful way using a for loop
		System.out.println("Here are the outputs of the characters and their instance counts (Blank at the top equals a space): \n");
		for(int i = 0; i < charOccur.size(); i++){
			
			System.out.println("The number of instances of " + charOccur.get(i) + " is: " + numOccur.get(i));
			
		}	
		
	}
	
}
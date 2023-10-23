//Blake Raphael
//MultDrill.java
//The purpose of this program is to act as a study tool for students learning basic multiplication tables

//importing the java utilities
import java.util.*;

//creating the MultDrill class
public class MultDrill{

	//initializing main
	public static void main(String [] args){
		
		//declaring and initializing variables
		String adverb1 = "HORRIBLY";
		String adverb2 = "POORLY";
		String adverb3 = "DISGUSTINGLY";
		int multOne;
		int multTwo;
		int userInput;
		int multAns;
		int strChoice;
		int numCorrect = 0;
		int differenceFrom;
		double percentCorrect = 0.0;
		
		//initializing a new scanner
		Scanner reader = new Scanner(System.in);
		
		//outputting to the user the multiplication practice drill prompt
		System.out.print("Welcome to Multiplication Practice Drills!\n\n\n\n");
		
		//for loop that checks if iterations are under ten or the percentage is less than 0.90 to stay in the loop
		for(int i = 1; i <= 10 || percentCorrect <= 0.90; i++){
			
			//giving two random numbers 0-10 for the user to multiply by
			multOne = (int) (Math.random() * 10);
			multTwo = (int) (Math.random() * 10);
			
			//initializing an answer variable to check with the user input
			multAns = multOne * multTwo;
			
			//pormpting the user to answer the multiplication 
			System.out.print("\n\nWhat is " + multOne + " x " + multTwo + "? ");
			
			//reading in the user input
			userInput = reader.nextInt();
			
			//getting the absolute valuse of the difference between the user's answer and the real answer
			differenceFrom = Math.abs(userInput - multAns);
			
			//first if statement checks if the user input is equal to the real answer, increases the number correct, and calls the response method
			if(userInput == multAns){
				response();
				numCorrect++;
			}
			
			//else if statement checks if the difference from variable is less than or equal to three and calls the response method,
			//sending the differenceFrom variable to it
			else if (differenceFrom <= 3) {
				response(differenceFrom);
			}
			
			//else statement covers every difference from that is greater than 3 and chooses randomly from 3 strings to send to the repsonse function.
			else {
				
				//strChoice variable is a random 1-3 number that chooses the adverb to use
				strChoice = (int) (Math.random() * 3) + 1;
				
				//if statements check the value of strChoice and sends the corresponding adverb and the differenceFrom variable to the response method
				if (strChoice == 1){
					response(adverb1, differenceFrom);
				}
				if (strChoice == 2){
					response(adverb2, differenceFrom);
				}
				if (strChoice == 3){
					response(adverb3, differenceFrom);
				}
			}
			
			//at the end of the loop, this equation updates the percent correct (number correct over iterations)
			percentCorrect = (double) numCorrect /  (double) i;
			
			//outputting to the user the total questions they have gotten correct, questions answered, and percent correct
			System.out.println("\n\nTotal questions correct: " + numCorrect);
			System.out.println("Total questions answered: " + i);
			System.out.println("Percent correct: " + percentCorrect * 100 + " %\n\n");
			
		}
	}
	
	//this response method is called when the user gets the answer correct (in the first "if" statemnent in main)
	static void response(){
		
		//outputting the correct answer string
		System.out.println("You got the answer correct!");
	}
	
	//second response method is called when the user has a difference from the answer less than or equal to 3, sending the differenceFrom variable from main
	static void response(int differenceFrom){
		
		//outputting the users differenceFrom variable with a meaningful output
		System.out.println("You are " + differenceFrom + " away from the correct answer, so close!");
	}
	
	//third response method is for when the user is more than 3 away from the correct answer, this method is sent a string (adverb) and the differenceFrom variable
	static void response(String adverb, int differenceFrom){
		
		//meaningfully outputting to the user how badly they were wrong and how many away from the real answer they are
		System.out.println ("You are " + adverb + " wrong! You were " + differenceFrom + " away from the real answer!");
	}	
}
//Java Update? Ain't nobody got time for that!
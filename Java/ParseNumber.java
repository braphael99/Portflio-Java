//Blake Raphael
//ParseNumber.java
//The purpose of this program is to seperate a number into its individual digits (components)

//importing the java utility files
import java.util.*;

//declaring the ParseNumber public class
public class ParseNumber{
	
	//initializing main
	public static void main(String [] args){
		
		//declaring variables for user input, number to divide by, and the displayed number
		int userInput;
		int diviNum = 10000;
		int dispNum;
		
		//declaring and initializing the new scanner to get the user's number
		Scanner reader = new Scanner (System.in);
		
		//prompting the user for a five digit number to start calculations
		System.out.print("Please enter a five digit number (ex: 10,000 - 99,000):\t");
		
		//initializing the userInput variable to the user's number
		userInput = reader.nextInt();
		
		//outputting the users number and the individual digits
		System.out.print("Your number - " + userInput + " - broken into individual digits is ");
		
		//starting the for loop to run 5 times (for a five digit number)
		for(int i = 1; i <= 5; i++){
			
			//dividing the display number by the division calculator number
			dispNum = userInput / diviNum;
			
			//using modulo to hold on to the rest of the numbers after "truncating" the previous digit
			userInput = userInput % diviNum;
			
			//dividing the division calculator number by ten to reach the next digit
			diviNum /= 10;
			
			//printing out the current digit for the current iteration
			System.out.print(dispNum + "   ");	
		}
	}
}
//Q: Why do Java developers wear glasses?
//A: Because they don't C#!!
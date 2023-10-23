//Blake Raphael
//Gardiner G3
//The purpose of this program is to use an ArrayList to store and ordered collection of user-supplied integers

import java.util.*;

public class IntListInsert{
	
	public static void main(String [] args){
		
		//initializing the orderInt ArrayList
		ArrayList <Integer> orderInt = new ArrayList <Integer>();
		
		//creating a scanner
		Scanner reader = new Scanner(System.in);
		
		//declaring variables for the user inputs and sequential searches
		int userNums = 0;
		int inputNum = 0;
		int foundPos = -1;
		boolean repeat = false;
		
		//prompting the user for the numbers they would like to input
		System.out.println("How many numbers would you like to input?");
		userNums = reader.nextInt();
		
		//iterating through the loop for how many times the user wants to input numbers
		for(int i = 0; i < userNums; i++){
			
			//reading in the user inputs
			System.out.print("\n\nPlease enter the next number, current interation is " + (i + 1) + " : ");
			inputNum = reader.nextInt();
			
			//checking if this number is a repeat
			for(int k = 0; k < orderInt.size(); k++){
				
				if(orderInt.get(k).intValue() == inputNum){
					
					repeat = true;
				}	
				
			}
				
				//if this is the first iteration, input this number into the ArrayList
				if(i == 0){
				
					orderInt.add(new Integer(inputNum));
				
				}
				
				//else check what position the number should be input
				else if(repeat == false){
					
				//checking for insert position by using a sequential search and if statements
					for (int j = 0; j < orderInt.size(); j++){
				
						if(inputNum != orderInt.get(j)){
				
							if(orderInt.get(j) < inputNum){
				
								foundPos = j;
							}
						}	
				
				}

					//if a found position was not found, add the number to the beginning of the list
					if (foundPos == -1){
			
						orderInt.add(0, new Integer(inputNum));
				
					}
					
					//if a position was found, add the number to the position right behind it
					else{
				
						orderInt.add(foundPos + 1, new Integer(inputNum));
					}
				}
				
			//resetting the variables
			repeat = false;
			foundPos = -1;
		}
		
		System.out.print("\n\nHere is your final output: \n");
		
		//printing out the final ArrayList
		for (int out = 0; out < orderInt.size(); out++){
			
			System.out.print("\t" + orderInt.get(out));
		}
		
	}
}
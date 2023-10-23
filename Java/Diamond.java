//Blake Raphael
//Diamond.java
//The purpose of this program is to print a diamond shape using nested loops

import java.util.*;

//creating the Diamond class
public class Diamond{
	
	//initializing main
	public static void main(String [] args){
	
	//This is the for loop that creates the top half of the diamond	
	for(int i = 0; i <= 8; i++){
		
		//as long as the iteration is even, a new line will be printed
			 if(i%2 == 0){
			 	System.out.print("\n");
			 }
			
			//This for loop prints the spacing needed to structure the diamond away from the edge of the output window
			for(int j = 8; j >= i; j--){
				
					System.out.print(" ");
				}
				
				//this for loop prints the asterisks and the space between each individual
				for (int k = 0; k <= i; k++){
					
					//as long as the iteration is even, an asterisk and its accompanying spacing are printed
					if (i%2 == 0){
						System.out.print("*");
						System.out.print(" ");
					}
				}
		
			}
	
	//this for loop creates the bottom half of the diamond		
	for(int i = 0; i <= 8; i++){
			
			//as long as the iteration is even, a new line will be printed
			if(i%2 == 0){
				
				System.out.print("\n ");
			}
			
			//this for loop again structures the diamond by spacing
			//the asterisks away from the edge of the output window
			for(int j = 0; j <= i; j++){
				 	
				 	System.out.print(" ");

				}
				
				//this for loop prints the appropriate amount of asterisks to finish the bottom half of the diamond
				for (int k = 6; k >= i; k--){
					
					//as long as the iteration is even, an asterisk and its accompanying spacing are printed
					if (i%2 == 0){
						System.out.print(" ");
						System.out.print("*");
						
						
					}
				}
		
			}	
		}
			
	}
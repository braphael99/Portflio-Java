//Blake Raphael
//BeanbagTossGame.java
//The purpose of this game is to let the player toss a beanbag onto a board for points

import java.util.*;

//beanbag toss class
class Beanbag{
	
	//instance variables for column, row, value, and activation
	private int myRow, myCol, myVal;
	private boolean activated;
	
	//default constructor for beanbag
	public Beanbag(){
		
		myRow = myCol = myVal = 0;
		activated = false;
		
	}
	
	//constructor that accepts row, cloumn, and value
	public Beanbag(int incRow, int incCol, int incVal){
		
		myRow = incRow;
		myCol = incCol;
		myVal = incVal;
		activated = false;
		
	}
	
	//get value method returns the value
	public int getValue(){
		
		return myVal;
		
	}
	
	//method to change the activation of a hit beanbag
	public void hitBeanbag(){
		
		activated = true;
		
	}
	
	//method that checks activations of beanbags
	public boolean isActivated(){
		
		return activated;
		
	}
}

//main class
public class BeanbagTossGame{
	
	//main method
	public static void main(String [] args){
		
		//variables for activation, row, column, toss number, score (total value), and selection
		boolean activation;
		int randRow = 0;
		int randCol = 0;
		int toss = 0;
		int valSum = 0;
		String selection = " ";
		
		//creating a new scanner
		Scanner reader = new Scanner(System.in);
		
		//creating the game board called bag matrix
		Beanbag[][] bagMatrix = new Beanbag[5][5];
		
		//traversing the matrix to fill with values and beanbags
		for (int row = 0; row <= 4; row++){
			
			for(int col = 0; col <= 4; col++){
				
				//checking the first and last rows to input the value of 1
				if (row == 0 || row == 4){
				
					bagMatrix[row][col] = new Beanbag(row, col, 1);
				
				}
				
				//checking the 2nd and 2nd to last rowsand the outer columns to input the value of 1
				else if (row == 1 && (col == 0 || col == 4) || row == 3 && (col == 0 || col == 4)){
					
					bagMatrix[row][col] = new Beanbag(row, col, 1);
					
				}
				
				//checking the last row and outer columns to input the value of 1
				else if (row == 2 && (col == 0 || col == 4)){
					
					bagMatrix[row][col] = new Beanbag(row, col, 1);
					
				}
				
				//checking the 2nd and 2nd to last rows and inputting the value of 2 for the inner columns
				else if (row == 1 && (col == 1 || col == 2 || col == 3) || row == 3 && (col == 1 || col == 2 || col ==3)){
					
					bagMatrix[row][col] = new Beanbag(row, col, 2);
					
				}
				
				//checking the middle row and 2nd and 2nd to last columns to input the value of 2
				else if(row == 2 && (col == 1 || col == 3)){
					
					bagMatrix[row][col] = new Beanbag(row, col, 2);
					
				}
				
				//inputting the last element to a value of 3
				else{
					
					bagMatrix[row][col] = new Beanbag(row, col, 3);
					
				}
			}
		}
		
		//outputting the initial game board using nested for loops
		System.out.print("Here is the game board: \n\n");
		
		for(int row = 0; row <= 4; row++){
			
			for(int col = 0; col <= 4; col++){
				
				System.out.print(bagMatrix[row][col].getValue() + "\t");
				
				if(col == 4){
					
					System.out.print("\n");
					
				}
			}
		}
		
		//using a while loop for the menu
		while(!selection.equals("q") && !selection.equals("Q")){
			
			//allowing the user to choose input
			System.out.print("\n\nPlease press the 'T' key to toss a beanbag or 'Q'to quit\n\n");
			
			selection = reader.nextLine();
			
			//checking the selection input
			if(selection.equals("t") || selection.equals("T")){
				
				randRow = (int)(Math.random() * 4);
				randCol = (int)(Math.random() * 4);
				
				toss++;
				
				//checking if the tossed element is activated
				if(bagMatrix[randRow][randCol].isActivated() == false){
					
					//if not activated then outputting a hit and adding the value to the score then changing the bag to activated
					System.out.print("\nHit at (" + randRow + "," + randCol + ")\n");
					valSum += bagMatrix[randRow][randCol].getValue();
					bagMatrix[randRow][randCol].hitBeanbag();
					
				}
				
				//outputting the game board  for each time a toss is made
				for(int row = 0; row <= 4; row++){
			
					for(int col = 0; col <= 4; col++){
						
						//if a bag is activated, outputting a "B"
						if(bagMatrix[row][col].isActivated() == true){
							
							System.out.print("B\t");
						}
						
						else{
							
							//else the bag's value is output in the board
							System.out.print(bagMatrix[row][col].getValue() + "\t");
						
						}
					if(col == 4){
					
						System.out.print("\n");
					
						}
					}
				}
				
			}
		}
		
		//printing out the total score and total tosses once the user quits
		System.out.print("\n\nTotal Score: " + valSum + "\nTotal Tosses: " + toss);
	}
}
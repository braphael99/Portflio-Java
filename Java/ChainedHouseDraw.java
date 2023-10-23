//Blake Raphael
//HouseDrawTest.java
//The purpose of this program is to draw a house based on the user input

import java.util.*;
import TurtleGraphics.*;

//HouseDraw class
class HouseDraw{
	
	//declaring the instance variables
	private Pen drawPen;
	private double xPosition, yPosition;
	private String houseSize;
	
	//default constructor for a new house
	HouseDraw(){
		
		xPosition = -1000;
		yPosition = -1000;
		houseSize = "small";
		drawPen = new RainbowPen();
		
	}
	
	//new HouseDraw constructor that takes an incoming house size
	public HouseDraw(String incHouseSize){
		
		//initializing the instance variables to default and user inputs
		this (-300, -300, incHouseSize);
		drawPen = new RainbowPen();
	}
	
	//HouseDraw constructor that takes incoming x and y position 
	public HouseDraw(int incXPos, int incYPos){
		
		//initializing the instance variables to default and user inputs
		this(incXPos, incYPos, "small");
		drawPen = new RainbowPen();
	}
	
	//copy constructor that takes an incoming house as the parameters
	public HouseDraw(HouseDraw incHouse){
		
		//filling the instance variables with the parameters from the copied house
		this(incHouse.getXPos(), incHouse.getYPos(), incHouse.getSize());
		drawPen = new RainbowPen();
		
	}
	
	//method to set the house size after the house has been created
	public void setHouseSize(String incHouseSize) {
		if (incHouseSize.equalsIgnoreCase("small") || incHouseSize.equalsIgnoreCase("medium") || incHouseSize.equalsIgnoreCase("large")){
			houseSize = incHouseSize;
		}
		else{
			houseSize = "small";	
		}

	}
	
	//method to set the house xPosition
	public void setHouseXPos(int incXPos){
		
		//setting and moving the pen to the new x position
		xPosition = incXPos;
		drawPen.up();
		drawPen.move(xPosition, yPosition);
	}
	
	//method to change the house y position
	public void setHouseYPos(int incYPos){
		
		//setting and moving the pen to the new y position
		yPosition = incYPos;
		drawPen.up();
		drawPen.move(xPosition, yPosition);
	}
	
	//method to return the house's x position
	public double getXPos(){
		
		return xPosition;
	}
	
	//method to return the house's y position
	public double getYPos(){
		
		return yPosition;
	}
	
	//method to return the house's size
	public String getSize(){
		
		return houseSize;
	}
	
	//draw method that moves the pen, checks house size, then calls the appropriate drawPerimeter and drawRoof methods
	public void draw(){
		
		drawPen.up();
		drawPen.move(xPosition, yPosition);
		
		//drawing a small house using hard coded parameters
		if(houseSize == "small" || houseSize == "Small"){
			drawPerimeter(-100);
			drawRoof(-70);
		}
		
		//drawing a medium sized house using the hard coded parameters
		if(houseSize == "medium" || houseSize == "Medium"){
			drawPerimeter(-300);
			drawRoof(-210);
		}
		
		//drawing the large house based on the hard coded parameters
		if(houseSize == "large" || houseSize == "Large"){
			drawPerimeter(-500);
			drawRoof(-350);
		}
		
	}
	
	//method to draw the base (perimeter) of the house
	private void drawPerimeter(int incSideLength){
		
		//moving the pen the side length, turning 90 degrees, drawing another side, turning 90 degrees and drawing the final side
		drawPen.down();
		drawPen.move(Math.abs(incSideLength));
		drawPen.turn(90);
		drawPen.move(Math.abs(incSideLength));
		drawPen.turn(-90);
		drawPen.move(incSideLength);
		drawPen.up();
		drawPen.move(Math.abs(incSideLength));
	}
	
	//method to draw the roof of the house
	private void drawRoof(int incRoofLength){
		
		//angling at a good direction, drawing, turning 90 degrees, then drawing the rest of the roof
		drawPen.down();
		drawPen.turn(135);
		drawPen.move(incRoofLength);
		drawPen.turn(90);
		drawPen.move(Math.abs(incRoofLength));
		
		
	}
	
	//toString method to concatenate the data of the house
	public String toString(){
		
		return "House data: X position: " + xPosition + "Y position: " + yPosition + "Size: " + houseSize;
	}
}

//HouseDrawTest class
public class HouseDrawTest{
	
	//starting main
	public static void main(String [] args){
		
		//declaring the variables to be used in main
		double xPos, yPos;
		int sizeSelector, userSelection = 0;
		String houseDrawSize;
		
		//initializing a new scanner to read input
		Scanner reader = new Scanner(System.in);
		
		//while loop that provides the user a menu to select the house they would like to create
		while(userSelection < 5){
			
			//outputting thr menu and waiting for the input
			System.out.print("Please choose what type of house you would like:\n\n1.) Default House\n\n2.) Size Selection House\n\n3.) Position Selection House\n\n4.) Copy a Previous House\n\n5.) Quit\n");
			userSelection = reader.nextInt();
			
			//default house selection
			if (userSelection == 1){
				
				//creating and drawing a default house
				HouseDraw myHouse = new HouseDraw();
				myHouse.draw();
			}
			
			//selecting the house size
			if(userSelection == 2){
				
				//allowing the user to select 1, 2, or 3 for small, medium, or large houses
				System.out.print("Please enter the size of your house as one of the following: 1 = Small, 2 = Medium, or 3 = Large: ");	
				
				sizeSelector = reader.nextInt();
				
				//creating and drawing a small house
				if(sizeSelector == 1){
					HouseDraw sizeSelectHouse = new HouseDraw("small");
					sizeSelectHouse.draw();
				}
				
				//creating and drawing a medium house
				else if (sizeSelector == 2){
					HouseDraw sizeSelectHouse = new HouseDraw("medium");
					sizeSelectHouse.draw();	
				}
				
				//creating and drawing a large house
				else if (sizeSelector == 3){
					HouseDraw sizeSelectHouse = new HouseDraw("large");
					sizeSelectHouse.draw();
				}
				
				//creating a small house as the default house
				else{
					HouseDraw sizeSelectHouse = new HouseDraw("small");
					sizeSelectHouse.draw();
				}
				

			//choosing the x and y position of the house	
			}
			if (userSelection == 3){
				
				//prompting the user for the x and y position they would like the house at
				//then sending the responses to the constructor
				System.out.print("\nPlease choose the x and y position you would like the house at:\n");
				System.out.print("X position: ");
				xPos = reader.nextDouble();
				System.out.print("Y position: ");
				yPos = reader.nextDouble();
				
				//creating and drawing the position selected house
				HouseDraw positionSelectHouse = new HouseDraw(xPos, yPos);
				positionSelectHouse.draw();
			}
			
			//copied house
			if (userSelection == 4){
				
				//creating a new default house
				HouseDraw defaultHouse = new HouseDraw();
				
				//checking a default house is real, then copying and drawing the default house
				if (defaultHouse != null){
					HouseDraw copiedHouse = new HouseDraw(defaultHouse);
					copiedHouse.draw();
				}
				
				//if the default house is not initialized then the copy constructor will not run
				else{
					System.out.print("Please initialize a default house.");
				}
				
				//letting the user know the house has been copied
				System.out.print("Copied House.");
				
			}
		}
		
	}
}
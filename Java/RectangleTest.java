//Blake Raphael
//RectangleTest.java
//The purpose of this program is to write a rectangle class then test the class in main

import java.util.*;

//initializing the Rect class
class Rect{
	
	//declaring the side1, side2, area, and perimeter instance variable
	private int side1, side2, area, perimeter;
	
	//the base constructor for a new Rect
	Rect(){
		
		side1 = side2 = area = perimeter = 0;
		
	}
	
	//this method sets the first side from the incoming side
	public void setSide1(int incSide){
		side1 = incSide;
	}
	
	//this method sets the second side from the next incoming side
	public void setSide2(int incSide){
		side2 = incSide;
	}
	
	//this method calculates the area by multiplying side1 and side2
	public int getArea(){
		area = side1 * side2;
		return area;
	}
	
	//this method calculates the perimeter by adding side1 and side1 to side2 and side2
	public int getPerimeter(){
		perimeter = side1 + side1 + side2 + side2;
		return perimeter;
	}
	
	//this method checks if the rectangle is a square by seeing if both sides are equal
	public boolean isSquare(){
		if (side1 == side2){
			return true;
		}
		else {
			return false;
		}
	}
	
	//this is the toString method that outputs all the data of the rectangle meaningfully 
	public String toString(){
		
		return "Rectangle data:\nSide 1:\t" + side1 + "\nSide 2:\t" + side2 + "\nArea:\t" + area + "\nPerimeter:\t" + perimeter; 
	}
}

//this is the rectangle test class
public class RectangleTest{
	
	//initializing main
	public static void main(String [] Args){
		
		//declaring and initializing the variables being used by main to output the rectangle information
		int incSide = 0;
		int rectArea = 0; 
		int rectPerimeter = 0;
		
		//instanciating a new recatngle
		Rect myRectangle = new Rect();
		
		//creating a new scanner
		Scanner reader = new Scanner(System.in);
		
		//prompting the user meaningfully to enter the first side of the rectangle
		//then sending the userinput to the setSide1 method
		System.out.print("Please enter the value for the first side of the rectangle: ");
		incSide = reader.nextInt();
		myRectangle.setSide1(incSide);
		
		
		//prompting the user meaningfully to enter the second side of the rectangle
		//then sending the userinput to the setSide2 method
		System.out.print("\nPlease enter the value for the second side of the rectangle: ");
		incSide = reader.nextInt();
		myRectangle.setSide2(incSide);
		
		//dumping the area of the rectangle into a variable main can use
		rectArea = myRectangle.getArea();
		
		//dumping the perimeter of the rectangle into a variable main can use
		rectPerimeter = myRectangle.getPerimeter();
		
		//meaningfully outputting the area and perimeter of the rectangle from the variables used earlier
		System.out.print("\nThe area of your rectangle is: " + rectArea);
		System.out.print("\nThe perimeter of your rectangle is: " + rectPerimeter);
		
		//using the isSquare method to check if the rectangle is a square 
		//then outputting the information meaningfully
		if (myRectangle.isSquare() == true){
			System.out.print("\nYour rectangle is a square!");
		}
		
		//using the isSquare method to check if the rectangle is a square 
		//then outputting the information meaningfully
		if (myRectangle.isSquare() == false){
			System.out.print("\nYour rectangle is NOT a square!");
		}
		
		//outputting the toString method to check all of the data in one place of the rectangle
		System.out.print("\n\n" + myRectangle);
		
	}
}
//got a new error...progress!
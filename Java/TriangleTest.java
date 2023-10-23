//Blake Raphael
//TriangleTest.java
//The purpose of this program is to model a triangle's states and behaviors

import java.util.*;

//the triangle class
class Triangle{
	
	//the instance variables for the sides and angles of the triangle
	private int sideA, sideB, sideC;
	private double angleA, angleB, angleC;
	
	//default constructor for traingle sets all sides and angles to 0
	public Triangle(){
		
		sideA = sideB = sideC = 0;
		angleA = angleB = angleC = 0.0;
	}
	
	//this constructor accepts angles as a parameter and sets all the angles equal to the incoming angles
	public Triangle(double incAngleA, double incAngleB, double incAngleC){
		
		angleA = incAngleA;
		angleB = incAngleB;
		angleC = incAngleC;
		
		//all sides set to 0
		sideA = sideB = sideC = 0;
		
	}
	
	//this constructor accepts sides as a parameter and sets all sides accordingly
	public Triangle(int incSideA, int incSideB, int incSideC){
		
		sideA = incSideA;
		sideB = incSideB;
		sideC = incSideC;
		
		//all angles are set to 0
		angleA = angleB = angleC = 0.0;
	}
	
	//this method checks if the triangles are equilateral
	public boolean isEquilateral(){
		
		//this if statement checks the sides to create a true equilateral triangle
		if (sideA == sideB && sideA == sideC && sideC == sideB){
			
			return true;
		}
		
		//this else if checks if all angles are equal to 60 to get an equilateral triangle
		else if (angleA == 60.0 && angleC == 60.0 && angleB == 60.0){
			
			return true;
		}
		
		//if none of the above are true, false is returned
		else{
			return false;
		}
	}
	
	//this method checks if the triangle is scalene
	public boolean isScalene(){
		
		//this if statement checks if all sides are not equal to another side
		if (sideA != sideB && sideA != sideC && sideC != sideB){
			
			return true;
		}
		
		//this else if checks if all angles are not equal to another angle
		else if (angleA != angleB && angleA != angleC && angleC != angleB){
			
			return true;
		}
		
		//if the other checks fail, false is returned
		else{
			return false;
		}
	}
	
	//this method checks if the triangle is a right triangle
	public boolean isRight(){
		
		//if angleC is 90 degrees, then true is returned
		if(angleC == 90.0){
			
			return true;
		}
		
		//if no angles are 90 or any other than C is 90, then false is returned
		else{
			return false;
		}
	}
	
	//this is the toString methid that returns the data of the triangles in a meaningful manner
	public String toString(){
		
		return "Side A: " + sideA + "\tSide B: " + sideB + "\tSide C: " + sideC + "\nAngle A: " + angleA + "\tAngle B: " +angleB + "\tAngle C: " + angleC;
	}
}

//TriangleTest class
public class TriangleTest{
	
	//main
	public static void main(String [] args){
		
		//creating side and angle variables to send to the triangle class
		//along with a user selection variable to help with menus
		int side1, side2, side3, userSelection = 0;
		double angle1, angle2, angle3;
		
		//creating a new scanner
		Scanner reader = new Scanner(System.in);
		
		//creating and setting 3 triangles to null, so the user can edit them
		Triangle sidesTriangle = null;
		Triangle anglesTriangle = null;
		Triangle defaultTriangle = null;
		
		//prompting the user if they would like to create a triangle with sides input or angles input
		System.out.print("\nWould you like to create your new triangle with sides (Choose 1) or angles (Choose 2)? ");
		userSelection = reader.nextInt();
		
		//selecting 1 takes the user to the aide creation
		if(userSelection == 1){
			
			//prompting the user to input all three sides, A,B, and C
			System.out.print("\nPlease input Side A, Side B, and Side C of your triangle: ");
			System.out.print("\nSide A: ");
			side1 = reader.nextInt();
			System.out.print("\nSide B: ");
			side2 = reader.nextInt();
			System.out.print("\nSide C: ");
			side3 = reader.nextInt();
			
			//creating the sides triangle with the sides the user input
			sidesTriangle = new Triangle(side1, side2, side3);
		}
		
		//if the selection is 2, the angles are input for the triangle
		else if (userSelection == 2){
			
			//prompting the user to input all three angles, A,B, andC
			System.out.print("\nPlease input Angle A, Angle B, and Angle C of your triangle (Please note, if you want a true right triangle, please input the 90 degrees last): ");
			System.out.print("\nAngle A: ");
			angle1 = reader.nextDouble();
			System.out.print("\nAngle B: ");
			angle2 = reader.nextDouble();
			System.out.print("\nAngle C: ");
			angle3 = reader.nextDouble();
			
			//creating the angles triangle with all the users input angles
			anglesTriangle = new Triangle(angle1, angle2, angle3);
		}
		
		//if the user fails to choose 1 or 2, a default triangle is created
		else{
			
			//default constructor creating the default triangle
			defaultTriangle = new Triangle();
		}
		
		//setting the user selection back to 0
		userSelection = 0;
		
		//entering a loop that acts as our menu
		while (userSelection < 5){
			
			//prompting the user to choose which check they would like to perform, then reading it in
			System.out.print("\n\n1 - Check if equilateral \n2 - Check if Scalene \n3 - check if Right \n4 - Output all the triangle data \n5 - Quit\n\n");
			userSelection = reader.nextInt();
			
			//if the selection is 1, an equilateral check is performed
			if (userSelection == 1){
				
				//if the side input triangle is not null, then it runs through the checks
				if (sidesTriangle != null){
					
					//prints out if the triangle is equilateral or not based on the returned true or false
					if(sidesTriangle.isEquilateral() == true){
						System.out.print("\nThis triangle is equilateral");
					}
					else{
						System.out.print("\nThis triangle is not equilateral");
					}
				}
				
				//if the angle input triangle is not null, then it runs through the checks
				else if (anglesTriangle != null){
					
					//prints out if the triangle is equilateral or not based on the returned true or false
					if(anglesTriangle.isEquilateral() == true){
						System.out.print("\nThis triangle is equilateral");
					}
					else{
						System.out.print("\nThis triangle is not equilateral");
					}
				}
				
				//if the other triangles are null, then the default traingle is checked
				else{
					
					//prints out if the triangle is equilateral or not based on the returned true or false
					if(defaultTriangle.isEquilateral() == true){
						System.out.print("\nThis triangle is equilateral");
					}
					else{
						System.out.print("\nThis triangle is not equilateral");
					}
				}
			}
			
			//if the user selects 2 a check for scalene is performed
			if (userSelection == 2){
				
				//if the side input triangle is not null, then it runs through the checks
				if (sidesTriangle != null){
					
					//prints out if the triangle is equilateral or not based on the returned true or false
					if(sidesTriangle.isScalene() == true){
						System.out.print("\nThis triangle is scalene");
					}
					else{
						System.out.print("\nThis triangle is not scalene");
					}
				}
				
				//if the angle input triangle is not null, then it runs through the checks
				else if (anglesTriangle != null){
					
					//prints out if the triangle is equilateral or not based on the returned true or false
					if(anglesTriangle.isScalene() == true){
						System.out.print("\nThis triangle is scalene");
					}
					else{
						System.out.print("\nThis triangle is not scalene");
					}
				}
				
				//if the other triangles are null, then the default traingle is checked
				else{
					
					//prints out if the triangle is equilateral or not based on the returned true or false
					if(defaultTriangle.isScalene() == true){
						System.out.print("\nThis triangle is scalene");
					}
					else{
						System.out.print("\nThis triangle is not scalene");
					}
				}
			}
			
			//if the user selects 3, the right triangle is checked
			if (userSelection == 3){
				
				//since the sides triangle cannot be right, only the angles triangle is checked
				//if the angles triangle is not null and is right then the program prints out that the triangle is a right triangle.
				if (anglesTriangle != null && anglesTriangle.isRight() == true){
					
					System.out.print("\nThe triangle is a Right triangle");
				}
				
				//if the right triangle is not found, then the program output that there is not a right triangle
				else{
					System.out.print("\nThis is not a right triangle");
				}
			}
			
			//selection 4 prints all toStrings of the triangles
			if (userSelection == 4){
				
				//the if statements check if each triangle is not null, then prints each corresponding toString to the user
				//the data is concatenated in a meaningful way in the classes, and printed nicely for the user
				if (sidesTriangle != null){
					System.out.print("\n" + sidesTriangle.toString());
				}
				else if (anglesTriangle != null){
					System.out.print("\n" + anglesTriangle.toString());
				}
				else{
					System.out.print("\n" + defaultTriangle.toString());
				}
			}
		}
	}
}
//Don't mind me, just gotta get to CLASS on time :)
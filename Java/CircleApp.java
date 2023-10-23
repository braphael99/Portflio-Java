//Blake Raphael
//CircleApp.java
//The purpose of this program is to find the diameter, area, and circumference of a circle and output it to the user

import java.util.*;
import TurtleGraphics.*;

//starting the public CircleApp class
public class CircleApp{
	
	//initializing main
	public static void main(String[] args){
		
		//setting PI as a constant equal to 3.14159
		final double PI = 3.14159;
		
		//declaring the new scanner and calling it "reader"
		Scanner reader = new Scanner(System.in);
		
		//declaring the radius, circumference, and pen variable
		double circleRadius;
		double circleCircumference;
		Pen circlePen = new RainbowPen(); 
		
		//prompting the user to enter the radius of a circle they would like to draw
		System.out.print("Please enter the radius of a circle: ");
		circleRadius = reader.nextDouble();
		
		//dumping the circumference of the circle into the circleCircumference variable
		circleCircumference = 2 * PI * circleRadius;
		
		//outputting the diameter, area, and circumference to the user
		System.out.println("\n\nThe circle diameter is " + 2 * circleRadius);
		System.out.println("The circle area is " + PI *(circleRadius * circleRadius));
		System.out.println("The circle circumference is " + circleCircumference);
		
		//placing the pen down on the drawing surface
		circlePen.down();
		
		//the for loop calculating the times and degrees the pen moves to draw the circle
		for(int i = 1; i <= 100; i++){
			//moving the pen 1% the distance of the circumference
			circlePen.move(circleCircumference / 100);
			//ruening the pen 3.6 degrees to create a 100 sided polygon aka our circle
			circlePen.turn(3.6);
		}	
	}
}
//Java code not working...the struggle is real (? ???)? ? ???
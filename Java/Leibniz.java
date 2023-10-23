//Blake Raphael
//Leibniz.java
//The purpose of this program is to calculate PI to the nearest iteration the user wants

//improting the java utility files
import java.util.*;

//declaring the Leibniz class
public class Leibniz{
	
	//initializing main
	public static void main(String [] args){
		
		//decalring the variables to be used in PI calculations
		double pi = 0;
		double userIteration = 0;
		double numIteration = 1;
		double divisor = 1;
		
		//declaring the scanner to read in the userIterations
		Scanner reader = new Scanner(System.in);
		
		//prompting the user meaningfully to input iterations they want to calculate PI with
		System.out.print("Please select how many iterations you want to use to estimate PI to: ");
		userIteration = reader.nextDouble();
		
		//The while loop executes while the iterations are less than or equal to the user input
		while(numIteration <= userIteration){
			//if odd iteration, then the fraction is added to the PI variable
			if(numIteration % 2 == 1){
				pi = pi + 1 / divisor;	
			}
			
			//else (if the iteration is even), the fraction is subtracted from the PI variable
			else{
				pi = pi - 1 / divisor;
			}
			
			//updating the iteration variable to continue the loop condition
			numIteration++;
			
			//updating the divisor variable
			divisor += 2;
		}
		//outputting meaningfully to the user the final PI calculation according to their iterations
		System.out.println("\n\nAccording to your iterations, PI equals: " + pi * 4);
	}

}
//I told him I can't open the JAR, he told me to download and install JAVA......
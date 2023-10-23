//Blake Raphael
//PythagTrip.java
//The purpose of this program is to determine the oythagorean triples up to 200

import java.util.*;

public class PythagTrip{
	
	public static void main(String [] args){
		
		int numA = 1;
		int numB = 1;
		int hypotenuse = 1;
		int numTrips = 0;
		
		for(int i = 1; i <= 200; i ++){
			
			for(int j = 1; j <= 200; j ++){
				
				
				for(int k = 1; k <= 200; k ++){
					if(Math.pow(numA, 2) + Math.pow(numB, 2) == Math.pow(hypotenuse, 2)){
						System.out.println(numA + "  " + numB + "  " + hypotenuse);
						numTrips ++;
						
					}
					System.out.println(numTrips);
					hypotenuse ++;
				}
				hypotenuse = 1;
				numB ++;
			}
			
			numB = 1;
			numA++;
			} 
		}
	}
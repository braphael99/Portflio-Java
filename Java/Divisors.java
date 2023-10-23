//Blake Raphael
//Divisors.java
//The purpose of this program is to determine whether a given number is a perfect number or determine its factors

//importing java utilities
import java.util.*;

//creating the Divisors class
public class Divisors{
	
	//initializing main
	public static void main(String [] args){
		
		//declaring and initializing variables
		int userNum = 0;
		int userOption = 0;
		int i = 1;
		int totalSum = 0;
		boolean canDivide;
		
		//declaring the new scanner
		Scanner reader = new Scanner(System.in);
		
		//while loop that outputs the user a menu to manipulate their 
		//number as long as their number doesn't exit the menu
		while(userOption != 5){
			System.out.println("\n\n1.) Enter an Integer");
			System.out.println("2.) Determine the factors of the input number");
			System.out.println("3.) Determine whether the input number is perfect or not");
			System.out.println("4.) Determine the prime numbers below the input number");
			System.out.println("5.) Quit\n\n");
			
			//reading in the user input
			userOption = reader.nextInt();
			
			//if the user option is 1, the user is prompted to enter an integer
			if (userOption == 1){
				System.out.print("\n\nPlease enter a positive integer: ");
				userNum =reader.nextInt();
			}
			
			//if the user option is 2, the factors of the number are printed to the user
			if (userOption == 2){
				
				i = 1;
				
				System.out.print("\n\nThe factors of " + userNum + " are: ");
				
				//usign a while loop to print each number as long as they're divisible by the iteration number
				while (i <= userNum){
					
					canDivide = isDivisible(userNum, i);
					if (canDivide == true){
						System.out.print((userNum / i) + ", ");
					}
					
					i++;
				}

			}
			
			//if the user option is 3, the factors are added to check and see if it is equal
			//to the user's number aka a perfect number
			if (userOption == 3){
				
				i = 1;
				
				System.out.print("\n\nIs " + userNum + " a perfect number?\n\n");
				
					//using a while loop to print out the factors of the user number then add them to the total sum
					while (i <= userNum){
					
					canDivide = isDivisible(userNum, i);
					if (canDivide == true){
						System.out.print((userNum / i) + " + ");
						totalSum = totalSum + userNum / i;
					}
					
					i++;
				}
				
				//here the total sum is compared to the user number. If they are equal, the print out for a perfect number is given,
				//if they are not equal then the print out for a non perfect number is output
					if(userNum == totalSum){
						System.out.print(" = " + userNum + " so it is a perfect number");
					}
					
					else{
						System.out.print(" != " + userNum + "so it is NOT a perfect number");
					}
			}
			
			//user option four gives the user the prime numbers of their number
			if (userOption == 4){
				
				i = 1;
				
				System.out.print("\n\nThe prime numbers below " + userNum + " are: ");
				
				//While loop checks if divisible by 2, if false then the numbers are read out (i) in a meaningful output
				while(i <= userNum){
					
					canDivide = isDivisible(i, 2);
					if(canDivide == false){
						
					System.out.print(i + ", ");
					}
					i++;
				}
				
 			}
				
		}
		
	}
	
	//isDivisble method initialized
	public static boolean isDivisible(int numOne, int numTwo){
		
		//if the first number divided by the second number equals 0 then true is returned. In all other cases, false is returned
		if(numOne % numTwo == 0){
			return true;
		}
		else{
			return false;
		}	
	}
}
//What do we say to the java update? Not today
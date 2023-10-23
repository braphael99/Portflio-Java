//Blake Raphael
//Coins.java
//The purpose of this program is to prompt the user for pennies, nickels, dimes, and quarters and convert them to dollar amount

//importing the java utilities
import java.util.*;

//initializing the Coins public class
public class Coins{
	
	//initializing main
	public static void main(String[] args){
		
		//decalring the pennies, nickels, dimes, and total variables
		double numPennies;
		double numNickels;
		double numDimes;
		double numQuarters;
		double total;
		double totalCent;
		
		//initializing the new scanner to read in the user inputs
		Scanner reader = new Scanner(System.in);
		
		//prompting the user to enter the coins they have
		System.out.println("Please enter how many coins you have: ");
		
		//prompting the user to enter the amount of pennies, nickels, dimes, and quarters they currently have
		System.out.print("Pennies: ");
		numPennies = reader.nextDouble();
		System.out.print("\nNickels: ");
		numNickels = reader.nextDouble();
		System.out.print("\nDimes: ");
		numDimes = reader.nextDouble();
		System.out.print("\nQuarters: ");
		numQuarters = reader.nextDouble();
		
		//converting the whole number of pennies, nickels, dimes, and quarters to their respective decimal dollar amounts
		numPennies = numPennies * 0.01;
		numNickels = numNickels * 0.05;
		numDimes = numDimes *0.1;
		numQuarters = numQuarters * 0.25;
		
		//adding all the decimal dollar amounts of coins together to get to the final total dollar amount
		total = numPennies + numNickels + numDimes + numQuarters;
		
		//rounding the cent portion of the total up and subtracting the whole dollar amount from that
		totalCent = (total - (int)total) * 100;
		
		//meaningfully outputting the dollar and cent total amount
		System.out.println("\n\n\nYour change equals: $" + total);
		
		//meaningfully outputting the dollar and cent amounts indivudually
		System.out.println("\nYour change equals: " + (int)total + " dollar(s) and " + totalCent + " cent(s)");	
	}
}
//RAM: *exists*
//JVM: "It's Free Real Estate"
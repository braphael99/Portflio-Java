//Blake Raphael
//Encryption.java
//The purpose of this program is to encrypt a 4 digit integer

//importing the java utilities
import java.util.*;

//creating the Encryption public class
public class Encryption{
	
	//declaring main
	public static void main(String [] args){
		
		//declaring variables
		int userDigits;
		int divisor = 1000;
		int indivDig;
		int newDigit;
		int firstHalf = 0;
		int lastHalf = 0;
		int lastEncrypt = 0;
		
		//declaring and initializing my scanner
		Scanner reader = new Scanner(System.in);
		
		//Meaningfully prompting the user to input a number
		System.out.print("Please input a 4 digit number to encrypt: ");
		
		//reading in the user input
		userDigits = reader.nextInt();
		
		//printing out the originall number
		System.out.print("\n\nOriginal Number: " + userDigits);
		
		//for loop to seperate, encrypt, then output the number
		for (int i = 0; i <= 3; i++){
			
			//getting the individual digits from the user inputted number
			indivDig = userDigits / divisor;
			userDigits = userDigits % divisor;
			
			//reading in a modified digit as the new digit to be used in the number string
			newDigit = (indivDig + 7) % 10;
			
			//if the loop is on its first or second iteration, the new digits go into the last half of the number string
			if (i == 0 || i == 1){
				lastHalf = lastHalf + (newDigit * divisor);
			}
			
			//if the loop is on its third or fourth loop, the new digits are put into the first half of the number string
			if (i == 2 || i == 3) {
				firstHalf = firstHalf + (newDigit * divisor);
			}
			
			//the lastEncrypt variable hold the first and last half of the string together as one, 4 digit number
			lastEncrypt = (firstHalf * 100) + (lastHalf / 100);
			
			//the divisor is being divided by 10 each loop to get individual numbers for the number string
			divisor = divisor / 10;
		}
		
		//meaningfully outputting the encrypted number that comes from the string
		System.out.print("\n\nEncrypted Number: " + lastEncrypt + "\n\n");
		
	}
}
//Java....is that a hip new coffee joint?
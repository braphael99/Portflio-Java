//Blake Raphael
//BinSen.java
//The purpose of this program is to give the user two methods of searching an array for a key value

import java.util.*;

public class BinSen{
	
	public static void main (String [] args){
		
		//creating a new nums array with 15 spaces for elements 
		int [] nums = new int [15];
		
		//initializing a random value
		int randNum = ((int)(Math.random()* 10)+ 1);
		
		//initializing all variables for the program
		int keyVal, i, binI = 0, foundPos = -1;
		int low = 0;
		int high = nums.length - 1;
		int midpoint = 0;
		
		//initializing a new scanner
		Scanner reader = new Scanner(System.in);

		//for loop to populate the array with multiples of the random number
		for(i = 0; i < nums.length; i++){
			
			nums[i] = randNum * (i + 1);
			
		}
		
		//resetting i to zero
		i = 0;
		
		//reading out the positions of the array using a for-each loop and formatting meaningfully
		System.out.print("Position:\t");
		
		for (int currentNum: nums){
			
			System.out.print(i + "\t");
			i++;
		}
		
		//reading out the values of the array using a for-each loop and formatting meaningfully
		System.out.print("\n\n");
		System.out.print("Value:\t\t");
		
		for(int currentNum : nums){
			
			System.out.print(currentNum + "\t");
			
		}
		
		//prompting the user to enter a key value to search for
		System.out.print("\n\nPlease Enter the Key Value you want to search for: \n");
		keyVal = reader.nextInt();
		
		//using a sequential search to find the position of the key value (if it exists)
		for (i = 0; i < nums.length; i++){
			
			if(nums[i] == keyVal){
				
				foundPos = i;
			}
			
		}
		
		//resetting found position for the binary search
		foundPos = -1;
		
		//using a binary search to search the array for the key value
		while (low <= high && foundPos == -1){
			
			midpoint = (low + high) / 2;
			
			//checking if midpoint element equals the key value
			if (nums[midpoint] == keyVal){
				
				foundPos = midpoint;
				
			}
			
			//checking if midpoint element is less than key value
			else if(nums[midpoint] < keyVal){
				
				low = midpoint + 1;
				
			}
			
			//checking if midpoint element is greater than key value
			else {
				
				high = midpoint - 1;
				
			}
			
			//incrementing the number of comparisons it takes to find the keyValue
			binI++;
			
			
		}
		
		//if found, meaningfully outputting the key value, found postion, and comparisons it took to find the position
		if(foundPos > -1){
				
				System.out.print(keyVal + " was found at position " + foundPos + " using a sequential search. \nIt took " + (foundPos + 1) + " comparisons to find it\n\n");
				System.out.print(keyVal + " was found at position " + foundPos + " using a binary search.\nIt took " + binI + " comparisons to find it\n\n");
				
			}
			
		//else, meaningfully notify the user the key value, that it was not found, and the comparisons it took to find this out
		else{
				System.out.print(keyVal + " was found NOT using a sequential search. \nIt took " + nums.length + " comparisons to determine that\n\n");
				System.out.print(keyVal + " was NOT found using a binary search.\nIt took " + binI + " comparisons to determine that\n\n");
				
		}	
	}
}
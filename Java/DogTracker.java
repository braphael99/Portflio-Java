//Blake Raphael
//DogTracker.java
//The purpose of this program is to model states and behaviors of a dog then manage an array of dogs

import java.util.*;

//dog class
class Dog{
	
	//private instance variables
	private String name;
	private int age, weight, numBarks;
	
	//default dog constructor setting name to null and age, weight, and abrks to 0
	Dog(){
		
		name = null;
		age = weight = numBarks = 0;
	}
	
	//dog constructor that accepts name, age, weight, and barks as parameters
	public Dog(String incName, int incAge, int incWeight, int incNumBarks){
	
			name = incName;
			age = incAge;
			weight = incWeight;
			numBarks = incNumBarks;	
		
	}
	
	//this method returns the dog name
	public String getName(){
		
		return name;
	}
	
	//this method returns the dog weight
	public int getWeight(){
		
		return weight;
	}
	
	//this method returns the dogs age
	public int getAge(){
		
		return age;
	}
	
	//this method returns the number of barks the dog has
	public String getBarks(){
		
		
		
		for(int i = 0; i <= numBarks; i++){
			
			String barks = "bark";
		}
		
		
		return barks;
	}
	
	//this is the toString method that describes all dog data
	public String toString(){
	
		
		return "Dogs name: " + name + " Dogs age: " + age + " Dogs weight: " + weight + " Dogs barks: " + numBarks;
	}
}

//dog tracker application
public class DogTracker{
	
	//main
	public static void main(String [] args){
		
		//creating the dogArray array with a length of 5 dogs
		Dog dogArray[] = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
		
		//setting up the age, weight, user selection, name, and barks variables
		int age, weight, numOfBarks, userSelection;
		String name;
		
		//creating a new scanner
		Scanner reader = new Scanner(System.in);
		
		//setting user selection to 0
		userSelection = 0;
		
		//while loop that acts as the menu for the user
		while (userSelection < 5){
			
			//user menu prompting a user selection
			System.out.print("Please choose a menu option:\n1 - Enter new dog data\n2 - Find a dog\n3 - Insert a new dog\n4 - Delete a dog\n5 - Quit\n");
			userSelection = reader.nextInt();
			
			//selection 1 prompts the user to enter all data for the dogs in the array and then puts them into the array
			if(userSelection == 1){
				
				for(int i = 0; i < dogArray.length; i++){
					
					reader.nextLine();
					System.out.print("\nPlease enter dog " + (i+1) + "'s name: ");
					name = reader.nextLine();
					System.out.print("\nPlease enter dog " + (i+1) + "'s age: ");
					age = reader.nextInt();
					System.out.print("\nPlease enter dog " + (i+1) + "'s weight: ");
					weight = reader.nextInt();
					System.out.print("\nPlease enter dog " + (i+1) + "'s number of barks: ");
					numOfBarks = reader.nextInt();
					
					dogArray[i] = new Dog(name, age, weight, numOfBarks);
				}
			}
		
			//user selection 2 searches for the dog by prompting the user for a name then reporting back if the dog was found
			if(userSelection == 2){
				
				reader.nextLine();
				System.out.print("\nPlease enter the dog's name you are looking for: ");
				name = reader.nextLine();
				
				//for loop that searches the entire array for a dog
				for(int i = 0; i < dogArray.length; i++){
					
					if (name.equalsIgnoreCase(dogArray[i].getName())){
						
						System.out.print(dogArray[i].toString());
					}
				}
						System.out.print("\nThat dog was not found");
					
				
				
			}
			
			//user selection 3 allows the user to insert a dog into the array if there is an open (null) space
			if(userSelection == 3){
				
				
				for(int i = 0; i < dogArray.length; i++){
					
					//prompting user input
					if (dogArray[i] != null){
						
						reader.nextLine();
						System.out.print("\nPlease enter dog " + (i+1) + "'s name: ");
						name = reader.nextLine();
						System.out.print("\nPlease enter dog " + (i+1) + "'s age: ");
						age = reader.nextInt();
						System.out.print("\nPlease enter dog " + (i+1) + "'s weight: ");
						weight = reader.nextInt();
						System.out.print("\nPlease enter dog " + (i+1) + "'s numbe of barks: ");
						numOfBarks = reader.nextInt();
						
						dogArray[i] = new Dog (name, age, weight, numOfBarks);
					}
					
					//notifying the user that no slot is open
					else {
						
						System.out.print("\nSlot Not Open");
					}
				}
				
			}
			
			//user selection 4 prompts the user for a name then deletes the dog 
			if(userSelection == 4){
				
				reader.nextLine();
				System.out.print("\nPlease enter the dog's name you are looking for: ");
				name = reader.nextLine();
				
				
				for(int i = 0; i < dogArray.length; i++){
					
					//deleting the searched for dog
					if (name.equalsIgnoreCase(dogArray[i].getName())){
						
						dogArray[i] = null;
						System.out.print("Deleted");
					}
					
				}	
						//notifying the user that the dog was not found
						System.out.print("\nThat dog was not found");
					
			
		}
	}
}
}

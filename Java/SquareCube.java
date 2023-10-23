//Blake Raphael
//SquareCube.java
//The purpose of this program is to calculate the  squares and cubes of the numbers 0-10

//Creating the SquareCube public class
public class SquareCube{
	
	//initializing main function
	public static void main (String[] args){
		
		//setting up meaningful column headers and spreading them out evenly
		System.out.println("Number\t\tSquare\t\tCube");
		System.out.println("******\t\t******\t\t****");
		
		//using a for loop to iterate up by one until 10 is reached, and declaring i as the variable used for the calculations
		for(int i = 0; i <= 10; i++){
			
			//outputting the original number, squared number, and cubed number under their respective columns
			System.out.println(i + "\t\t\t" + i*i + "\t\t\t" + i*i*i);
		}
	}
}
//Learn Java they said...it'll be fun they said
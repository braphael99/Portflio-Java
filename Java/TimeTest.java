//Blake Raphael
//TimeTest.java
//The purpose of this program is to convert normal time to 24 hr time and vice versa

import java.util.*;

//time convert class
class TimeConvert{
	
	//instance variables for the time convert class
	private int hour, minute;
	private String meridiem;
	
	//derfault constructor for time convert
	public TimeConvert(){
		
		hour = 0;
		minute = 00;
		meridiem = "U";
	}
	
	//time convert constructor that accepts hour and meridiem
	public TimeConvert(int incHour, String incMeridiem){
		
		//setting the instance variables to the incoming parameters
		hour = incHour;
		minute = 00;
		meridiem = incMeridiem;
		
	}
	
	//time convert constructor that accepts minute, hour, and meridiem
	public TimeConvert(int incHour, int incMinute, String incMeridiem){
		
		//setting the instance variables to the incoming parameters
		hour = incHour;
		minute = incMinute;
		meridiem = incMeridiem;
		
	}
	
	//set time constructor that accepts hour, minute, meridiem
	public void setTime(int incHour, int incMinute, String incMeridiem){
		
		//checks if the hour is a valid hour and then sets it to 12 if above 12
		if (incHour <= 12 && incHour >= 1){
			hour = incHour;
		}
		else{
			hour = 12;
		}
		
		//checks if the minutes are valid then sets to 00 if outside the parameters
		if (incMinute <= 59 && incMinute >= 0){
			minute = incMinute;
		}
		else{
			minute = 00;
		}
		
		//checks if the incoming merdiems are valid else sets it to AM if a valid one is not found
		if (incMeridiem.equalsIgnoreCase("AM") == true || incMeridiem.equalsIgnoreCase("PM") == true || incMeridiem.equalsIgnoreCase("U") == true) {
		
			meridiem = incMeridiem;
			
		else{
			meridiem = "AM";
		}
	}
	
	//set hour method that allows the user to set a valid hour between 1 and 12
	public void setHour(int incHour){
		
		if (incHour <= 12 && incHour >= 1){
			hour = incHour;
		}
		else{
			hour = 12;
		}
	}
	
	//set minute method that allows user to set a valid minute from 0 to 59
	public void setMinute(int incMinute){
		
		//cehcks if the incoming minute is valid then sets 00 if not valid
		if (incMinute <= 59 && incMinute >= 0){
			minute = incMinute;
		}
		else{
			minute = 00;
		}
	}
	
	//method that sets the meridiem to the incoming meridiem
	public void setMeridiem(String incMeridiem){
		
			meridiem = incMeridiem;
		
	}
	
	//method that returns the hour to main
	public int getHour(){
		
		return hour;
	}
	
	//method that returns the minutes to main
	public int getMinute(){
		
		return minute;
	}
	
	//method that returns the meridiem to main
	public String getMeridiem(){
		
		return meridiem;
	}
	
	//method that sets the time to universal
	public String toUniversalString(){
		
		//checks if AM or PM then checks if PM to add 12 hours and a universal meridiem
		if (meridiem.equalsIgnoreCase("AM") || meridiem.equalsIgnoreCase("PM") ){
			
			if (meridiem.equalsIgnoreCase("PM")){
				
				hour = hour + 12;
				meridiem = "U";
				
			}
		}
		
		//if the meridiem is U or not present, then is set to U
		if (meridiem.equalsIgnoreCase("U") || meridiem == null){
			
			meridiem = "U";
			
		}
		
		//last check to set the meridiem to U
		meridiem = "U";
		
		//returning a concatenated string to main
		return hour + ":" + minute + " " + meridiem;
	}
	
	//method to set the time back to Standard
	public String toStandardString(){
		
		//checks the meridiem	
		if (meridiem.equalsIgnoreCase("U") || meridiem == null){
			
			//if the hour is greater than 13 then the convert knows to set to PM
			if (hour >= 13){
				
				//subtracting the hours to return back to 12 hour time then setting the meridiem to AM
				hour = hour - 12;
				meridiem = "PM";
			}
			else{
				
				//setting the meridiem to AM
				meridiem = "AM";
			}
		}
		
		//returning the concatenated string back to main
		return hour + ":" + minute + " " + meridiem;	
	}
}

//time test class
public class TimeTest{
	
	//main method
	public static void main (String [] args){
		
		//setting the variables for main dor hour, minute, user selection, etc.
		int userHour, userMinute, userSelection;
		String userMeridiem;
		String timeOutput;
		String meridiemOutput;
		
		//creating a new scanner
		Scanner reader = new Scanner(System.in);
		
		//instanciating a new time convert object
		TimeConvert myTime;
		
		//prompting the user to choose how they would like to create the new time object
		System.out.print("Please select if you would like to enter your time with  1 - hours and meridiem or 2 - hours, minutes, and meridiem: ");
		userSelection = reader.nextInt();
		
		//selection 1
		if (userSelection == 1){
			
			//prompting the user to enter hours and meridiem then creating the new time convert object
			System.out.print("\n\nPlease enter your hours: ");
			userHour = reader.nextInt();
			System.out.print("\n\nPlease enter your meridiem EX: AM, PM, U: ");
			reader.nextLine();
			userMeridiem = reader.nextLine();
			myTime = new TimeConvert(userHour, userMeridiem);
		}
		
		//selection 2
		else if (userSelection == 2){
			
			//promtping the user for hour, minute, and meridiem then creating a new time convert object that takes all of these parameters
			System.out.print("\n\nPlease enter your hours: ");
			userHour = reader.nextInt();
			System.out.print("\n\nPlease enter your minutes: ");
			userMinute = reader.nextInt();
			System.out.print("\n\nPlease enter your meridiem EX: AM, PM, U: ");
			reader.nextLine();
			userMeridiem = reader.nextLine();
			myTime = new TimeConvert(userHour, userMinute, userMeridiem);
		}
		
		//if the selection is incorrect, then a default time convert is created
		else{
			
			myTime = new TimeConvert();
		}
		
		//resetting the user selection variable
		userSelection = 0;
		
		//while loop that acts as a menu
		while (userSelection < 10){
			
		//promting the user to select how to manipulate the time convert object then taking the input
		System.out.print("\n\nNow please select what you would like to do: ");
		System.out.print("\n1 -  Set the time\n2 - Set the hour\n3 - Set the minute\n4 - Set the meridiem\n5 - Get the hour\n6 - Get the minute\n7 - Get the meridiem\n8 - Change to Universal\n9 - Change to Standard\n10 - Quit\n\n");
		userSelection = reader.nextInt();
		
		//user selction 1 calls the time set method
		if(userSelection == 1){
			
			//prompting the user to enter hours, minutes, and meridiem
			System.out.print("\n\nPlease enter your hours: ");
			userHour = reader.nextInt();
			System.out.print("\n\nPlease enter your minutes: ");
			userMinute = reader.nextInt();
			System.out.print("\n\nPlease enter your meridiem EX: AM, PM, U: ");
			userMeridiem = reader.nextLine();
			reader.nextLine();
			
			//calling the setTime method
			myTime.setTime(userHour, userMinute, userMeridiem);
		}
		
		//user selection 2 calls the set hour method
		if(userSelection == 2){
			
			//prompting the user to enter the hours
			System.out.print("\n\nPlease enter your hours: ");
			userHour = reader.nextInt();
			
			//calling the setHour method
			myTime.setHour(userHour);
		}
		
		//user selection 2 setting the minutes
		if(userSelection == 3){
			
			//prompting the user for their minutes
			System.out.print("\n\nPlease enter your minutes: ");
			userMinute = reader.nextInt();
			
			//calling the setMinute method
			myTime.setMinute(userMinute);
		}
		
		//user selection 4 sets the meridiem
		if(userSelection == 4){
			
			//prompting the user to input their meridiems
			reader.nextLine();
			System.out.print("\n\nPlease enter your meridiem EX: AM, PM, U: ");
			userMeridiem = reader.nextLine();
			
			//calling the setMeridiem method
			myTime.setMeridiem(userMeridiem);
		}
		
		//user selection 5 calls the getHour method
		if(userSelection == 5){
			
			System.out.print("\n\nThe hour is: " + myTime.getHour());
		}
		
		//user selection 6 calls the getMinute method
		if(userSelection == 6){
			System.out.print("\n\nThe minute is: " + myTime.getMinute());
		}
		
		//user selection 7 calls the getMeridiem method
		if(userSelection == 7){
			
			meridiemOutput = myTime.getMeridiem();
			
			System.out.print("\n\nThe meridiem is: " + meridiemOutput);
		}
		
		//user selection 8 calls the toUniversalString method for output to the user
		if(userSelection == 8){
			
			timeOutput = myTime.toUniversalString();
			System.out.print("The time is " + timeOutput);
			
		}
		
		//user selection 9 calls the toStandardString method for output to the user
		if(userSelection == 9){
			
			timeOutput = myTime.toStandardString();
			System.out.print("The time is " + timeOutput);
		}
		}
	}
}
//Blake Raphael
//LibraryTest.java
//The purpose of this program is to model the functions of a library and test the corresponding classes

import java.util.*;

//Book class
class Book{
	
	//instance variables for author and title
	private String author, title;
	
	//default book constructor to set the title and author blank
	Book(){
		
		author = "  ";
		title = "  ";
	}
	
	//Book contructor that accepts author and title as parameters
	public Book(String incAuthor, String incTitle){
		
		author = incAuthor;
		title = incTitle;
		
	}
	
	//book method that reutrns the author of the book
	public String getAuthor(){
		
		return author;
	}
	
	//book method that returns the title of the book
	public String getTitle(){
		
		return title;
	}
	
	//to strong method returns all data of the book
	public String toString(){
		
		return "Book title: " + title + " Book author: " + author;
	}
}

//patron class
class Patron{
	
	//instance variables of name and 3 books
	private String name;
	private Book myBook1;
	private Book myBook2;
	private Book myBook3;
	
	//default contsructor that sets name blank and all books to null
	Patron(){
		
		name = "  ";
		myBook1 = null;
		myBook2 = null;
		myBook3 = null;
	}
	
	//constructor for patron that accepts name as a parameter
	public Patron(String incName){
		
		name = incName;
		myBook1 = null;
		myBook2 = null;
		myBook3 = null;
	}
	
	//method that returns the patron name
	public String getName(){
		
		return name;
	}
	
	//method that checks out books to the patron
	public boolean borrowBook(Book incBook){
		
		//set of if-else if-else statements check the book "slot", if empty then the incoming book is placed into the variable
		//if cannot place a book then false is returned
		if (myBook1 == null){
			myBook1 = new Book(incBook.getTitle(), incBook.getAuthor());
			return true;
		}
		else if (myBook2 == null){
			myBook2 = new Book(incBook.getTitle(), incBook.getAuthor());
			return true;
		}
		else if (myBook3 == null){
			myBook3 = new Book(incBook.getTitle(), incBook.getAuthor());
			return true;
		}
		else{
			return false;
		}
		
		}
		
		//method that allows the patron to return a book and accepts title as a parameter
	public boolean returnBook(String incTitle){
		
		//checks if the book "slot" has a book in it, then returns that book. It also does this for the rest by setting the book to null
		if (myBook1.getTitle().equalsIgnoreCase(incTitle) == true){
			myBook1 = null;
			return true;
		}
		else if (myBook2.getTitle().equalsIgnoreCase(incTitle) == true){
			myBook2 = null;
			return true;
		}
		else if (myBook3.getTitle().equalsIgnoreCase(incTitle) == true){
			myBook3 = null;
			return true;
		}
		else{
			return false;
		}
	}
	
	//this method checks if the patron has books checked out
	public boolean hasBook(String incTitle){
	
		//this set of if-else runs through each book and returns true if they do not equal null, while also checking the inputted title
		if (myBook1.getTitle().equalsIgnoreCase(incTitle) && myBook1 != null){
			return true;
		}
		else if (myBook2.getTitle().equalsIgnoreCase(incTitle) && myBook2 != null){
			return true;
		}
		else if (myBook3.getTitle().equalsIgnoreCase(incTitle) && myBook3 != null){
			return true;
		}
		else{
			return false;
		}	
	}
	
	//the to string method returns the name and all books of the patron
	public String toString(){
		
		return "Name: " + name + " Book 1: " + myBook1 + " Book 2: " + myBook2 + " Book 3: " + myBook3;
	}
}

//library test class
public class LibraryTest{
	
	public static void main(String [] args){
		
		//The creation of three books for main
		Book bookOne = new Book("Ray Bradbury", "Fahrenheit 451");
		Book bookTwo = new Book("George Orwell", "1984");
		Book bookThree = new Book ("Harper Lee", "To Kill a Mockingbird");
		
		//the creation of three patrons for main
		Patron patronOne = new Patron("Marcus");
		Patron patronTwo = new Patron ("Aidan");
		Patron patronThree = new Patron("Blake");
		
		//creating a new scanner for main
		Scanner reader = new Scanner(System.in);
		
		//creating and setting the user selection variable
		int userSelection = 0;
		
		//prompting the user for their choice through the menu
		System.out.print("Please enter a your choice (1 - Borrow a Book, 2 - Return a book, 3 - Check if books are checked out, 4 - Quit): ");
		userSelection = reader.nextInt();
		
		while (userSelection < 4){
			
			//user selection 1 checks out all one book to each patron
			if (userSelection == 1){
				
				patronOne.borrowBook(bookOne);
				patronTwo.borrowBook(bookTwo);
				patronThree.borrowBook(bookThree);
			}
			
			//user selection 2 returns the book that each patron has checked out
			if (userSelection == 2){
				
				if (patronOne.returnBook("Fahrenheit 451") == true){
					System.out.print("/nReturned");
				}
				
				if (patronTwo.returnBook("1984") == true){
					System.out.print("/nReturned");
				}
				
				if (patronThree.returnBook("To Kill a Mockingbird") == true){
					System.out.print("/nReturned");
				}
				
			}
			
			//user selection 3 checks if each user hold their respective books
			if (userSelection == 3){
				
				//3 if-elses check for each patrons book and then returns if they do or do not have the book through an output statement
				if (patronOne.hasBook("Fahrenheit 451") == true){
					
					System.out.print("Patron 1 has a book");
				}
				else{
					
					System.out.print("Patron 1 does not have a book");
				}
				
				if (patronTwo.hasBook("1984") == true){
					
					System.out.print("Patron 2 has a book");
				}
				else{
					
					System.out.print("Patron 2 does not have a book");
				}
				
				if (patronThree.hasBook("To Kill a Mockingbird") == true){
					
					System.out.print("Patron 3 has a book");
				}
				else{
					
					System.out.print("Patron 3 does not have a book");
				}
			}
			
			//the input stream is cleared and the next user selection is read in
			reader.nextLine();
			userSelection = reader.nextInt();
		}
		
		//the toStrings are called for 1 patron and 1 book in main
		System.out.println(bookOne.toString());
		System.out.println(patronOne.toString());
	}
}
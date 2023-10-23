//Blake Raphael
//EmployeeTest.java
//The purpose of this program is to display hierarchical class functions with parent and child classes

import java.util.*;

//employee class
class Employee{
	
	//first name, last name, SSN instance variables
	private String fName, lName;
	private int SSN;
	
	//basic employee constructor
	public Employee(){
		
		fName = lName = " ";
		SSN = 0;
		
	}
	
	//employee constructor that recieves first name, last name, and SSN
	public Employee(String incFName, String incLName, int incSSN){
		
		fName = incFName;
		lName = incLName;
		SSN = incSSN;
		
	}
	
	//getter method for first name
	public String getFName(){
		
		return fName;
		
	}
	
	//getter method for last name
	public String getLName(){
		
		return lName;
		
	}
	
	//getter method for SSN
	public int getSSN(){
		
		return SSN;
		
	}
	
	//setter method for first name
	public void setFName(String incFName){
		
		fName = incFName;
		
	}
	
	//setter method for last name
	public void setLName(String incLName){
		
		lName = incLName;
		
	}
	
	//setter method for Social Security Number 
	public void setSSN(int incSSN){
		
		SSN = incSSN;
	}
	
	//Employee class toString method
	public String toString(){
		
		String str = "First Name: " + fName
					+ "\nLast Name: " + lName
					+ "\nSocial Security Number: " + SSN;
					
		return str;
	}
}

//Salaried employee class that extends employee
class SalariedEmp extends Employee{
	
	//weekly salary instance variable
	private double weeklySal;
	
	//basic constructor class for Salaried employee
	public SalariedEmp(){
		
		//calls the employee basic constructor
		super();
		
		weeklySal = 0.0;
		
	}
	
	//Salaried Employee constructor that accepts  first name, last name, social security, and weekly salary
	public SalariedEmp(String incFName, String incLName, int incSSN, double incWeeklySal){
		
		//calling the Employee constructor
		super(incFName, incLName, incSSN);
		
		weeklySal = incWeeklySal;
		
	}
	
	//getter method for weekly salary
	public double getWeeklySal(){
		
		return weeklySal;
		
	}
	
	//setter for weekly salary
	public void setWeeklySal(double incWeeklySal){
		
		weeklySal = incWeeklySal;
		
	}
	
	//calculate pay method to calculate the weekly pay for the employee
	public double calcPay(){
		
		return weeklySal;
		
	}
	
	//toString for the salaried employee method
	public String toString(){
		
		String str = "First Name: " + getFName()
					+ "\nLast Name: " + getLName()
					+ "\nSocial Security Number: " + getSSN()
					+ "\nWeekly Salary: " + weeklySal;
					
		return str;
		
	}
}

//commission employee extending the employee class
class CommissionEmp extends Employee{
	
	//instance variables for commission rate and weekly sales
	private double comRate;
	private double weeklySales;
	
	//basic constructor for commissioned employees
	public CommissionEmp(){
		
		super();
		
		comRate = 0.0;
		weeklySales = 0;
		
	}
	
	//constructor for commission employee that accepts first name, last name, social security, commission rate, and weekly sales
	public CommissionEmp(String incFName, String incLName, int incSSN, double incComRate, double incWeeklySales) {
		
		super(incFName, incLName, incSSN);
		
		comRate = incComRate;
		weeklySales = incWeeklySales;
		
	}
	
	//getter method for commission rate
	public double getComRate(){
		
		return comRate;
		
	}
	
	//setter method for commission rate
	public void setComRate(double incComRate){
		
		comRate = incComRate;
		
	}
	
	//getter method for weekly sales
	public double getWeeklySales(){
		
		return weeklySales;
		
	}
	
	//setter method for weekly sales
	public void setWeeklySales(double incWeeklySales){
		
		weeklySales = incWeeklySales;
		
	}
	
	//calculated pay method to find weekly sales
	public double calcPay(){
		
		double calculatedPay = weeklySales * comRate;
		
		return calculatedPay;
		
	}
	
	//toString method for commission employee
	public String toString(){
		
		String str = "First Name: " + getFName()
					+ "\nLast Name: " + getLName()
					+ "\nSocial Security Number: " + getSSN()
					+ "\nCommission Rate: " + comRate
					+ "\nWeekly Gross Sales: " + weeklySales;
					
		return str;
		
	}
	
}

//hourly employee class extending the employee class
class HourlyEmp extends Employee{
	
	//instance variabls for hourly wage and hours worked
	private double hourWage;
	private double hoursWork;
	
	//basic constructor for an hourly employee
	public HourlyEmp(){
		
		super();
		
		hourWage = 0.0;
		hoursWork = 0.0;
		
	}
	
	//constructor for hourly employee that accepts first name, last name, SSN, hourly wage, and hours worked
	public HourlyEmp(String incFName, String incLName, int incSSN, double incHourWage, double incHoursWork){
		
		super(incFName, incLName, incSSN);
		
		hourWage = incHourWage;
		hoursWork = incHoursWork;
		
	}
	
	//getter method for hourly wage
	public double getHourWage(){
		
		return hourWage;
		
	}
	
	//setter method for hourly wage
	public void setHourWage(double incHourWage){
		
		hourWage = incHourWage;
		
	}
	
	//getter method for hours worked
	public double getHoursWork(){
		
		return hoursWork;
		
	}
	
	//setter method for hours worked
	public void setHoursWork(double incHoursWork){
		
		hoursWork = incHoursWork;
		
	}
	
	//calculated pay method to calculate weekly pay
	public double calcPay(){
		
		double calculatedPay = hoursWork * hourWage;
		
		return calculatedPay;
		
	}
	
	//toString for the hourly employee
	public String toString(){
		
		String str = "First Name: " + getFName()
					+ "\nLast Name: " + getLName()
					+ "\nSocial Security Number: " + getSSN()
					+ "\nHourly Wage: " + hourWage
					+ "\nHours Worked (per week): " + hoursWork;
					
		return str;
		
	}
	
}

//base plue commission employee class extends the commission employee class
class BasePlusCommissionEmp extends CommissionEmp{
	
	//instance variable for base salary
	private double baseSal;
	
	//basic constructor for base plus commission employees
	public BasePlusCommissionEmp(){
		
		super();
		
		baseSal = 0.0;
		
	}
	
	//constructor for base plus commission employees that accpets first name, last name, commission rate, weekly sales, and base salary
	public BasePlusCommissionEmp(String incFName, String incLName, int incSSN, double incComRate, double incWeeklySales, double incBaseSal){
		
		super(incFName, incLName, incSSN, incComRate, incWeeklySales);
		
		baseSal = incBaseSal;
		
	}
	
	//getter method for base salary
	public double getBaseSal(){
		
		return baseSal;
		
	}
	
	//setter method for base salary
	public void setBaseSal(double incBaseSal){
		
		baseSal = incBaseSal;
		
	}
	
	//calculated pay method to calculate weekly pay
	public double calcPay(){
		
		double calculatedPay = super.calcPay() + baseSal;
		
		return calculatedPay;
		
	}
	
	//toString method for the base plus commission employee
	public String toString(){
		
		String str = "First Name: " + getFName()
					+ "\nLast Name: " + getLName()
					+ "\nSocial Security Number: " + getSSN()
					+ "\nCommission Rate: " + getComRate()
					+ "\nWeekly Gross Sales: " + getWeeklySales()
					+ "\nWeekly Base Salary: " + baseSal;
					
		return str;
		
	}
}

//employee test class
public class EmployeeTest{
	
	//main application
	public static void main(String [] args){
		
		//all the employee basic constructor classes being showcased
		Employee regEmpEmpty = new Employee();
		SalariedEmp salEmpEmpty = new SalariedEmp();
		CommissionEmp comEmpEmpty = new CommissionEmp();
		HourlyEmp hourEmpEmpty = new HourlyEmp();
		BasePlusCommissionEmp basePlusEmpEmpty = new BasePlusCommissionEmp();
		
		//all the employee constructors that accept all incoming data being showcased
		//these employees will have their data modified
		Employee regEmpEx = new Employee("Marcus", "Pestcoe", 123456789);
		SalariedEmp salEmpEx = new SalariedEmp("Aidan", "Michalos", 123466789, 325.0);
		CommissionEmp comEmpEx = new CommissionEmp("Madysen", "Ziemann", 123455678, 0.2, 27);
		HourlyEmp hourEmpEx = new HourlyEmp("Blake", "Raphael", 12344567, 13.50, 20.5);
		BasePlusCommissionEmp basePlusEmpEx = new BasePlusCommissionEmp("Sam", "Peel", 123477890, 0.15, 23, 350.00);
		
		
		//introducing the application with the toString methods
		System.out.print("Welcome to the Employee Database, here are some examples of our capabilities\n\n");
		System.out.print("Here are the toString methods of all our Employees: \n");
		
		//all the employee toStrings from regular employees to base plus commission employees
		System.out.println(regEmpEx + "\n\n");
		
		System.out.println(salEmpEx + "\n\n");
		
		System.out.println(comEmpEx + "\n\n");
		
		System.out.println(hourEmpEx + "\n\n");
		
		System.out.println(basePlusEmpEx + "\n\n");
		
		//showcasing all the getter methods for the employees
		System.out.print("Here are some examples of the methods included in our Employee Classes: \n\n");
		
		//getting first name
		System.out.print("Get First Name Method: " + regEmpEx.getFName() + "\n\n");
		
		//getting last name
		System.out.print("Get Last Name Method: " + salEmpEx.getLName() + "\n\n");
		
		//getting SSN
		System.out.print("Get Social Security Method: " + comEmpEx.getSSN() + "\n\n");
		
		//getting weekly salary
		System.out.print("Get Weekly Salary Method: " + salEmpEx.getWeeklySal() + "\n\n");
		
		//getting hourly wage
		System.out.print("Get Hourly Wage Method: " + hourEmpEx.getHourWage() + "\n\n");
		
		//getting hours worked
		System.out.print("Get Hours Worked Method: " + hourEmpEx.getHoursWork() + "\n\n");
		
		//getting commission rate
		System.out.print("Get Commission Percentage Method: " + comEmpEx.getComRate() + "\n\n");
		
		//getting weekly sales
		System.out.print("Get Weekly Sales Method: " + basePlusEmpEx.getWeeklySales() + "\n\n");
		
		//getting base salary
		System.out.print("Get Base Salary Method: " + basePlusEmpEx.getBaseSal() + "\n\n");
		
		//showcasing the calc pay method
		System.out.print("Calculate Pay Method: " + hourEmpEx.calcPay() + "\n\n");
		
		
		//showcasing and using all the setter methods to modify data from real employees
		System.out.print("Here are some examples of 'Setter' Methods in the classes: \n\n");
		
		//setting first name
		System.out.print("Set First Name to Jeff");
		regEmpEx.setFName("Jeff");
		
		//setting last name
		System.out.print("\n\nSet Last Name to Smith");
		salEmpEx.setLName("Smith");
		
		//setting SSN
		System.out.print("\n\nSet Social Security Number to 345672345");
		hourEmpEx.setSSN(345672345);
		
		//setting weekly salary
		System.out.print("\n\nSet Weekly Salary to 345.00");
		salEmpEx.setWeeklySal(345.00);
		
		//setting hourly wage
		System.out.print("\n\nSet Hourly Wage to 16.75");
		hourEmpEx.setHourWage(16.75);
		
		//setting hours worked
		System.out.print("\n\nSet Hours Worked to 35");
		hourEmpEx.setHoursWork(35);
		
		//setting commission rate
		System.out.print("\n\nSet Commission Percentage to 0.16");
		comEmpEx.setComRate(0.16);
		
		//setting weekly sales
		System.out.print("\n\nSet Weekly Sales to 26");
		comEmpEx.setWeeklySales(26);
		
		//setting base salary
		System.out.print("\n\nSet Base Salary to 225.57");
		basePlusEmpEx.setBaseSal(225.57);
		
	}
}
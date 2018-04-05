
//Christian Brannon, ID: 1593881
//ITSE 2317-5001, 04.05.18
//Assignment: College List - Chapter 10

//College List Program: Main File

/*
 *
 */
 
 import java.lang.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CollegeList
{
	public static void main(String[] args)  throws Exception, InterruptedException
	{
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		int selection;
		String rawInput;
		
		while(!exit)
		{
			CLS();
			System.out.print(
				"\n------Main Menu------\n" +
				"1: Add/View College Employee(s)\n" +
				"2: Add/View Faculty(s)\n" +
				"3: Add/View Student(s)\n" +
				"4: About Program\n" +
				"5: Exit\n" + "\n->");
			rawInput = scanner.nextLine();
			if (tryParseInt(rawInput))
			{
				selection = Integer.parseInt(rawInput);
				switch (selection)
				{ 
					case 1:
						CLS();
						break;
					case 2:
						CLS();
						break;
					case 3:
						CLS();
						break;
					case 4:
						CLS();
						break;
					case 5:
						CLS();
						System.out.print("\nGoodbye!");
						Thread.sleep (2500);
						exit = true;
						break;
					default:
						System.out.print("\nThat was an invalid selection....  Please select again\n");
						Thread.sleep (2500);
						break;
				}
			}
			else
			{
				System.out.print("\nInvalid Input!");
				Thread.sleep (2500);
			}
		}
	}
	
	private static boolean tryParseInt(String value) 
	{  
		try 
		{  
			Integer.parseInt(value);  
			return true;  
		} 
		catch (NumberFormatException e) 
		{  
			return false;  
		}  
	}

	private static void CLS() throws IOException, InterruptedException 
	{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
	
	private class Person
	{
		//
		protected String FirstName = "VOID";
		protected String LastName = "VOID";
		protected String StreetAddress = "VOID";
		protected String ZipCode = "VOID";
		protected String PhoneNumber = "VOID";
		
		//Setters
		public void setFirstName()
		{ 
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter the First Name: ");
			String FirstName = scanner.nextLine();
			setFirstName(FirstName);
		}
		public void setLastName()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter the Last Name: ");
			String LastName = scanner.nextLine();
			setLastName(LastName);
		}
		public void setStreetAddress()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter the Street Address: ");
			String StreetAddress = scanner.nextLine();
			setStreetAddress(StreetAddress);
		}
		public void setZipCode()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter the Zip Code: ");
			String ZipCode = scanner.nextLine();
			setZipCode(ZipCode);
		}
		public void setPhoneNumber()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter the Phone Number: ");
			String PhoneNumber = scanner.nextLine();
			setPhoneNumber(PhoneNumber);
		}
		
		//Setters Overloaded
		public void setFirstName(String FirstName)
		{ this.FirstName = FirstName; }
		public void setLastName(String LastName)
		{ this.LastName = LastName; }
		public void setStreetAddress(String StreetAddress)
		{ this.StreetAddress = StreetAddress; }
		public void setZipCode(String ZipCode)
		{ this.ZipCode = ZipCode; }
		public void setPhoneNumber(String PhoneNumber)
		{ this.PhoneNumber = PhoneNumber; }
		
		//Getters
		public String getFirstName()
		{ return FirstName; }
		public String getLastName()
		{ return LastName; }
		public String getStreetAddress()
		{ return StreetAddress; }
		public String getZipCode()
		{ return ZipCode; }
		public String getPhoneNumber()
		{ return PhoneNumber; }
	
		//Default Constructor
		public void Person()
		{
			this.setFirstName();
			this.setLastName();
			this.setStreetAddress();
			this.setZipCode();
			this.setPhoneNumber();
		}
		
		//Overloaded Constructor
		public void Person(String FirstName, String LastName, String StreetAddress, String ZipCode, String PhoneNumber)
		{
			setFirstName(FirstName);
			setLastName(LastName);
			setStreetAddress(StreetAddress);
			setZipCode(ZipCode);
			setPhoneNumber(PhoneNumber);
		}
		
		//Print Info
		public void Print()
		{
			String Info = "Person";
			System.out.println(
				String.format("%-20s", Info) +
				"\nFirst Name: " + this.FirstName +
				"\nLast Name: " + this.LastName +
				"\nStreet Address: " + this.StreetAddress +
				"\nZip Code: " + this.ZipCode + 
				"\nPhone Number: " + this.PhoneNumber);
		}
	}
	private class CollegeEmployee extends Person
	{
		//
		protected int Social;
		protected double Salary;
		protected String Department;
		
		//Setters Overloaded
		public void setSocial(int Social)
		{ this.Social = Social; }
		public void setSalary(double Salary)
		{ this.Salary = Salary; }
		public void setDepartment(String Department)
		{ this.Department = Department; }
		
		//Getters
		public int getSocial()
		{ return this.Social; }
		public double getSalary()
		{ return this.Salary; }
		public String getDepartment()
		{ return this.Department; }
		
		//Constructor
		public CollegeEmployee()
		{
			//Calling the parent's default constructor here with "super()"
			super();
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please Enter their SSN: ");
			int Social = scanner.nextInt();
			setSocial(Social);
			
			System.out.println("Please Enter their Salary: ");
			double Salary = scanner.nextDouble();
			setSalary(Salary);
			
			System.out.println("Please Enter their Department: ");
			String Department = scanner.nextLine();
			setDepartment(Department);
		}
		
		//Overloaded Constructor
		public CollegeEmployee(String FirstName, String LastName, String StreetAddress, String ZipCode, String PhoneNumber, int Social, double Salary, String Department)
		{
			super.setFirstName(FirstName);
			super.setLastName(LastName);
			super.setStreetAddress(StreetAddress);
			super.setZipCode(ZipCode);
			super.setPhoneNumber(PhoneNumber);
			this.setSocial(Social);
			this.setSalary(Salary);
			this.setDepartment(Department);
		}
		
		//Print Info
		public void Print()
		{
			String Info = "College Employee";
			System.out.println(
				String.format("%-20s", Info) +
				"\nFirst Name: " + this.FirstName +
				"\nLast Name: " + this.LastName +
				"\nStreet Address: " + this.StreetAddress +
				"\nZip Code: " + this.ZipCode + 
				"\nPhone Number: " + this.PhoneNumber +
				"\nSSN: " + this.Social + 
				"\nSalary: " + this.Salary +
				"\nDepartment: " + this.Department);
		}
	}

	private class Faculty extends CollegeEmployee
	{
		private boolean Tenured;
		
		//Setters Overloaded
		public void setTenured(boolean Tenured)
		{ this.Tenured = Tenured; }
		
		//Getters
		public boolean getTenured()
		{ return this.Tenured; }
		
		public Faculty()
		{
			super();
			
		}
		
		public Faculty(String FirstName, String LastName, String StreetAddress, String ZipCode, String PhoneNumber, int Social, double Salary, String Department, boolean Tenured)
		{
			super.setFirstName(FirstName);
			super.setLastName(LastName);
			super.setStreetAddress(StreetAddress);
			super.setZipCode(ZipCode);
			super.setPhoneNumber(PhoneNumber);
			super.setSocial(Social);
			super.setSalary(Salary);
			super.setDepartment(Department);
			
		}
		
		//Print Info
		public void Print()
		{
			String Info = "College Employee";
			System.out.println(
				String.format("%-20s", Info) +
				"\nFirst Name: " + this.FirstName +
				"\nLast Name: " + this.LastName +
				"\nStreet Address: " + this.StreetAddress +
				"\nZip Code: " + this.ZipCode + 
				"\nPhone Number: " + this.PhoneNumber +
				"\nSSN: " + this.Social + 
				"\nSalary: " + this.Salary +
				"\nDepartment: " + this.Department);
		}
	}

	private class Student extends Person
	{
		private String Major;
		private double GPA;
		
	}
}


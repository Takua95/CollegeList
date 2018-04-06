
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
		protected String FirstName = "NULL";
		protected String LastName = "NULL";
		protected String StreetAddress = "NULL";
		protected String ZipCode = "NULL";
		protected String PhoneNumber = "NULL";
		
		//Setters
		public void setFirstName()
		{ 
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter their First Name: ");
			setFirstName(scanner.nextLine());
		}
		public void setLastName()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter their Last Name: ");
			setLastName(scanner.nextLine());
		}
		public void setStreetAddress()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter their Street Address: ");
			setStreetAddress(scanner.nextLine());
		}
		public void setZipCode()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter their Zip Code: ");
			setZipCode(scanner.nextLine());
		}
		public void setPhoneNumber()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter their Phone Number: ");
			setPhoneNumber(scanner.nextLine());
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
			this.setFirstName(FirstName);
			this.setLastName(LastName);
			this.setStreetAddress(StreetAddress);
			this.setZipCode(ZipCode);
			this.setPhoneNumber(PhoneNumber);
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
		protected int Social = 0000000000;
		protected double Salary = 0.00;
		protected String Department = "NULL";
		
		//Setters
		public void setSocial()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter their SSN: ");
			setSocial(scanner.nextInt());
		}
		public void setSalary()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter their Salary: ");
			setSalary(scanner.nextDouble());
		}
		public void setDepartment()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter their Department: ");
			setDepartment(scanner.nextLine());
		}
		
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
			this.setSocial();
			this.setSalary();
			this.setDepartment();
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
		private boolean Tenured = false;
		
		//Setters
		public void setTenured()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nIs He/She Tenured? (Y/n): ");
			if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("yes"))
				this.Tenured = true;
			else if(scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("no"))
				this.Tenured = false;
			else
			{				
				System.out.println("Invalid character");
				this.Tenured = false;
			}
		}
		
		//Setters Overloaded
		public void setTenured(boolean Tenured)
		{ this.Tenured = Tenured; }
		
		//Getters
		public boolean getTenured()
		{ return this.Tenured; }
		
		public Faculty()
		{
			super();
			this.setTenured();
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
			this.setTenured(Tenured);
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
		
		//Setters
		public void setMajor()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter the Student's Major: ");
			setMajor(scanner.nextLine());
		}
		public void setGPA()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter the Student's GPA: ");
			setGPA(scanner.nextLine());
		}
		//Overloaded Setters 
		public void setMajor(String Major)
		{ this.Major = Major; }
		public void setGPA(double GPA)
		{ this.GPA = GPA; }		
		
		//Getters
		public String getMajor()
		{ return Major; }
		public double getGPA()
		{ return GPA; }
		
		//Constructor
		Student()
		{
			super();
			this.setMajor();
			this.setGPA();
		}
		
		//Overloaded Constructor
		Student(String FirstName, String LastName, String StreetAddress, String ZipCode, String PhoneNumber, String Major, double GPA)
		{
			super.setFirstName(FirstName);
			super.setLastName(LastName);
			super.setStreetAddress(StreetAddress);
			super.setZipCode(ZipCode);
			super.setPhoneNumber(PhoneNumber);
			this.setMajor(Major);
			this.setGPA(GPA);
		}
	}
}

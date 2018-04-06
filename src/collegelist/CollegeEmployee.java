/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegelist;

import java.util.Scanner;

class CollegeEmployee extends Person
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
    @Override
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

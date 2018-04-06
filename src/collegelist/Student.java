/*
 *Christian Brannon, ID: 1593881
 *ITSE 2317-5001, 04.05.18
 *Assignment: College List - Chapter 10
 */

//College List Program: Main File

package collegelist;

import java.util.Scanner;

class Student extends Person
{
    private String Major = "NULL";
    private double GPA = 0.0;

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
        setGPA(scanner.nextInt());
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

    @Override
    public void Print()
    {
        String Info = "Student";
        System.out.println(
                String.format("%-20s", Info) +
                "\nFirst Name: " + this.FirstName +
                "\nLast Name: " + this.LastName +
                "\nStreet Address: " + this.StreetAddress +
                "\nZip Code: " + this.ZipCode + 
                "\nPhone Number: " + this.PhoneNumber +
                "\nMajor: " + this.Major + 
                "\nGPA: " + this.GPA);
    }
}
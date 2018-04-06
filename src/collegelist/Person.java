/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegelist;

import java.util.Scanner;

/**
 *
 * @author cabrannon54955
 */
public class Person
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

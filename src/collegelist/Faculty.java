/*
 *Christian Brannon, ID: 1593881
 *ITSE 2317-5001, 04.05.18
 *Assignment: College List - Chapter 10
 */

//College List Program: Main File

package collegelist;

import java.util.Scanner;

class Faculty extends CollegeEmployee
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
    @Override
    public void Print()
    {
        String Info = "Faculty";
        System.out.println(
                String.format("%-20s", Info) +
                "\nFirst Name: " + this.FirstName +
                "\nLast Name: " + this.LastName +
                "\nStreet Address: " + this.StreetAddress +
                "\nZip Code: " + this.ZipCode + 
                "\nPhone Number: " + this.PhoneNumber +
                "\nSSN: " + this.Social + 
                "\nSalary: " + this.Salary +
                "\nDepartment: " + this.Department + 
                "\nTenureship" + this.Tenured);
    }
}
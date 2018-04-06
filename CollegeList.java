//Christian Brannon, ID: 1593881
//ITSE 2317-5001, 04.05.18
//Assignment: College List - Chapter 10

//College List Program: Main File

package collegelist;

import java.lang.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
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
        List<CollegeEmployee> Employees = new ArrayList<CollegeEmployee>();
        int intEmployees = 0;
        Faculty[] FacultyMembers = new Faculty[4];
        int intFacultyMembers = 0;
        Student[] Students = new Student[4];
        int intStudents = 0;
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
                        if (intEmployees == 0)
                        {
                            System.out.println("\nNo Employees, Create One? (Y/n): ");
                            if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("yes"))
                            {
                                //Employees.add(new CollegeEmployee());
                                intEmployees++;
                            }
                            else if(scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("no"))
                            {}
                            else
                                System.out.println("\nInvalid character");
                        }
                        else if (intEmployees < 4)
                        {}
                        else
                            System.out.println("\nCollege Employee Positions are Full.");
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

    public static void About() throws InterruptedException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "");
        scanner.next();
        Thread.sleep (2500);
    }
	
}

/*
 *Christian Brannon, ID: 1593881
 *ITSE 2317-5001, 04.05.18
 *Assignment: College List - Chapter 10
 */

//College List Program: Main File

package collegelist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        List<Faculty> FacultyMembers = new ArrayList<Faculty>();
        int intFacultyMembers = 0;
        List<Student> Students = new ArrayList<Student>();
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
                                Employees.add(new CollegeEmployee());
                                intEmployees++;
                            }
                            else if(scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("no"))
                            {}
                            else
                                System.out.println("\nInvalid character");
                        }
                        else if (intEmployees < 4)
                        {
                            for (int i = 0; i < Employees.size(); i++)
                                Employees.get(i).Print();
                            System.out.println("\nAdd an Employee? (Y/n): ");
                            if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("yes"))
                            {
                                Employees.add(new CollegeEmployee());
                                intEmployees++;
                            }
                            else if(scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("no"))
                            {}
                            else
                                System.out.println("\nInvalid character");
                        }
                        else
                        {
                            for (int i = 0; i < Employees.size(); i++)
                                Employees.get(i).Print();
                            System.out.println("\nCollege Employee Positions are Full.");
                        }
                        break;
                    case 2:
                        CLS();
                        if (intFacultyMembers == 0)
                        {
                            System.out.println("\nNo Faculty Members, Create One? (Y/n): ");
                            if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("yes"))
                            {
                                FacultyMembers.add(new Faculty());
                                intFacultyMembers++;
                            }
                            else if(scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("no"))
                            {}
                            else
                                System.out.println("\nInvalid character");
                        }
                        else if (intFacultyMembers < 3)
                        {
                            for (int i = 0; i < FacultyMembers.size(); i++)
                                FacultyMembers.get(i).Print();
                            System.out.println("\nAdd an Faculty Member? (Y/n): ");
                            if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("yes"))
                            {
                                FacultyMembers.add(new Faculty());
                                intFacultyMembers++;
                            }
                            else if(scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("no"))
                            {}
                            else
                                System.out.println("\nInvalid character");
                        }
                        else
                        {
                            for (int i = 0; i < FacultyMembers.size(); i++)
                                FacultyMembers.get(i).Print();
                            System.out.println("\nFaculty Member Positions are Full.");
                        }
                        break;
                    case 3:
                        CLS();
                        if (intStudents == 0)
                        {
                            System.out.println("\nNo Students, Create One? (Y/n): ");
                            if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("yes"))
                            {
                                Students.add(new Student());
                                intStudents++;
                            }
                            else if(scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("no"))
                            {}
                            else
                                System.out.println("\nInvalid character");
                        }
                        else if (intStudents < 3)
                        {
                            for (int i = 0; i < Students.size(); i++)
                                Students.get(i).Print();
                            System.out.println("\nAdd a Student? (Y/n): ");
                            if(scanner.next().equalsIgnoreCase("y")||scanner.next().equalsIgnoreCase("yes"))
                            {
                                Students.add(new Student());
                                intStudents++;
                            }
                            else if(scanner.next().equalsIgnoreCase("n")||scanner.next().equalsIgnoreCase("no"))
                            {}
                            else
                                System.out.println("\nInvalid character");
                        }
                        else
                        {
                            for (int i = 0; i < Students.size(); i++)
                                Students.get(i).Print();
                            System.out.println("\nStudents are Full.");
                        }
                        break;
                    case 4:
                        CLS();
                        About();
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
        System.out.println("Why aren't you nosy...");
        Thread.sleep (2500);
        System.out.println("Press any key to continue...");
        scanner.next();
    }	
    
}
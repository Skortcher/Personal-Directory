/* Project 1: The Personal Directory

   Description: The Personal Directory contains personal entries
   for the members that consists of undergraduate students, graduate students,
   and faculty/industry mentors/advisors to ease management and communication

   Authors: Ricky Chon, Nick Climaco, ZeJun Ren

   Objectives:
   + Finding personal address book entries
     - Finding entries using first name
     - Finding entries using last name
     - Finding entries using member type (graduate, undergraduate, academic
       mentor, industry mentor)
     - Finding student's entries using mentor's name (given that student has at
       least one mentor)
   + Pinging mentees from a mentor
   + Adding a personal address book entry
   + Editing a personal address book entry
   + Deleting a personal address book entry
   + Setting up quick messaging to members
   + Removing quick messaging setup
*/

import java.io.File;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

//This is the main class
public class PersonalDirectory
{
	private static Scanner sc = new Scanner(System.in);
	private static TextFormat format = new TextFormat();

    public static void main(String[] args) throws InterruptedException, Exception
    {
		mainMenu();
    }

	public static void mainMenu() throws InterruptedException, Exception
	{
		String selection;

		try
		{
			System.out.println("MAIN MENU\n======================================================\n");
			System.out.println("[1] Login");
			System.out.println("[2] Signup");
			System.out.print("Enter your selection: ");
			selection = sc.next();

			switch(selection)
			{
				case "1": format.loading(); login(); break;
				case "2": format.loading(); signup(); break;
				default: throw new Exception();
			}
		}
		catch(Exception e)
		{
			format.wrongSelection();
			mainMenu();
		}
	}

	//Login methods
	public static void login()
	{
		sc.reset();
		System.out.println("LOGIN PAGE\n======================================================\n");
	}

	//Signup methods
	public static void signup() throws InterruptedException, Exception
	{
		sc.reset();
		System.out.println("SIGNUP PAGE\n======================================================\n");

		Account newAccount = new Account();
	}
}

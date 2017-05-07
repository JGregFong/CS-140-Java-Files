//Jonathan Gregory Fong
//CS140
//Project 4
//March 14th, 2015
import java.io.*;
import java.util.*;

public class RockPaperScissors
{

	public static void main(String[] args)
 	{
 	String computer;
 	String user;
 	// Play the game as long as there is a tie.
 	
	do
 	{ 
	// Get the computer's choice.
 	computer = computerChoice();
 
	// Get the user's choice.
 	user = userChoice();
 
	// Determine the winner.
	determineWinner(computer, user);
 
	}while(user.equalsIgnoreCase(computer));

 	// Exit the program.
 	System.exit(0);
 	}


	public static String computerChoice()
	{
	int COM_PICK;
	String COM_CHOICE;
	Random pick = new Random();
	COM_PICK = pick.nextInt(3) + 1;
	
	if (pick.nextInt(3) + 1 == 1)
		COM_CHOICE = "ROCK";
	else if (pick.nextInt(3) + 1 == 2)
		COM_CHOICE = "PAPER";
	else
		COM_CHOICE = "SCISSORS";
	return COM_CHOICE;
	}

	public static String userChoice() 
	{ 
	String answer;
	Scanner keyboard = new Scanner(System.in); 
	System.out.println("----------------------------------");
	System.out.println("Welcome to Rock, Paper, Scissors!");
	System.out.println("----------------------------------");
	System.out.println("1. ROCK");
	System.out.println("2. PAPER");
	System.out.println("3. SCISSORS");
	System.out.println("----------------------------------");
	System.out.println("Choose a weapon number to defeat the computer.");
	System.out.println("Type in either 1, 2, or 3:");

	int number;
	
	number = keyboard.nextInt();
	
	answer = isValidChoice(number);

	return answer;
	}

	public static String isValidChoice(int number)
	{
	String answer = "nothing";
	switch (number)
	{
	case 1:
		answer = "ROCK";
		System.out.println("You have chosen the mighty ROCK.");
		break;
	case 2:
		answer = "PAPER";
		System.out.println("You have chosen the persistent PAPER.");
		break;
	case 3:
		answer = "SCISSORS";
		System.out.println("You have chosen the dicing SCISSORS.");
		break;
	case 1701:
		answer = "ENTERPRISE";
		break;
	default:
		System.out.println("That is not a valid input. Read your instructions, user!");
		break;
	}
	return answer;
	}
	
	public static void determineWinner(String computer, String user)
	{
	
	if (user == "ROCK" && computer == "SCISSORS")
	{ 
		System.out.println("The bulky ROCK smashed the fragile SCISSORS into a hard place!");
		System.out.println("You won!");
	}
	
	else if (user == "ROCK" & computer == "PAPER")
	{
		System.out.println("The formidable form changing PAPER has wrapped the dull ROCK into a sad pinata.");
		System.out.println("A very sad pinata without candy.");
                System.out.println("You lost!");
	}
	
	else if (user == "PAPER" && computer == "ROCK") 
	{
		System.out.println("The wrappable PAPER wrapped the dense ROCK into an unsavory burrito!");
		System.out.println("You won!");
	}
	
        else if (user == "PAPER" && computer == "SCISSORS")
        {
                System.out.println("The tearable terrible PAPER has been made into a snowflake by the dreaded SCISSORS.");
                System.out.println("You lost!");
        }

	else if (user == "SCISSORS" && computer == "PAPER")
	{
		System.out.println("The really really sharp slicing SCISSORS diced the PAPER into little PAPER angels.");
		System.out.println("You won!");
	}
	
	else if (user == "SCISSORS" && computer == "ROCK")
	{
		System.out.println("The dull and useless SCISSORS have been destoyed under the power and might of a fully armed and operational piece of ROCK!");
		System.out.println("You lost!");
	}

	else if (user == "ENTERPRISE")
	{	
		System.out.println("-----------------------------------------------------------");
		System.out.println("I never took the Kobayashi Maru test until now. What do you think of my solution?");
		System.out.println("Spock.");
		System.out.println("I have been, and always shall be, your friend. Live long and prosper.");
		System.out.println("--------------------------------");
		System.out.println("Leonard Nimoy: March 26, 1931 - February 27, 2015");
		System.out.println("He has boldly gone where no man has gone before...");
	}

	else if (user == computer)
	{
		System.out.println("What?!?!?!?! Your " + user + " is against the computer's " + computer + "?!?!?!?!");
		System.out.println("The match has ended in a draw!!!");
		System.out.println("You have to have a rematch to decide the winner!");
	}
	
	else
	{
		System.out.println("Something has gone horribly wrong. There is a crack in the fabric of reality.");
		System.out.println("Due to the unexpected nature of the event, the match has been cancelled.");
		System.out.println("Please call your nearest Time Lord with a Type-40 TARDIS or look for a Police Box for assistance.");
	}
	
	
	}
}

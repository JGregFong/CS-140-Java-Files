//Jonathan Fong
//CS140
//Project 3
//March 1st, 2015
import java.util.*;
import java.text.DecimalFormat;

public class SlotMachineSimulation
{
	public static void main(String [] args)
	{
	//Stated the variables
		char repeat;
		double betAmount;
		double totalBets;
		double winnings;
		double totalWinnings;
		int number1;
		int number2;
		int number3;
		String slot1;
		String slot2;
		String slot3;
		String input;		

	//Created Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		DecimalFormat dollar = new DecimalFormat("#,###.##");	

	//Sets the accumulator for all the values.
		totalBets = 0;
		totalWinnings = 0;
	
	do
	{
	//Requested bet amount.
	
		System.out.println("Welcome to the Slot Machine Simulation.");
		System.out.println("Enter the amount you want to bet: $");

	//Bet amount recorded through keyboard.
		betAmount = keyboard.nextDouble();

	//Creating Random Number Generator for Slots
		Random randomGenerator = new Random();
		number1 = randomGenerator.nextInt(6) + 1;
		number2 = randomGenerator.nextInt(6) + 1;
		number3 = randomGenerator.nextInt(6) + 1;

	//How do you assign each fruit/item with a number?
	//Maybe... I could do without that. Use  charAt to assign each fruit with a number directly without
	//referring to a list.
	// use number.charAt(0) or something
	
	if (number1 == 0)
	{
	slot1 = "Cherries";
	}
	else if (number1 == 1)
	{
	slot1 = "Oranges";
	}
	else if (number1 == 2)
	{
	slot1 = "Plums";
	}
	else if (number1 == 3)
	{
	slot1 = "Bells";
	}
	else if (number1 == 4)
	{
	slot1 = "Melons";
	}
	else 
	{
	slot1 = "Bars";
	}

        if (number2 == 0)
        {
        slot2 = "Cherries";
        }
        else if (number2 == 1)
        { 
        slot2 = "Oranges";
        }
        else if (number2 == 2)
        {       
        slot2 = "Plums";
        }
        else if (number2 == 3)
        {
        slot2 = "Bells";
        }
        else if (number2 == 4)
        {
        slot2 = "Melons";
        }
        else
        {
        slot2 = "Bars";
        }

        if (number3 == 0)
        {
        slot3 = "Cherries";
        }
        else if (number3 == 1)
        { 
        slot3 = "Oranges";
        }
        else if (number3 == 2)
        {       
        slot3 = "Plums";
        }
        else if (number3 == 3)
        {
        slot3 = "Bells";
        }
        else if (number3 == 4)
        {
        slot3 = "Melons";
        }
        else
        {
        slot3 = "Bars";
        }
			
	//Prints out Slot icons in the three slots.

		System.out.println("-[ " + slot1 + " ]--[ " + slot2 + " ]--[ " + slot3 + " ]-");

	//When comparing slots use charAt (recommended) or switch.
	

	//This portion is for calculating the amount won.

	if (number1 == number2 && number2 == number3)
	{
	winnings = 3 * betAmount;
	System.out.println("Awesome! You have three of a kind!");
	System.out.println("Your bet triples!");
	System.out.println(); 
	System.out.println("You win $"+ dollar.format(winnings));
	}

	else if (number1 == number2 && number2 != number3)
	{
	winnings = 2 * betAmount;
	System.out.println("Nice! Two of a kind!");
	System.out.println("Your entered bet doubles!");
	System.out.println();
	System.out.println("You win $"+ dollar.format(winnings));
	}

	else if (number2 == number3 && number1 != number2)
	{
	winnings = 2 * betAmount;
        System.out.println("Nice! Two of a kind!");
        System.out.println("Your entered bet doubles!");
        System.out.println("You win $"+ dollar.format(winnings));
	}

	else if (number1 == number3 && number1 != number2)
	{
        winnings = 2 * betAmount;
        System.out.println("Nice! Two of a kind!");
        System.out.println("Your entered bet doubles!");
        System.out.println("You win $"+ dollar.format(winnings));
	}

	else
	{
	winnings = 0 * betAmount;
	System.out.println("Sorry. None match.");	
	System.out.println("You win $"+ dollar.format(winnings));
	}

	keyboard.nextLine();
	System.out.println("Would you like to play again?");
	System.out.println("Enter Y for yes or N for no: ");
	input = keyboard.nextLine();
	repeat = input.charAt(0);

	totalBets += betAmount;
	totalWinnings += winnings;
	}
	while (repeat == 'y' || repeat == 'Y');
	{
	System.out.println("You bet a total of $" + dollar.format(totalBets));
	System.out.println("You won a total of $" + dollar.format(totalWinnings));
	}
}
}

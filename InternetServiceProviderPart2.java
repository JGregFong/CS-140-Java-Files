//Calculates monthly bill for internet and how much money saved if switched to higher packages.
import java.util.Scanner;

public class InternetServiceProviderPart2
{
	public static void main(String[] args)
	{
		char letter;	// A letter entered by the user
		int hours;
		int extrahrs;
		double charges;
		double saveB;
		double saveC;
		String input;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the customer's package (A, B, or C):");
		input = keyboard.nextLine();
		letter = input.charAt(0);
		letter = Character.toUpperCase(letter);

		switch (letter)
		{
		case 'A':
			System.out.println("You entered A.");
			System.out.println("Enter the number of hours used: ");
			
			hours = keyboard.nextInt();
			
			if (hours > 10)
			{
				extrahrs = hours - 10;
				charges = 9.95 + (2 * extrahrs);
				System.out.println("The charges are $" + charges); 

				saveB = charges - (13.95 + extrahrs);
				System.out.println("With package B, you would have saved $" + saveB);

				saveC = charges - 19.95;
				System.out.println("With package C, you would have saved $" + saveC);
			}	
			else
			{
				charges = 9.95;
				System.out.println("The charges are $" + charges);
			}
			System.exit(0);			
			break;
		case 'B':
			System.out.println("You entered B.");
			System.out.println("Enter the number of hours used: ");
		
			hours = keyboard.nextInt();
		
			if (hours > 20)
			{
				extrahrs = hours - 20;
				charges = 13.95 + (1 * extrahrs);
				System.out.println("The charges are $" + charges);

				saveC = charges - 19.95;
				System.out.println("With package C, you would have saved $" + saveC);
			}
			
			else
			{
				charges = 13.95;
				System.out.println("The charges are $" + charges);
			}
			System.exit(0);
			break;
		case 'C':
			System.out.println("You entered C.");
			System.out.println("Enter the number of hours used: ");
			
			hours = keyboard.nextInt();
			
			System.out.println("The charges are $19.95");
			break;
		default:
			System.out.println("You have not picked a valid package.");
			}
		}
}

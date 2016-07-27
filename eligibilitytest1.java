import java.util.Scanner;
public class eligibilitytest1
{
   public static void main(String[] args)
   {
      	char yninput;
	String input;
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Do you have special permission from the instructor? (Y/N?)");
	input = keyboard.nextLine();
	yninput = input.charAt(0);
	yninput = Character.toUpperCase(yninput);

	switch(yninput)
	{
	case 'Y':
		System.out.println("Congrats. You are eligible for CS140.");
	break;

	case 'N':
		System.out.println("Are you a student of Cal Poly Pomona? (Y/N?)");
		if (yninput == 'Y')
		{
		System.out.println("Have you taken MTH 114? (Y/N?)");
			if (yninput == 'Y')
			{
			System.out.println("Have you received a grade of C or better? (Y/N?)");
				if (yninput == 'Y')
				{
				System.out.println("Congrats. You are eligible for CS140.");
				}
				else if (yninput == 'N')
				{
				System.out.println("I'm sorry. You are not eligible for CS140.");
				}
				else
				{
				System.out.println("You have chosen an invalid answer. Sorry. You have to start over.");
				}
			}
			else if (yninput == 'N')
			{
			System.out.println("I'm sorry. You are not eligible for CS140.");
			}
			else
			{
			System.out.println("You have chosen an invalid answer. Sorry. You have to start over.");
			}
		}
		else
		{
		System.out.println("You have chosen an invalid answer. Sorry. You have to start over.");
		}
	break;
	
	default:
		System.out.println("That's not Y or N. Read the instructions!");
	}

   }
}

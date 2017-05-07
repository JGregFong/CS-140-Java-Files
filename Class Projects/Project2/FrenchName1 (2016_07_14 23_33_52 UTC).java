import java.util.Scanner;
public class FrenchName

{
	public static void main(String [] args)	
	{
	
		String masculine = "le";
		String feminine = "la";
		String plural = "les";
		String vowel = " l' "; 
		String input;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Country Name:");
	
		input = keyboard.nextString();
	
	
	switch (input)
	{
		case "Etats-Unis":
			System.out.println(plural + " " + input);
		break;
		case "Pays-Bas":
			System.out.println(plural + " " + input);
		break;
	}
	
if (input == "Belize")
	System.out.println(masculine + " " + input);
else if (input == "Cambodge")
	System.out.println(masculine + " " + input);
else if (input == "Mexique")
	System.out.println(masculine + " " + input);	
else if (input == "Mozambique")
	System.out.println(masculine + " " + input);
else if (input == "Zaire")
	System.out.println(masculine + " " + input);
else if (input == "Zimbabwe")
		System.out.println(masculine + " " + input);
else
	
{
	
	if (input.charAt(0)= "A" || input.charAt(0)= "E" || input.charAt(0)= "I" || input.charAt(0)= "O" || 
input.charAt(0)= "U")
	{
		System.out.println(vowel + " " + input);
	}
	else if (input.charAt.length()-1= "e")
	{
		System.out.println(feminine + " " + input);
	}
	else 
	{	
		System.out.println(masculine + " " + input);
	}
	}
	}
	}


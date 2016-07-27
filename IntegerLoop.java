import java.util.Scanner;

public class IntegerLoop
{
	public static void main(String[] args)
	{
	int smallest;
	int largest;
	int repeat;
	int input;
	Scanner keyboard = new Scanner(System.in);

	System.out.println("Enter an integer, or -99 to quit:");
	input = keyboard.nextInt();
	
	for (input > 0 || input <0)
	{
		do
		{
		largest = input;
		smallest = input;
		System.out.println("Enter an integer, or -99 to quit:");
		input = keyboard.nextInt();
		repeat = keyboard.nextInt();
		}
		
		while (input != -99 || repeat == input);  
		{
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
		}
	}
}
}


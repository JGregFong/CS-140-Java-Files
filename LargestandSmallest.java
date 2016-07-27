import java.util.Scanner;

public class LargestandSmallest
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
	largest = input;
	smallest = input;
	
	while (input != -99)
	{
		if ( input > largest)
		{
		largest = input;
		}
		
		if (input < smallest)
		{
		smallest = input;
		}
	System.out.println("Enter an integer, or -99 to quit:");	
	input = keyboard.nextInt();
	}
  
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
		
	}

}


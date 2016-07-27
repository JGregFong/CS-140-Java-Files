import java.util.Scanner;

public class Population
{
	public static void main(String[] args)
	{
	double startnum;
	double multiplier;
	double organisms;
	int days;

	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter the starting number of organisms:");
	startnum = keyboard.nextDouble();

	while (startnum < 2)
	{
		System.out.println("Invalid. Must be at least 2.");
		System.out.println("Re-enter:");
		startnum = keyboard.nextDouble();
	}
	
	System.out.println("Enter the daily increase:");
	multiplier = keyboard.nextDouble();

	while (multiplier <0)
	{
		System.out.println("Invalid. Enter a non-negative number:");
		multiplier = keyboard.nextDouble();
	}

	System.out.println("Enter the number of days the organisms multiply:");
	days = keyboard.nextInt();
	
	while (days < 1)
	{
		System.out.println("There must be at least one day entered.");
		System.out.println("Re-enter:");
		days = keyboard.nextInt();
	}

	organisms = startnum;

	System.out.println("Day\t\tOrganisms");
	System.out.println("----------------------------");

	for (int i = 1; i <= days; i++)
	{
	System.out.println( i + "\t\t" + organisms);
	organisms += (organisms * multiplier);
	}

}
}
	

import java.util.Scanner;

public class MeterConversion
{

	public static void main(String [] args)
	{
	Scanner keyboard = new Scanner(System.in);
	double meters = 0;
	int number;


	System.out.println("Enter a distance in meters:");
	meters = keyboard.nextDouble();
	
	
		while (meters <=0)
		{	
		System.out.println("Please enter a positive number:");
		meters = keyboard.nextDouble();
		}

	do
	{
	System.out.println("Enter your choice:");
	System.out.println("1. Convert to kilometers");
	System.out.println("2. Convert to inches");
	System.out.println("3. Convert to feet");
	System.out.println("4. Quit the program");
	
	number = keyboard.nextInt();

	
		switch (number)
		{
			case 1:
			{
			kilometer(meters);
			break;
			}
			case 2:
			{
			inches(meters);
			break;
			}
			case 3:
			{
			feet(meters);
			break;
			}
			case 4:
			{
			System.out.println("Bye! I hope you enjoyed converting meters!");
			break;
			}
			default:
			{
			System.out.println("Invalid selection.");
			}
		}
	
	}
	
	while (number != 4);
	
	}

	public static Double kilometer(double unit)
	{
	double result;
	
	result = unit * 0.001;
	System.out.println(unit + " meters is " + result + " kilometers.");
	return result;
	}

	public static Double inches(double unit)
	{
	double result;
	
	result = unit * 39.37;
	System.out.println(unit + " meters is "+ result + " inches.");
	return result;
	}

	public static Double feet(double unit)
	{
	double result;
	
	result = unit * 3.281;
	System.out.println(unit + " meters is "+ result + " feet.");
	return result;
	}
}

import java.util.Scanner;
import java.io.*;

public class ScoreResultTransfer
{
	public static void main(String []args) throws IOException
	{
	String inputFile;
	String outputFile;
	double highest = 0;
	double lowest = 100;
	double total = 0;
	double number;
	double average = 0;
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter filename for the score list: ");
	inputFile = keyboard.nextLine();

	File file = new File(inputFile);
	Scanner input = new Scanner(file);

	System.out.println("Enter a file name to store the results: ");
	
	outputFile = keyboard.nextLine();
	
	number = input.nextDouble();

	while (input.hasNext())
	{
	
	if (number >=0)
	{
		if (number > highest)
			highest = number;
		if (number < lowest)
			lowest = number;
	      	for (int i = 0; i <= input.nextDouble(); i++)
                {
                total += number;
                average = total / i;
                }
	}
	}
	PrintWriter output = new PrintWriter(outputFile);
	if (total >= 0)
	{
	System.out.println("Total: " + total);
	System.out.println("Average: " + average);
	System.out.println("Highest: " + highest);
	System.out.println("Lowest: " + lowest);
	}
	else
	{
	System.out.println("No valid scores recorded.");
	}
	
	input.close();
	output.close();
	}
}	


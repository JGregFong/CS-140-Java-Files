import java.util.Scanner;
import java.io.*;

public class ReadWriteFiles
{
	public static void main(String[] args) throws IOException
	{
	String input;
	String output;
	Scanner keyboard = new Scanner(System.in);
	
	// Gets first filename.
	System.out.print("Enter the input filename: ");
	String infilename = keyboard.nextLine();
	
	System.out.print("Enter the output filename: ");
	String outfilename = keyboard.nextLine();

	File file = new File(infilename);
	Scanner inputFile = new Scanner(file);
	
        PrintWriter outputFile = new PrintWriter(outfilename);

	while (inputFile.hasNext())
		{
		input = inputFile.nextLine();
		output = input.toUpperCase();
		outputFile.println(output);
		}

	inputFile.close();	
	outputFile.close();
	System.out.println("Data written to the file.");

	}

}

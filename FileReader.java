import java.util.Scanner;
import java.io.*;

public class FileReader
{
	public static void main(String[] args) throws IOException
	{
	int i = 1;
	Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter the filename: ");	
	String filename = keyboard.nextLine();

	File file = new File(filename);
	Scanner inputFile = new Scanner(file);

	while (inputFile.hasNext())	
		{
		
		filename = inputFile.nextLine();
		
		System.out.println(i +": " + filename);
		i++;
		}

	inputFile.close();
	
	}
}
	

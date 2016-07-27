import java.util.Scanner;
import java.io.*;


public class GradeEvaluation
{

	public static void main(String [] args) throws IOException
	{
		String filename;
		String grade;
		double score;
		double sum = 0;
		double average;
		int i;
		
		

		System.out.println("Enter the name of the grades file: ");
		Scanner keyboard = new Scanner(System.in);
		filename = keyboard.nextLine();
		File file = new File(filename);
		Scanner input = new Scanner(file);

		for(i = 1; input.hasNext(); i++)
		{
		score = input.nextDouble();
		grade = determineGrade(score);
		System.out.println(score + " " + grade);
		sum += score;
		}
		average = calcAverage(sum);
		
		System.out.println("The average is " + average + ".");		
		
	}
	

	public static String determineGrade(double number)
	{
		String letterGrade;
	
	if (number >= 100)
		letterGrade = "A";
	else if (number >= 89)
		letterGrade = "B";
	else if (number >= 79)
		letterGrade = "C";
	else if (number >= 69)
		letterGrade = "D";
	else if (number >= 0)
		letterGrade = "F";
	else
		letterGrade = "Grade is invalid as a negative number.";

	return letterGrade;

	}
		
	public static Double calcAverage(double total)
	{
		double averageTotal = total / 5;
		return averageTotal;
	}

	
}

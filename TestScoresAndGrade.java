//Determines average score out of 3 tests and gives letter grade.

import javax.swing.JOptionPane; 
import java.util.*;


public class TestScoresAndGrade
{
	public static void main(String[] args)
	{
		double score1;
		double score2;
		double score3;
		double average;
		String imput;

			Scanner keyboard = new Scanner(System.in);
	
		
		System.out.println("Enter test score #1:");
		score1 = keyboard.nextDouble();

		
		System.out.println("Enter test score #2:");
		score2 = keyboard.nextDouble();


		System.out.println("Enter test score #3:");
		score3 = keyboard.nextDouble();

		average = (score1 + score2 + score3) / 3.0;

		System.out.println("Average Score: " + average);

		if (average <60)
			System.out.println("Letter grade: F.");
		else if (average <70)
			System.out.println("Letter grade: D.");
		else if (average <80)
			System.out.println("Letter grade: C.");
		else if (average <90)
			System.out.println("Letter grade: B.");
		else 
			System.out.println("Letter grade: A.");


		System.exit(0);
	}
}

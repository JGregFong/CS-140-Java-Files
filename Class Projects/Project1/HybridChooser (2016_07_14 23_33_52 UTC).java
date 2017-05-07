//This program helps a person to decide whether to buy a hybrid car.
//Jonathan Gregory Fong
//CS140
//Project 1
//January 21st, 2015

import java.util.*;

   public class HybridChooser
{
	public static void main(String[] args)
	{
		double NewCarCost; 	//What is the cost of the car? Variable.
		double MPY;		//Estimated Miles Driven Per Year.
		double CoG;		//Estimated Cost of Gas Per Gallon.
		double MPG;		//Miles Per Gallon for car.
		double Resale;		//Resale value of car after 5 years.
		double owning;		//Total Cost of Ownership.
		double FiveYrGasCost; 	//Cost of Five Years of Gas Consumption.
		String input;		//To hold the user's input.

			Scanner keyboard = new Scanner(System.in); 
		
		//Get the CarCost.
		System.out.println("What was the cost of the car?");
		NewCarCost = keyboard.nextDouble();
		
		//Get Miles Driven Per Year
		System.out.println("How many miles per year will you drive the car?");
		MPY = keyboard.nextDouble();
	
		//Get the Cost of Gas Per Gallon.
		System.out.println("What is the cost of a gallon of gas?");
		CoG = keyboard.nextDouble();

		//Get the Miles Per Gallon
		System.out.println("How many miles per gallon does the car average?");
		MPG = keyboard.nextDouble();

		//Get the Resale Value of the Car.
		System.out.println("What was the resale value of the car after five years?");
		Resale = keyboard.nextDouble();

		//Calculate the total cost of ownership of the hybrid car.
			//Calculating cost of gas for 5 years.
			FiveYrGasCost = (MPY / MPG) * (CoG * 5);
			//Calculating cost of New Car minus (5yr Gas Cost + resale)
			owning = NewCarCost + FiveYrGasCost - Resale;

		System.out.println("The Total Cost of Ownership is " + owning);
	

 
	System.exit(0);
	}
}

//Jonathan Gregory Fong
//CS140
//Project 1
//January 21st, 2015
import java.util.*;



public class GiveChange
{
	public static void main(String[] args)
	{
	short amountdue; 	//The amount needed in pennies.
	short amountrecieved;	//The amount received in pennies.
	int dollars;
	int quarters;
	int dimes;
	int nickels;
	int pennies;
	int change;
	String input;

		
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Enter the amount due in pennies: ");
	amountdue = keyboard.nextShort();

		System.out.println("Enter the amount recieved in pennies: ");
	amountrecieved = keyboard.nextShort();

	change = amountrecieved - amountdue;
		System.out.println("Give the following change:");

		
	dollars = change / 100;
		System.out.println("Dollars: " + dollars);
	
	quarters = (change - (dollars * 100)) / 25;
		System.out.println("Quarters: " + quarters);
	
	dimes = (change - ((dollars * 100) + (quarters * 25))) / 10;
		System.out.println("Dimes: " + dimes);
	
	nickels = (change - ((dollars * 100) + (quarters * 25) + (dimes * 10))) / 05;
		System.out.println("Nickels: " + nickels);

	pennies = change - (((dollars * 100) + (quarters * 25) + (dimes * 10) + (nickels * 
5))) / 01; 
		System.out.println("Pennies: " + pennies);

	

	System.exit(0);


	}
}

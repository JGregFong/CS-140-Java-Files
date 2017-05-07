import java.util.Scanner;

public class FrenchName2
{
	public static void main(String[] args) 
	{
	Scanner keyboard = new Scanner(System.in);
	String country = keyboard.next();
	keyboard.close();
	boolean vowel = false;
	boolean plural = false;
	boolean feminine = false;

	System.out.println("Enter country name:");

	char istletter = country.charAt(0);
	if (country.

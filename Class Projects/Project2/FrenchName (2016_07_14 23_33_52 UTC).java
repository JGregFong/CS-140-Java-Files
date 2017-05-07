//Jonathan Gregory Fong
//CS140
//Project 2
//February 7th, 2015
import java.util.Scanner;
public class FrenchName
{
	public static void main(String [] args)
	{
	String male = "le";
	String female = "la";
	String plural = "les";
	String vowel = "l'";
	boolean feminine = false;
	boolean multi = false;
	boolean vowel1 = false;
	System.out.println("Enter country name:");
        Scanner input = new Scanner(System.in);
        String countryname = input.next();
        input.close();

	char firstletter = countryname.charAt(0);
		firstletter = Character.toUpperCase(firstletter);
	
	
	if (countryname.equals("Etats-Unis") || countryname.equals("Pays-Bas"))
                {
		multi = true;
		}
	else if (firstletter == 'A' || firstletter == 'E'
		|| firstletter == 'I' || firstletter == 'O'
		|| firstletter == 'U')
		{
                vowel1 = true;
		}
	else if (!(countryname.equals("Belize") || countryname.equals("Cambodge")
		|| countryname.equals("Mexique") || countryname.equals("Mozambique")
		|| countryname.equals("Zaire") || countryname.equals("Zimbabwe")))
		{
		if (countryname.charAt(countryname.length()-1) == 'e')
		{
		feminine = true;
		}
		}
	
	if (multi)
		countryname = plural + " " + countryname;
	else if (vowel1)
		countryname = vowel + countryname;
	else if (feminine)
		countryname = female + " " + countryname;
	else 
		countryname = male + " " + countryname;
	System.out.println(countryname);
	}
}


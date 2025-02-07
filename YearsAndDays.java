import java.util.Scanner;
class YearsAndDays 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number of Minutes: ");
		long minutes= new Scanner(System.in).nextLong();

		long days=minutes/(60*24);

		long years=minutes/(60*24*365);

		long remmDays=days-(years*365);

		System.out.println(minutes+" minutes is approximately "+years+"years and "+remmDays+"days");
		

	}
}

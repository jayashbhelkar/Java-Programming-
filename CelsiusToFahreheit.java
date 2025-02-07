import java.util.Scanner;
class CelsiusToFahreheit 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double celsius= sc.nextDouble();

		double fahrenheit=(9.0/5)*celsius+32;
		System.out.print(celsius+" Celcius is "+fahrenheit+" Fahrenheit");

	}
}

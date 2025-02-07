import java.util.Scanner;
class PoundsToKilo 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a Number in Pounds:  ");
		float pounds=new Scanner(System.in).nextFloat();

		float converter= pounds*0.454f;

		System.out.println(pounds+" pounds is "+converter+" kilogram");


	}
}

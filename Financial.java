import java.util.Scanner;
class Financial 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the subtotal: ");
		float subtotal=sc.nextFloat();

		System.out.print("Enter the Gratuity Rate: ");
		float gratuityRate=sc.nextFloat();

		float gratuityAmt= (gratuityRate*subtotal)/100;
		float total=subtotal+gratuityRate;
		System.out.println("Gratuity Amount is: "+gratuityAmt);
		System.out.println("Total Bill is: "+total);
		}
}

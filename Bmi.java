import java.util.Scanner;
class Bim
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Weight in Pounds: ");
		float weight=sc.nextFloat();
		System.out.print("Enter Height in Inches: ");
		float height=sc.nextFloat();

		float kilo=weight/0.45359237f;
		float meter=height/0.0254f;

		float bim= kilo/(meter*meter);

		System.out.println("BIM is: "+bim);



	}
}
import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Radius Of Circle:");
		float radius= sc.nextFloat();
		

		float pi=22/7;
		float radiusSquare= radius*radius;
		float ans=pi*radiusSquare;
		System.out.println("AreaOfCircle:"+ans+"cm^2");
	}
}

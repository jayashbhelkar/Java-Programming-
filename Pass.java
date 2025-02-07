import java.util.Scanner;
class Pass
{
	public static void main(String[] args) {
		 
		 Scanner sc= new Scanner(System.in);
		 System.out.print("Enter a 10th Class Marks: ");
		 float marks=sc.nextFloat();

		 float percentage=(marks*100)/600;

		 System.out.println("You Got "+percentage+" %");

		 System.out.println((percentage>=35)?("Your Result Is Pass"):("Your Result Is failed"));

	}
}
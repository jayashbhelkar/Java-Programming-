import java.util.Scanner;
class Pass2
{
	public static void main(String[] args) {
		 
		 Scanner sc= new Scanner(System.in);
		 System.out.print("Enter a 10th Class Marks: ");
		 float marks=sc.nextFloat();

		 float percentage=(marks*100)/600;

		 System.out.println("You Got "+percentage+" %");

		 System.out.println((percentage>=75)?("you got pass in A grade"):
		 	((percentage>=60)?("you got pass in B grade"):
		 		((percentage>=35)?("you got pass in C grade"):("Your Result IS Failed"))));

	}
}
import java.util.Scanner;
class PrimeNum
{
	public static void main(String[] args) {
		
		System.out.print("Enter a Number: ");
		int num= (new Scanner(System.in)).nextInt();

		System.out.println((num==2||num==3||num==5||num==7)?(num+" Num is Prime"):
			((num%2==0||num%3==0||num%5==0||num%7==0)?(num+" Num is Not prime"):(num+" is Prime ")));


	}
}
import java.util.Scanner;
class Product
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a 4 Digit Num: ");
		int num=(new Scanner(System.in)).nextInt();
		int dub= num;
		int product=1;

		int rem= num%10;
		product=product*rem;
		num=num/10;

		rem= num%10;
		product=product*rem;
		num=num/10;
		
		rem= num%10;
		product=product*rem;
		num=num/10;

		rem= num%10;
		product=product*rem;

		System.out.println(" 4 Digits is:  "+dub);

		System.out.println("Product of 4 Digits is:  "+product);
	}
}


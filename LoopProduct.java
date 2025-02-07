import java.util.Scanner;
class LoopProduct{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num= sc.nextInt();
		int product=1;

		while(num>0)
		{
			int rem=num%10;
			product*=rem;
			num/=10;
		}
		System.out.println("The product of Number is: "+product);
	}
}
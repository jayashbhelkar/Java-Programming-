import java.util.Scanner;
class Digit
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Character ");
		char ch=sc.next().charAt(0);

		String a=(ch>=48&&ch<=57)?(ch+" Is An Digit"):(ch+" Is Not An Digit");
		System.out.println(a);
	}
}
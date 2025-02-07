import java.util.Scanner;
class Upper
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char ch= sc.next().charAt(0);

		System.out.println((ch>='a'&&ch<'z')?(ch+" is An Lowercase Alphabhet"):
				((ch>='A'&&ch<='Z')?(ch+" is an Uppercase Alphabhet"):
					((ch>='0'&&ch<='9')?(ch+" is An Digit"):(ch+" is an Special Character"))));
	}
}
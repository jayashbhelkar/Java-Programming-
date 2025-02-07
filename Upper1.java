import java.util.Scanner;
class Upper1
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Character ");
		char ch=sc.next().charAt(0);

		String a=(ch>='A'&&ch<='Z')?(ch+" Is An Uppercase Alphabet"):(ch+" Is Not An Uppercase Alphabet");
		System.out.println(a);
	}
}
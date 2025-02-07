import java.util.Scanner;
class Lower
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Character ");
		char ch=sc.next().charAt(0);

		String a=(ch>='a'&&ch<='z')?(ch+" Is An Lowercase Alphabet"):(ch+" Is Not An Uppercase Alphabet");
		System.out.println(a);
	}
}
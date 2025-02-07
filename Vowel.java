import java.util.Scanner;
class Vowel
{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter A Alphabet: ");
		 char alpha= sc.next().charAt(0);

		 System.out.println((alpha== 'a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u'||alpha== 'A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U')?
		 	(alpha+" Alphabet is Vowel"):(alpha+" Alphabet is Consonant"));
	}
}
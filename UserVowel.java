import java.util.Scanner;
class UserVowel{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name=sc.next().toUpperCase();
		int len=name.length();

		for (int i=0;i<len ;i++ ) {

			char un=name.charAt(i);

			if (un=='A'||un=='E'||un=='I'||un=='O'||un=='U') {

				System.out.print(name.charAt(i)+" Is Vowels In Your Name");
				
			}
			
		}
	}
}
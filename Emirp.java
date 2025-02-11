//An emirp is a prime number that remains a prime when its digits are reversed.
import java.util.Scanner;
class Emirp{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int num=sc.nextInt();
		int cnt1=0;
		int cnt2=0;
		int rev=0;
		for (int i=2;i<num ;i++ ) {

			if(num%i==0)
			{
				cnt1++;
				
			}
		}
		if (cnt1==0) {
			for (int i=num;i>0 ;i/=10 ) {
				rev=rev*10+(i%10);
			}
			
		}
		for (int i=2;i<rev ; i++) {
			if (rev%i==0) {
				cnt2++;
				
			}
			
		}
		if (cnt2==0) {
			System.out.println(num+" Is Emirp Number");
			System.out.println();
			System.out.println(num+" : "+rev);
		}
		else {
			System.out.println(num+" Is Not Emirp Number");
		}
	}
}
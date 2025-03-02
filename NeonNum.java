import java.util.Scanner;
class NeonNum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter The Number: ");
		int num=sc.nextInt();

		int sqr=num*num;
		int sum=0;

		for (int i=sqr;i>0 ;i/=10 ) {
			int rem=i%10;
			sum+=rem;
		}
		if (sum==num) {
			System.out.println(num+" Is Neon Number");
		}
		else{
			System.out.println(num+" Is not a Neon Bumber");
		}
	}
}
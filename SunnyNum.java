import java.util.Scanner;
class SunnyNum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int num=sc.nextInt();
		int num1=num+1;
		boolean flag=false;

		for (int i=1;i<=num1 ;i++ ) {
			if (i*i==num1) {
				flag= true;
			}
			if (i*i>num1) {
				break;
			}
		}
		if (flag) {
			System.out.println(num+" Is Sunny Number");
		}
		else {
			System.out.println(num+" Is Not Sunny Number");
		}
	}
}
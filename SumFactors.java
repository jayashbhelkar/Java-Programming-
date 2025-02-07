import java.util.Scanner;
class SumFactors{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int num=sc.nextInt();
		int sum=0;
		for (int i=2;i<num ;i++ ) {

			if(num%i==0)
			{
				System.out.println(i);
				sum+=i;
			}
			

			
		}
		System.out.println("Sum of Factors is: "+sum);
		
	}
}
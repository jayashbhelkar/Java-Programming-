import java.util.Scanner;
class SumLoop{
	public static void main(String[] args) {
		System.out.print("Enter the Number: ");
		int num=new Scanner(System.in).nextInt();
		int dub=num;
		int evensum=0;
		int oddsum=0;

		while(num>0){
			int rem=num%10;
			
			if (rem%2==0) {
				evensum+=rem;
			}
			if (rem%2!=0) {
				oddsum+=rem;
			}
			
			num/=10;
		}
		System.out.println();
		System.out.println("The Number Is: "+dub);
		System.out.println();
		System.out.println("sum of even num is :"+evensum);
		System.out.println();
		System.out.println("sum of odd num is :"+oddsum);

	}
}
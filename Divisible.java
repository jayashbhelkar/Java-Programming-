import java.util.Scanner;
class Divisible{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num= sc.nextInt();

		System.out.println((num%2==0&&num%5==0)?("HiTowHiFive"):((num%2==0)?("HiTwo"):((num%5==0)?("HiFive"):("  "))));

		
	}
}
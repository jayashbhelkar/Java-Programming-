import java.util.Scanner;
class DuckNum{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter The Number : ");
		String num=sc.next();
		if (num.charAt(0)=='0') {
			System.out.println(num+" Is Not  Buzz Number");
		}
	    else if (num.contains("0")) {
			System.out.println(num+" Is Buzz Number");
		}
		else {
			System.out.println(num+" Is Not  Buzz Number");
		}
	}
}
import java.util.Scanner;
class Calculator
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A First Number: ");
		float num1=sc.nextFloat();
		System.out.print("Enter A Second Number: ");
		float num2=sc.nextFloat();
		System.out.print("Enter An Operator: ");
		char op=sc.next().charAt(0);

		float ans=0f;

		ans=(op=='+')?(num1+num2):
		    ((op=='-')?(num1-num2):
			((op=='*')?(num1*num2):
		    ((op=='/')?(num1/num2):
			((op=='%')?(num1%num2):(0.000001f)))));

		String output=num1+" "+op+" "+num2+" = "+ans;

		if(!(ans==0.000001f)){

			System.out.println(output);
		}
	}
}

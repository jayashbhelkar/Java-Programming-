import java.util.Scanner;
class Currency
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println();
		System.out.println("        CURRENCY CONVERTOR");
		System.out.println();
		System.out.println("Enter the Amount(INR); ");
		float inr=sc.nextFloat();
		System.out.println();

		System.out.println("LIST OF CURRENCY");
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.GBP");
		System.out.println("4.PKR");
		System.out.println("5.AED");
		System.out.println();

		System.out.println("Enter The Currency: ");
		String curr=sc.next().toUpperCase();

		float curryOp=0;


		if(curr.equals("USD")){

			curryOp=inr/86.56f;
		    System.out.println(inr+" INR="+curryOp+" USD");

		}
		else if(curr.equals("EUR")){

			curryOp=inr/90.25f;
		    System.out.println(inr+" INR="+curryOp+" EUR");
		}
		else if(curr.equals("GBP")){

			curryOp=inr/107.651f;
		    System.out.println(inr+" INR="+curryOp+" GBP");
		}
		else if(curr.equals("PKR")){

			curryOp=inr/0.310594f;
		    System.out.println(inr+" INR="+curryOp+" PKR");
		}
		else if(curr.equals("AED")){

			curryOp=inr/23.5685f;
		    System.out.println(inr+" INR="+curryOp+" AED");
		}
		else{
			System.out.println("INVALID OPTION");
		}
	}
}
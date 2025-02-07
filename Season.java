import java.util.Scanner;
class Season
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Month: ");
		String month=sc.next().toUpperCase();

		String season=(month.equals("OCT")||month.equals("NOV")
			||month.equals("DEC")||month.equals("JAN"))?(month+" is Winter Season"):
		     ((month.equals("FEB")||month.equals("MAR")
			||month.equals("APR")||month.equals("MAY"))?(month+" is Summer Season"):
		     ((month.equals("JUN")||month.equals("JUL")
		    ||month.equals("AUG")||month.equals("SEP"))?(month+" is Monsoon Season"):("INVALID Month")));

		System.out.println(season);
	}
}
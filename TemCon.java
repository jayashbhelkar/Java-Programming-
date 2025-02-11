import java.util.Scanner;
class TemCon{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println();
		System.out.println("      TEMPERATURE CONVERTOR");
		System.out.println();
		System.out.print("Enter the Temperature In Celcius: ");
		float temC=sc.nextFloat();
		System.out.println();
		System.out.println("TEMPERATURE UNITS");
		System.out.println();
		System.out.println("1.FAHRENHEIT");
		System.out.println("2.KELVIN");
		System.out.println("3.RANKINE");
		System.out.println("4.REAUMUR");
		System.out.println();
		System.out.println("CHOOSE THE OPTION");
		int num=sc.nextInt();
		System.out.println();

		switch(num){

		case 1: 
			System.out.println(temC+" Degree Celcius IS :"+((temC*(9/5))+32)+" Fahrenheit");
			break;
		case 2: 
			System.out.println(temC+" Degree Celcius IS :"+(temC+273.15)+" Kelvin");
			break;
		case 3: 
			System.out.println(temC+" Degree Celcius IS :"+((temC*(9/5))+491.67)+" Rankine");
			break;
		case 4: 
			System.out.println(temC+" Degree Celcius IS :"+(temC*4/5)+" Reaumur");
			break;
		}
	}
}
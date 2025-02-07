import java.util.Scanner;
class Table{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter The Number: ");
		int num=sc.nextInt();
		
		System.out.print("Enter The Range: ");
		int range=sc.nextInt();

		for (int i=1;i<=range ;i++ ) 
		{
			System.out.println(num+"x"+i+"="+(num*i));
			
		}

	}
}
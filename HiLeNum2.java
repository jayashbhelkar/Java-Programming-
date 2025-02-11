//Find Least Repeting Digit
import java.util.Scanner;
class HiLeNum2{
	public static void main(String[] args) {
		System.out.print("Enter The Number: ");
		long num=new Scanner(System.in).nextLong();
		int dgt=0;
		int min=9;

		for (int i=0;i<=9 ;i++ ) 
		{
			int cnt=0;
			for (long j=num;j>0 ;j/=10 ) 
			{
				long rem=j%10;
				if (i==rem) 
				{
					cnt++;
					
				}
				
			}
			if (cnt!=0) 
			{
				
				if (min>cnt) 
				{
					min=cnt;
					dgt=i;
				}
			}
			
		}
		System.out.println("Least Reapeting Digit Is "+dgt+" With A Frequancy Of "+min);
	}
}
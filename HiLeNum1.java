//Find The Max Repeting Digit
import java.util.Scanner;
class HiLeNum1{
	public static void main(String[] args) {
		System.out.print("Enter The Number: ");
		long num=new Scanner(System.in).nextLong();
		int dgt=0;
		int max=0;
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
				if (max<cnt) 
				{
					max=cnt;
					dgt=i;
				}
				
			}
			
		}
		System.out.println("Max Reapeting Is "+dgt+" With A Frequancy Of "+max);
	}
}
import java.util.Scanner;
class FrequencyOfNumber{
	public static void main(String[] args) {
		System.out.print("Enter The Number: ");
		long num=new Scanner(System.in).nextLong();

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
				System.out.println(i+" : "+cnt);
				
			}
			
		}
	}
}
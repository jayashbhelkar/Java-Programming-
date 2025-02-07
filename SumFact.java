class SumFact{
	public static void main(String[] args) {
		int num=1111;
		int dub=num;
		int sum=0;

		while(num>0)
		{
			int rem=num%10;
			int fact=1;
			for (int i=rem;i>0 ;i-- )
			{
				fact*=i;
			}
		
			sum+=fact;
			num/=10;
		}
		System.out.println(dub);
		System.out.println("Sum of Factorial of Even Digit is: "+sum);

	}
}
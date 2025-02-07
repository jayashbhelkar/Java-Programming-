class AddDigit 
{
	public static void main(String[] args) 
	{
		int num= 1234;
		int dub= num;
		int sum=0;

		int rem= num%10;
		sum=sum+rem;
		num=num/10;

		rem= num%10;
		sum=sum+rem;
		num=num/10;
		
		rem= num%10;
		sum=sum+rem;
		num=num/10;

		rem= num%10;
		sum=sum+rem;

		System.out.println(" 4 Digits is:  "+dub);

		System.out.println("Addition of 4 Digits is:  "+sum);
	}
}

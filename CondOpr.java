class CondOpr 
{
	public static void main(String[] args) 
	{
		int a=24;
		int b=2;
		int c=44;
             //operand1     operand2      operand2
		int larg=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		int small=(a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		System.out.println("Largest num is: "+larg);
		System.out.println("Smallest num is: "+small);
		
	}
}

class TechNum{
	public static void main(String[] args) {
		int num=2025 , len=0 , div=1;

		for (int i=num;i>0 ;i/=10 ) {
			len++;
		}
		if (len%2==0) 
		{
			for (int i=1;i<=(len/2) ;i++ ) 
			{
				div*=10;
			}
			int sum=(num/div)+(num%div);
			int sqr=num*num;
			System.out.println(num==sqr?num+" Is A Tech Number":
				num+" Is Not Tech Num");
			
		}
		else {
			System.out.println(num+" Is Not Tech Num");
		}
	}
}